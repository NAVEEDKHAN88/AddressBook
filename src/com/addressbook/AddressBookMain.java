package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static ArrayList<Contacts> arrayList = new ArrayList<>();

    public void addContacts(){


        Contacts contacts = new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of person : ");
        String fname = sc.next();
        contacts.setFirstName(fname);
        System.out.println("Enter the last name of person : ");
        String lname =sc.next();
        contacts.setLastName(lname);
        System.out.println("Enter the state name of person :");
        String address = sc.next();
        contacts.setAddress(address);
        System.out.println("Enter the city name of person : ");
        String city = sc.next();
        contacts.setCity(city);
        System.out.println("Enter the zip code of person : ");
        int zip = sc.nextInt();
        contacts.setZip(zip);
        System.out.println("Enter the phone number of person : ");
        long phonenumber = sc.nextLong();
        contacts.setPhoneNumber(phonenumber);
        System.out.println("Enter the email of the person");
        String email = sc.next();
        contacts.setEmail(email);
        sc.close();

        arrayList.add(contacts);
        System.out.println(arrayList);

    }
    public static void main(String[] args) {
        System.out.println(" ------------- WelCome To AddressBook -------------------");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContacts();

    }
}

