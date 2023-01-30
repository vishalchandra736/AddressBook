package com.blz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contact contact  = new Contact();
    public void createContact(){
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
    }

    public void displayDetails() {
        System.out.println("First Name : " + contact.getFirstName());
        System.out.println("Last Name : " + contact.getLastName());
        System.out.println("Address : " + contact.getAddress());
        System.out.println("City : " + contact.getCity());
        System.out.println("State : " + contact.getState());
        System.out.println("E-mail : " + contact.getEmail());
        System.out.println("Zip : " + contact.getZipCode());
        System.out.println("Phone Number : " + contact.getPhoneNo());
    }

}