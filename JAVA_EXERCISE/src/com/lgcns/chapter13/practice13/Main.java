package com.lgcns.chapter13.practice13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main (String[] args) throws IOException {
		//		try {
		//			FileInputStream fileInput = new FileInputStream("input.txt");
		//		}catch (Exception e) {
		//			System.err.println(e);
		//		}


		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;

		try {
			fileInput = new FileInputStream("input.txt");
			fileOutput = new FileOutputStream("output.txt");
			int data = 0;
			while(data != -1) {
				data = fileInput.read();
				System.out.print(fileInput.read());
				System.out.println(" --- " + (char)fileInput.read());
				fileOutput.write(fileInput.read());
				
				if(data == -1) {
					break;
				}
			}

		}finally {
			fileInput.close();
			fileOutput.close();
		}

	}
}
