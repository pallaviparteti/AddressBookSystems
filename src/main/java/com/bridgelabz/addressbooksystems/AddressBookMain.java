package com.bridgelabz.addressbooksystems;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvConstraintViolationException;

public class AddressBookMain {
	// private static Object NewContact;

	public static void main(String[] args) throws IOException, CsvConstraintViolationException {
		writeIntoCsvFile();
		readFromCsvFile();
	}

	public static void writeIntoCsvFile() throws IOException {
		CSVWriter csvWriter = new CSVWriter(new FileWriter(
				"C:\\Users\\Dell\\eclipse-workspace\\AddressBookSystems\\contacts.csv"));
		String header[] = {"firstName", "lastName", "state", "zip", "phoneNumber", "email"};
		String contact1[] = {"Pallavi", "Parteti", "MH", "444601", "9878765442", "pallavi@gmail.com"};
		String contact2[] = {"samiksha", "Dhabale", "MH", "24233", "876542223", "shlok1234@gmail.com"};
		String contact3[] = {"kiran", "kumar", "maharastra", "23235", "7658443332", "kirank1235@gmail.com"};
		String contact4[] = {"Satya", "yadav", "uttarpradesh", "25123", "123456456", "sspra143@gmail.com"};
		String contact5[] = {"miland", "gupta", "uttrakhand", "21234", "98767890", "miland 4567@gmail.com"};


		List list = new ArrayList();
		list.add(header);
		list.add(contact1);
		list.add(contact2);
		list.add(contact3);
		list.add(contact4);
		list.add(contact5);
		csvWriter.writeAll(list);
		csvWriter.close();
		System.out.println("Student Data stored");

	}

	public static void readFromCsvFile() throws CsvConstraintViolationException, IOException {
		CSVReader csvReader = new CSVReader(new FileReader(
				"C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\AddressBookSystems\\\\contacts.csv"));

		StringBuffer buffer = new StringBuffer();
		String studentData[];
		while ((studentData = csvReader.readNext()) != null) {
			for (int i = 0; i < studentData.length; i++) {
				System.out.println(studentData[i]);
			}
			System.out.println(" ");
		}
	}

}
