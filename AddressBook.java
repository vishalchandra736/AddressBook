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
            update();
    }

    public void update() {
        char input = 'Y';
        System.out.println("Do you want edit anything ('Y' or 'N'): ");
        input = scanner.next().charAt(0);
        if(input == 'y' || input == 'Y') {
            editContact(contact);
        }
        System.out.println("Do you want delete anything ('Y' or 'N') : ");
        input = scanner.next().charAt(0);
        if(input == 'y' || input == 'Y') {
            deleteContact(contact);
        }
    }
    public void displayDetails() {
        System.out.println(contact);
    }
    public void displayDetails(Contact contactDelete) {
        System.out.println(contactDelete);
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
    public void deleteContact(Contact contactDelete) {

        int ch = 0;
        while (ch < 1 || ch > 4) {
            System.out.println("\nWhat would you like to delete?");
            System.out.println("1. Name");
            System.out.println("2. Phone Number");
            System.out.println("3. Email Id");
            System.out.println("4. Address");
            System.out.print("\nEnter your choice : ");
            ch = scanner.nextInt();

            if (!(ch >=1 && ch <= 4))
                System.out.println("\nInvalid choice!\nPlease try again.\n");
        }

        switch (ch) {
            case 1 :
                System.out.print("Name deleted!");
                contactDelete.setFirstName("deleted");
                contactDelete.setLastName("deleted");
                break;

            case 2 :
                System.out.print("Phone number deleted!");
                contactDelete.setPhoneNo(Integer.parseInt("deleted"));
                break;

            case 3 :
                System.out.print("Email deleted!");
                contactDelete.setEmail("deleted");
                break;

            case 4 :
                System.out.print("Address deleted!");

                contactDelete.setCity("deleted");
                contactDelete.setState("deleted");
                contactDelete.setZipCode(Integer.parseInt("deleted"));
                break;
        }
        System.out.println("\nIs there anything else you'd like to delete?");
        System.out.print("Enter 'Y' or 'N' : ");
        char continueEdit = scanner.next().charAt(0);
        if (continueEdit == 'Y' || continueEdit == 'y') {
            deleteContact(contactDelete);

        }
        else if (continueEdit == 'N' || continueEdit == 'n') {
            System.out.println("\n\nHere is the updated Address Book.");
            displayDetails(contactDelete);
        }
        else {
            System.out.println("\nInvalid Input.\nPlease try again!");
        }
    }

}

