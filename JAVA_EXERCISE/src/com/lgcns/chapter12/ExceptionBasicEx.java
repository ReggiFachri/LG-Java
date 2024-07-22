package com.lgcns.chapter12;
import com.lgcns.chapter11.Student;

public class ExceptionBasicEx {

	public static void main(String[] args) {

		Student students[] = new Student[5];
		
		students[0] = new Student("Budi", 0, 0, 0);
		students[2] = new Student("Andi", 0, 0, 0);
		
		for(int i = 0; i < students.length; i++) {
			try {				
				System.out.println(students[i].getName());
			}catch (NullPointerException e) {				
				System.out.println("Nilai adalah null");
			}
		}

	}

}
