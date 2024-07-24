package com.lgcns.chapter13.practice13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleInputStream02 {
	public static void main(String[] args){
		try {
			FileInputStream in = new FileInputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\o.txt");
			FileOutputStream out = new FileOutputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\c.bin");

			int readLength;
			byte[] buffer = new byte[1024];

			while(true){
				readLength = in.read(buffer);
				if(readLength==-1){
					System.out.println();
					break;
				}
				out.write(buffer);
			}
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}
