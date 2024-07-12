package com.lgcns.mission.book.test;

import com.lgcns.mission.book.Book;
import com.lgcns.mission.book.Customer;
import com.lgcns.mission.book.SecondBook;

public class BookTest {

	public static void main(String[] args) {

		Book[] books = {
				new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15),
				new Book("Pistol, kuman dan Besi", "Jared Diamond", 28000, 3),
				new Book("Street of Dark Shops ", "Patrick Modiano", 11000, 12),
				new Book("Perjalanan Mr. Cuffe menuju kebahagiaan", "François Leroy", 13500, 1),				
				new SecondBook("Penjelajah warisan budaya Penulis", "Yoo Hong-Jun", 13000, 1, "IU", 45),			
				new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000, 1, "Kim Soo-hyun", 40)				
		};
		
		Customer[] customers = {
				new Customer("Na Gong-bu"),
				new Customer("Kim Sin-ip")				
		};
				
		System.out.println("--informasi buku -----------------------------------------------------------------------------------------------------------------------");
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------\n");
		
		customers[0].buyBook(books[2], 3); //Dark shop x 3
		customers[0].buyBook(books[1], 0); //Pistol x 0
		customers[0].buyBook((SecondBook) books[5]); //  secBook tolstoy
		customers[0].buyBook(books[0], 1); //Keadilan x 1
		customers[1].buyBook((SecondBook) books[5]); //  secBook tolstoy
		customers[1].buyBook(books[3], 2); //Mr. Cuffe x 2
		customers[1].buyBook(books[1], 3); //Pistol x 3

		System.out.println("\n--Informasi buku -----------------------------------------------------------------------------------------------------------------------");
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------\n");
				
		System.out.println("--Informasi pembelian -----------------------------------------------------------------------------------------------------------------------");
		for(Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------\n");		
	}

}
