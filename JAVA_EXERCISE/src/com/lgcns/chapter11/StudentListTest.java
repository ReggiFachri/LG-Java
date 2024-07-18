package com.lgcns.chapter11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add( new Student("Lee Sun-shin", 80, 90, 95 ) );
        students.add( new Student("Kim Yu-shin", 95, 89, 92 ) );
        students.add( new Student("Kang Gam-chan", 88, 97, 94 ) );
        
        Student leeSoonShin = students.get(0);
        leeSoonShin.setEnglish(92);
        students.set(0, leeSoonShin);
        
        for ( int inx = 0; inx < students.size(); inx++ ) {
            Student student = students.get( inx );
            System.out.print( student.getName() );
            System.out.print("(B. Korea :");
            System.out.print( student.getKorean() );
            System.out.print(", B. Inggris :");
            System.out.print( student.getEnglish() );
            System.out.print(", Matematika :");
            System.out.print( student.getMath() );
            System.out.println(")");
        }
	}

}
