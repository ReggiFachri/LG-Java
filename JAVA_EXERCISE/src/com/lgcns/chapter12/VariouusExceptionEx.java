package com.lgcns.chapter12;

import com.lgcns.chapter11.Student;

public class VariouusExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = null;

		try {
			System.out.println(student.getMath());
		}catch(NullPointerException e) {
			System.out.println("nilai tidak ada");			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("melebihi array");			
		}

	}

}
