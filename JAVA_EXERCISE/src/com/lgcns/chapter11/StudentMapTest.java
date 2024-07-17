package com.lgcns.chapter11;

import java.util.HashMap;

public class StudentMapTest {

	public static void main(String[] args) {
		HashMap<String, Student> studentMap = new HashMap<String, Student>();

		studentMap.put("STU001", new Student("Lee Sun-shin", 80, 90, 95 ) );
		studentMap.put("STU002", new Student("Kim Yu-shin", 95, 89, 92 ) );
		studentMap.put("STU003", new Student("Kang Gam-chan", 88, 97, 94 ) );

		Student LeeSoonShin = studentMap.get("STU001");
		LeeSoonShin.setEnglish(92);
		studentMap.put("STU001", LeeSoonShin);
		
		studentMap.remove("STU002");
		
		for ( String studentId : studentMap.keySet() ) {
            Student student = studentMap.get( studentId );

            System.out.print( studentId + "-");
            System.out.print( student.getName() );
            System.out.print("(Bahasa Korea :");
            System.out.print( student.getKorean() );
            System.out.print(", Bahasa Inggris :");
            System.out.print( student.getEnglish() );
            System.out.print(", Matematika :");
            System.out.print( student.getMath() );
            System.out.println(")");
        }		
	}

}
