package com.lgcns.chapter13.practice13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExBufferedReaderNWriter {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
		BufferedWriter bw = new BufferedWriter(writer);

		bw.write("Hari ini adalah terakhir.\n");
		bw.write("Terimakasih atas kerja keras anda.");
		bw.flush();
		bw.close();
	}
}
