package com.lgcns.chapter13.practice13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExampleDataFilterStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
        DataOutputStream filterOut = new DataOutputStream(out);

        int num1 = 26;
        double num2 = 26.21;
        filterOut.writeInt(num1);
        filterOut.writeDouble(num2);
        filterOut.close();

        FileInputStream in = new FileInputStream("C:\\Java\\JAVA_EXERCISE\\src\\com\\lgcns\\chapter13\\practice13\\data.bin");
        DataInputStream filterIn = new DataInputStream(in);
        int num3 = filterIn.readInt();
        double num4 = filterIn.readDouble();
        filterIn.close();

        System.out.println(num3);
        System.out.println(num4);
    }
}
