package com.lgcns.chapter03;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String inputString = scanner.nextLine();
        System.out.println("Input string: " + inputString);
        scanner.close();
	}

}