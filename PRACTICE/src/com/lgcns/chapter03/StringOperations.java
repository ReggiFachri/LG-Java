package com.lgcns.chapter03;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		// Input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan sebuah string: ");
		String inputString = scanner.nextLine();

		// ParseInt
		System.out.print("Masukkan sebuah angka: ");
		int inputNumber = Integer.parseInt(scanner.nextLine());

		// Concatenation
		String concatenatedString = inputString.concat(" ").concat(String.valueOf(inputNumber));
		System.out.println("Hasil konkatenasi: " + concatenatedString);

		// Contains
		System.out.print("Masukkan string untuk dicari: ");
		String searchString = scanner.nextLine();
		boolean containsString = inputString.contains(searchString);
		System.out.println("Apakah string tersebut terdapat dalam input string? " + containsString);

		// Equals
		System.out.print("Masukkan string untuk dibandingkan: ");
		String compareString = scanner.nextLine();
		boolean isEqual = inputString.equals(compareString);
		System.out.println("Apakah kedua string tersebut sama? " + isEqual);


		// IndexOf
		System.out.print("Masukkan karakter yang ingin dicari: ");
		char searchChar = scanner.nextLine().charAt(0);
		int indexOfChar = inputString.indexOf(searchChar);
		System.out.println("Indeks dari karakter " + searchChar + " dalam input string: " + indexOfChar);

		// Length
		int stringLength = inputString.length();
		System.out.println("Panjang input string: " + stringLength);

		// Replace
		System.out.print("Masukkan karakter yang ingin diganti: ");
		char replaceChar = scanner.nextLine().charAt(0);
		System.out.print("Masukkan karakter pengganti: ");
		char replacementChar = scanner.nextLine().charAt(0);
		String replacedString = inputString.replace(replaceChar, replacementChar);
		System.out.println("Hasil penggantian: " + replacedString);

		// Split
		System.out.print("Masukkan pemisah untuk split: ");
		String delimiter = scanner.nextLine();
		String[] splitStrings = inputString.split(delimiter);
		System.out.println("Hasil split: ");
		for (String str : splitStrings) {
			System.out.println(str);
		}

		// Substring
		System.out.print("Masukkan indeks awal substring: ");
		int startIndex = Integer.parseInt(scanner.nextLine());
		System.out.print("Masukkan indeks akhir substring: ");
		int endIndex = Integer.parseInt(scanner.nextLine());
		String substring = inputString.substring(startIndex, endIndex);
		System.out.println("Hasil substring: " + substring);

		// toLowerCase
		String lowerCaseString = inputString.toLowerCase();
		System.out.println("String dalam huruf kecil: " + lowerCaseString);

		// toUpperCase
		String upperCaseString = inputString.toUpperCase();
		System.out.println("String dalam huruf besar: " + upperCaseString);

		scanner.close();
	}
}

