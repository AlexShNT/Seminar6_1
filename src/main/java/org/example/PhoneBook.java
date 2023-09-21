package org.example;

import java.util.*;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            HashSet<String> phones = phoneBook.get(name);
            phones.add(phone);
        } else {
            HashSet<String> phones = new HashSet<>();
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }

    public void removePerson(String name) {
        phoneBook.remove(name);
    }

    public void removePhone(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            HashSet<String> phones = phoneBook.get(name);
            phones.remove(phone);
            if (phones.isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    public void printPhoneBook() {
        List<Map.Entry<String, HashSet<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, HashSet<String>>>() {
            @Override
            public int compare(Map.Entry<String, HashSet<String>> o1, Map.Entry<String, HashSet<String>> o2) {
                return Integer.compare(o2.getValue().size(), o1.getValue().size());
            }
        });

        for (Map.Entry<String, HashSet<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

