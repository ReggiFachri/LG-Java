package com.lgcns.mission.util;

import java.util.Scanner;

public class MissionUtil {
	
	public static int getIntegerInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public static String getStringInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.next();
	}
}
