package com.lgcns.chapter13.practice13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleBufferedStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
        BufferedOutputStream bos = new BufferedOutputStream(out);
        DataOutputStream dos = new DataOutputStream(bos);

        bos.write(185);
        bos.write(13);
        bos.close();

        FileInputStream in = new FileInputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
        BufferedInputStream bis = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(bis);

        System.out.println(dis.read());
        System.out.println(dis.read());
        dis.close();
    }
}
