package com.lgcns.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();

        student.studentName = "Hong Gil-Dong";
        student.studentId = "S001";
        student.korean = 94;
        student.english = 80;
        student.math = 89;
        
        student.printStudentInfo();

        int average = student.calculateAverage();
        System.out.println("Rata-rata : "+ average );
                
        System.out.println("\n* Nomor siswa diubah!!!\n");
        
        student.changeStudentId("STU001");
        student.printStudentInfo();

	}

}
