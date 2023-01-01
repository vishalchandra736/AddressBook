package com.blz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    public void createContact(){
        Contact contact = new Contact();
        System.out.println("Enter the First Name : ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter the Last Name : ");
        contact.setLastName(scanner.next());
        System.out.println("Enter the Address : ");
        contact.setAddress(scanner.next());
        System.out.println("Enter the City : ");
        contact.setCity(scanner.next());
        System.out.println("Enter the State : ");
        contact.setState(scanner.next());
        System.out.println("Enter the Zip-Code : ");
        contact.setZipCode(scanner.nextInt());
        System.out.println("Enter the Phone Number : ");
        contact.setPhoneNo(scanner.nextInt());
        System.out.println("Enter the E-mail : ");
        contact.setEmail(scanner.next());
        System.out.println(contact);
    }
}