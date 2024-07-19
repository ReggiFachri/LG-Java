package com.lgcns.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat yaongi = new Cat(3, "Persian", "Yaongi");
		Dog mong = new Dog(2, "Siberian Husky", "Mongmongi");

		System.out.println("Nama : " + yaongi.getName());
		System.out.println("Umur : " + yaongi.getAge());
		System.out.println("Tipe : " + yaongi.getKind());
		yaongi.run();
		yaongi.hunt();
		yaongi.play();

		System.out.println("");

		System.out.println("Nama : " + mong.getName());
		System.out.println("Umur : " + mong.getAge());
		System.out.println("Tipe : " + mong.getKind());
		mong.run();
		mong.hunt();
	}
}