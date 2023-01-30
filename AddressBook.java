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
            displayDetails();
            editContact(contact);
    }
    public void displayDetails() {
        System.out.println(contact);
    }
    public void editContact(Contact contact) {
        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("\nWhat would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Phone Number");
            System.out.println("3. Email Id");
            System.out.println("4. Address");
            System.out.print("\nEnter your choice : ");
            choice = scanner.nextInt();

            if (!(choice >=1 && choice <= 4))
                System.out.println("\nInvalid choice!\nPlease try again.\n");
        }

        switch (choice) {
            case 1 :
                System.out.print("Enter the updated First Name :	");
                String firstname = scanner.next();
                System.out.print("Enter the updated Last Name :	");
                String lastname = scanner.next();
                contact.setFirstName(firstname);
                contact.setLastName(lastname);
                break;

            case 2 :
                System.out.print("Enter the updated Phone Number :	");
                int number = scanner.nextInt();
                contact.setPhoneNo(number);
                break;

            case 3 :
                System.out.print("Enter the updated Email Address :	");
                String email = scanner.next();
                contact.setEmail(email);
                break;

            case 4 :
                System.out.print("Enter the updated City :	");
                String city = scanner.next();
                System.out.print("Enter the updated State :	");
                String state = scanner.next();
                System.out.print("Enter the updated zip :	");
                int zip = scanner.nextInt();
                contact.setCity(city);
                contact.setState(state);
                contact.setZipCode(zip);
                break;
        }

        System.out.println("\nIs there anything else you'd like to update?");
        System.out.print("Enter 'Y' or 'N' : ");
        char continueEdit = scanner.next().charAt(0);
        if (continueEdit == 'Y' || continueEdit == 'y') {
            editContact(contact);

        }
        else if (continueEdit == 'N' || continueEdit == 'n') {
            System.out.println("\n\nHere is the updated Address Book.");
            displayDetails();
        }
        else {
            System.out.println("\nInvalid Input.\nPlease try again!");
        }
    }

}

