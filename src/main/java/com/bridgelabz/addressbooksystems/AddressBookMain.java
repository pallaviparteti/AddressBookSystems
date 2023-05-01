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

class AddressBookMain extends Contacts{

	public static void main(String[] args) throws IOException {
		AddressBookMain writeIntoJsonDemo = new AddressBookMain();
		writeIntoJsonDemo.writeIntoJson();
		writeIntoJsonDemo.readFromJson();
	}

	public void writeIntoJson() throws IOException {
		Gson gson = new Gson();
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\Dell\\eclipse-workspace\\AddressBookSystems\\pallavi.json");


		Contacts contact = new Contacts();
		contact.setFirstName("Pallavi");
		contact.setLastName("Parteti");
		contact.setState("Amravati");
		contact.setZip("274702");
		contact.setPhoneNumber("1234562345");
		contact.setEmail("pallavi@gmail.com");

		String json = gson.toJson(contact);

		fileWriter.write(json);
		fileWriter.close();
		System.out.println(json);

	}

	public void readFromJson() throws FileNotFoundException {
		Gson gson = new Gson();
		System.out.println("Reading data from the json");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				"C:\\Users\\Dell\\eclipse-workspace\\AddressBookSystems\\pallavi.json"));
		Contacts info = gson.fromJson(bufferedReader, Contacts.class);
		System.out.println("contact First Name: " + info.getFirstName());
		System.out.println("contact Last Name:" + info.getLastName());
		System.out.println("contact state: " + info.getState());
		System.out.println("contact Zip:" + info.getZip());
		System.out.println("contact phoneNumber:" + info.getPhoneNumber());
		System.out.println("contact Email:" + info.getEmail());

	}
}
