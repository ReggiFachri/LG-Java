package com.lgcns.chapter13.practice13;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExCharStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
		out.write(65);
		out.write(66);
		out.close();
	}
}