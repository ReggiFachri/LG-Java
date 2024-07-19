package com.lgcns.chapter09;

public class Movie {
	private String title;
	private String director;
	private String genre;
	
	public Movie(String title, String director, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Judul : " + title + ", Director : " + director + ", Genre : " + genre;
	}
}
