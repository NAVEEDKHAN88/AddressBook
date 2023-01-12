package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static ArrayList<Contacts> arrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addContacts() {


        Contacts contacts = new Contacts();
        System.out.println("Enter the first name of person : ");
        String fname = sc.next();
        contacts.setFirstName(fname);
        System.out.println("Enter the last name of person : ");
        String lname = sc.next();
        contacts.setLastName(lname);
        System.out.println("Enter the Address of person :");
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
        arrayList.add(contacts);
        System.out.println(arrayList);

    }

    public void editDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String name = sc.next();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFirstName().equals(name)) {

                System.out.println("Select form below to change: ");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter first name");
                        arrayList.get(i).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter Last name");
                        arrayList.get(i).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter address");
                        arrayList.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter city");
                        arrayList.get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter email");
                        arrayList.get(i).setEmail(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip");
                        arrayList.get(i).setZip(sc.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter phone number");
                        arrayList.get(i).setPhoneNumber(sc.nextInt());
                        break;
                    default:
                        break;
                }
                System.out.println(arrayList);
            }else {
                System.out.println("Enter Valid First Name");
            }
        }
    }

    public void deleteDtails(){
        System.out.println("Enter the First Name to delete details");
        String fname = sc.next();
        for(int i=0; i<arrayList.size();i++){
            if(arrayList.get(i).getFirstName().equals(fname)){
                arrayList.remove(i);
                System.out.println("Contact deleted successfully");
            }
        }
        System.out.println(arrayList);
    }
    public static void main (String[]args){
        System.out.println(" ------------- WelCome To AddressBook -------------------");
        int i = 0;
        AddressBookMain addressBookMain = new AddressBookMain();
        while (true) {
            System.out.println("What you want to do: ");
            System.out.println("1.Add details.\n2.Edit details.\n3.Delete Details");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addressBookMain.addContacts();
                    break;
                case 2:
                    addressBookMain.editDetails();
                    break;
                case 3:
                    addressBookMain.deleteDtails();
                    break;
                default:
                    i = 1;
                    System.out.println("Wrong option");
                    System.out.println(arrayList);
                    break;
            }
        }

    }
}

