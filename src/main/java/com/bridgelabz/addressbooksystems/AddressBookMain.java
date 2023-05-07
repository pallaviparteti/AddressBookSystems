package com.bridgelabz.addressbooksystems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) throws IOException {

		AddressBookSystem addressBook = new AddressBookSystem();
		Scanner scanner = new Scanner(System.in);

		addressBook.addAddressBook();
		addressBook.addContacts();

		// Writing the address book to a file
		addressBook.writeToFile("AddressBook.txt");

		// Reading the address book from a file
		addressBook.readFromFile("AddressBook.txt");

		// csv file to read
		String csvFile = "C:\\Users\\Dell\\eclipse-workspace\\AddressBookSystems\\src\\main\\java\\com\\bridgelabz\\addressbooksystems\\AddBookCSV.csv";
		addressBook.read(csvFile);

		// csv file to write
		String csvFileToWrite = "C:\\Users\\Dell\\eclipse-workspace\\AddressBookSystems\\src\\main\\java\\com\\bridgelabz\\addressbooksystems\\AddBookCSV.csv";

		String[][] dataToWrite = {
				{"Pallavi","Parteti","Malkapur","Amravati","Maharashtra","444602","2298677","pallavi123@gmail.com"},
				{"Akash","kumar","kawarNagar","sheghat","Bhopal","44423","1234567","akash123@gmail.com"},
				{"Samiksha","Dhabale","tiwasa","Lucknow","UP","234562","1234567","same987@gmail.com"},
				{"kabir","khan","sadar","Banglore","Karnataka","4578677","8765476","asdcvb7654@gmail.com"} };
		addressBook.write(csvFileToWrite, dataToWrite);

		while (true) {
			System.out.println("Enter 1 to add Address Book");
			System.out.println("Enter 2 to display Address Books");
			System.out.println("Enter 3 to open Address Book");
			System.out.println("Enter 4 to add contact");
			System.out.println("Enter 5 to search contacts by city or state");
			System.out.println("Enter 6 to view contacts by city");
			System.out.println("Enter 7 to view contacts by state");
			System.out.println("Enter 8 to search contact numbers in a city or state");
			System.out.println("Enter 9 to sort contacts by name");
			System.out.println("Enter 10 to sort contacts by city");
			System.out.println("Enter 11 to sort contacts by state");
			System.out.println("Enter 12 to sort contacts by zip");
			System.out.println("Enter 13 to display all contacts");
			System.out.println("Enter 14 to edit a contact");
			System.out.println("Enter 15 to delete a contact");
			System.out.println("Enter 17 to exit Address Book");

			System.out.println("Enter 0 to exit");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				System.out.println("Exiting Address Book");
				System.exit(0);
			case 1:
				addressBook.addAddressBook();
				break;
			case 2:
				addressBook.displayAddressBooks();
				break;
			case 3:
				addressBook.openAddressBook();
				break;
			case 4:
				addressBook.addContacts();
				break;
			case 5:
				addressBook.searchContactsByCityOrState();
				break;
			case 6:
				addressBook.viewPersonByCity();
				break;
			case 7:
				addressBook.viewContactsByState();
				break;
			case 8:
				addressBook.searchContactNumbersByCityOrState();
				break;
			case 9:
				addressBook.sortContactsByName();
				break;
			case 10:
				addressBook.sortContactsByCity();
				break;
			case 11:
				addressBook.sortContactsByState();
				break;
			case 12:
				addressBook.sortContactsByZip();
				break;
			case 13:
				addressBook.displayContacts();
				break;
			case 14:
				System.out.println("Enter the first name of the contact to edit:");
				String firstName = scanner.nextLine();
				System.out.println("Enter the last name of the contact to edit:");
				String lastName = scanner.nextLine();
				addressBook.editContact(firstName, lastName);
				break;
			case 15:
				System.out.println("Enter the first name of the contact to delete:");
				String firstName1 = scanner.nextLine();
				System.out.println("Enter the last name of the contact to delete:");
				String lastName1 = scanner.nextLine();
				addressBook.deleteContact(firstName1, lastName1);
				break;
			case 16:
				System.exit(0);
			default:
				System.out.println("Invalid input. Please try again.");
			}
		}
	}
}