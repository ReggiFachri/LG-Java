package com.lgcns.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat yaongi = new Cat();

		yaongi.setName("Yaongi");
		System.out.println("Nama : " + yaongi.getName());
		yaongi.setAge(3);
		System.out.println("Umur : " + yaongi.getAge());
		yaongi.setKind("Persian");
		System.out.println("Tipe : " + yaongi.getKind());
		yaongi.run();
		yaongi.hunt();
		yaongi.play();
	}
}