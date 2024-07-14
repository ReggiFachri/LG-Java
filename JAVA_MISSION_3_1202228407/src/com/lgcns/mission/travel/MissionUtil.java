package com.lgcns.mission.travel;

import java.util.Scanner;

public class MissionUtil {
	
	public static int getUserIntegerInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public static double getUserDoubleInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.nextDouble();
	}
	
	public static String getCodeInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.next();
	}
}
