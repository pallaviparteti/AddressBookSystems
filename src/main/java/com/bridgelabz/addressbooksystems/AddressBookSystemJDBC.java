package com.bridgelabz.addressbooksystems;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddressBookSystemJDBC extends BaseClass{


	public static void retrieveData() throws SQLException {
		connection = setUpDatabase();
		Statement statement = connection.createStatement();
		String query = "select * from addressbook";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			String firstName = resultSet.getString("firstName");
			String lastName = resultSet.getString("lastName");
			String address = resultSet.getString("address");
			String city = resultSet.getString("city");
			String state = resultSet.getString("state");
			String zip = resultSet.getString("zip");
			String email = resultSet.getString("email");
			String phoneNumber = resultSet.getString("phoneNumber");
			//String name = resultSet.getString("name");
			String type = resultSet.getString("type");
			System.out.println( " " + firstName + " " + lastName + " " + address + " " + city + " " + state + " " + zip + " " + email + " " + phoneNumber + " " + " " + type);
		}
		System.out.println("Retrieve all the data from the addressbook table");
	}
	public void updateContactPersonInformationData() throws SQLException {
		connection = setUpDatabase();
		String updateQuery = "update addressbook set lastname = ? WHERE firstName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		preparedStatement.setString(1, "kokate");
		preparedStatement.setString(2, "Pallavi");
		preparedStatement.executeUpdate();
		System.out.println("Record updated successfully");
	}
}


