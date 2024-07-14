package com.lgcns.chapter06;

public class Student {
	String studentName;
	String studentId;
	int korean;
	int english;
	int math;

	public int calculateAverage() {
		int average = ( korean + english + math ) / 3;
		return average;
	}

	public void printStudentInfo() {
		System.out.println("Nama :" + studentName );
        System.out.println("No. Siswa :" + studentId );
        System.out.println("Nilai Bahasa Korea :" + korean );
        System.out.println("Nilai Bahasa Inggris :" + english );
        System.out.println("Nilai Matematika :" + math );
	
	}

	public void changeStudentId( String newId ) {
		studentId = newId;
	}
}