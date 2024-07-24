package com.lgcns.chapter13.practice13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleInputStream {
	public static void main(String[] args){
		try {
			FileInputStream in = new FileInputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\o.txt");
			FileOutputStream out = new FileOutputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\c.bin");

			while(true){
				int data = in.read();
				System.out.println(Integer.toHexString(data));
				if(data==-1){
					break;
				}
				out.write(data);
			}
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}
