package com.lgcns.chapter13.practice13;

import java.io.FileWriter;
import java.io.IOException;

public class ExFileReaderNWriter {
	
	public static void main (String[] args) throws IOException {	
		char ch1='J';
		char ch2='A';
		char ch3='V';
		char ch4='A'; //Java menggunakan Unicode 2-byte
		FileWriter writer = new FileWriter("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
		//FileWriter writer =  new FileWriter(null);
		writer.write(ch1);
		writer.write(ch2);
		writer.write(ch3);
		writer.write(ch4);
		writer.close();
	}
}
