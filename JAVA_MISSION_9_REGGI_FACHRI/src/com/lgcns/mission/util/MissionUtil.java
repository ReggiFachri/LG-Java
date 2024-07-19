package com.lgcns.mission.util;

import java.util.Scanner;

public class MissionUtil {
	public static String getUserInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
