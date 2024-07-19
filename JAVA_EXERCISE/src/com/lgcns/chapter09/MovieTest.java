package com.lgcns.chapter09;

public class MovieTest {

	public static void main(String[] args) {

		SfMovie[] movies = {
				new SfMovie("Avatar", "James Cameron"),
				new SfMovie("AI", "Steven Spielberg"),
		};
		
		for(SfMovie movie : movies) {
			System.out.println(movie);
		}

	}

}
