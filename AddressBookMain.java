package com.blz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        Character ch = 'a';
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Welcome to Address Book program *****");

        while(!ch.equals('q')) {

            System.out.print("\na) Add \nq) Quit \nEnter a character: ");
            ch = scanner.next().charAt(0);

            switch (ch) {
                case 'a':
                    AddressBook addressBook = new AddressBook();
                    addressBook.createContact();
                    System.out.println("Added person's details : ");
                    addressBook.displayDetails();
                    break;

                case 'q':
                    break;

                default:
                    System.out.println("Please enter a valid character");
                    break;

            }
        }

        scanner.close();
    }
}
