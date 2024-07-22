package com.lgcns.chapter12;

import java.util.ArrayList;

public class TeaterEntranceTest {
	public static void main( String[] args ) {

		ArrayList<Person> people = new ArrayList<Person>();

		people.add( new Person("Hong Gil-dong", 23 ) );
		people.add( new Person("Hong Gil-sun", 17 ) );

		System.out.println("Masuk ke bioskop.");	
		
		for ( Person person : people ) {
			System.out.print(person.getName() + " : ");	
			try {				
				if ( person.getAge() < 19 ) {
					TheaterEntranceException e = new TheaterEntranceException("Dilarang masuk!!");
					throw e;
				} else {
					System.out.println("Silahkan masuk~");
				}
			}catch(TheaterEntranceException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}