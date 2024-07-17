package com.lgcns.mission.book.biz;

import com.lgcns.mission.book.Book;
import com.lgcns.mission.book.Novel;

public class BookBiz implements IBookBiz {
	
	private Book[] books;

	public BookBiz(Book[] books) {
		this.books = books;
	}

	@Override
	public void printAllBooks() {
		printHeader();
		for(Book book : books) {
			System.out.println(book);
		}
		printTail();
	}

	@Override
	public void searchNovelByAuthor(String author) {
		printHeader();
		for(Book book : books) {
			if(book instanceof Novel) {					
				if(((Novel)book).getAuthor().equals(author)){
					System.out.println(book);					
				}
			}
		}
		printTail();
	}

	@Override
	public void searchNovelByPrice(int minPrice, int maxPrice) {		
		printHeader();
		for(Book book : books) {
			if(book instanceof Novel) {				
				if(book.getPrice() >= minPrice && book.getPrice() <= maxPrice){
					System.out.println(book);					
				}
			}
		}
		printTail();
	}

	@Override
	public void printHeader() {
		System.out.println("------------------------------------------------------- Informasi Buku -----------------------------------------------------------------");
	}

	@Override
	public void printTail() {
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------\n");
	}
}
