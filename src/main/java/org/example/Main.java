package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Иванов", "1234567890");
        phoneBook.addPerson("Петров", "9876543210");
        phoneBook.addPerson( "Иванов", "1234567890");
        phoneBook.addPerson("Сидоров", "1111111111");
        phoneBook.addPerson("Иванов", "2222222222");
        phoneBook.addPerson("Петров", "3333333333");
        phoneBook.addPerson("Петров", "5555555555");

        phoneBook.printPhoneBook();
        System.out.println("-".repeat(20));


        phoneBook.addPerson("Петров", "5555555555");
        phoneBook.printPhoneBook();
        System.out.println("-".repeat(20));


        phoneBook.removePerson("Сидоров");
        phoneBook.printPhoneBook();
        System.out.println("-".repeat(20));


        phoneBook.removePhone("Петров", "3333333333");
        phoneBook.printPhoneBook();
    }
}