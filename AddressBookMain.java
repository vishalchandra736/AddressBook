package com.blz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
    }
}
