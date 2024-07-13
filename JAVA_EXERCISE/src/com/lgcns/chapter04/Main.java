package com.lgcns.chapter04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		System.out.println("---DATE---");
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    
	    System.out.println("\n---TIME---");
	    LocalTime myObj1 = LocalTime.now();
	    System.out.println(myObj1);

	    System.out.println("\n---DATETIME---");
	    LocalDateTime myObj11 = LocalDateTime.now();
	    System.out.println(myObj11);
	    
	    System.out.println("\n---FORMAT---");
	    LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}
}