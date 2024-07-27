package com.lgcns.exam.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonUtil {
	public static String getUserInput() {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = null;
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

}
