package com.lgcns.mission.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MissionUtil {

	Scanner scanner = new Scanner(System.in);

	public int getUserIntegerInput() {
		int integerInput;
        while (true) { // Loop until valid integer input is received
            try {
                integerInput = scanner.nextInt();
                return integerInput; // Return valid input
            } catch (InputMismatchException e) {
                System.out.println("Program akan berhenti karena nilai yang benar tidak dimasukkan.");
                throw e; 
            }
        }
	}

	public double getUserDoubleInput() {
		double doubleInput = scanner.nextDouble();
		return doubleInput;
	}

	public String getCodeInput() {
		String codeInput = scanner.nextLine();
		return codeInput;
	}

}
