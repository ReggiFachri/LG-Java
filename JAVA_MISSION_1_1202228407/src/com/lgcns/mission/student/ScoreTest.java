package com.lgcns.mission.student;

import java.util.Arrays;

import com.lgcns.mission.util.MissionUtil;

public class ScoreTest {

	public static void main(String[] args) {

		MissionUtil util = new MissionUtil();

		System.out.print("Berapa banyak siswa di kelas ini? : ");
		int studentCount = util.getUserIntegerInput();

		Student[] students = new Student[studentCount];
		
		// Var total score /subject
		double totalJava = 0;
		double totalSQL = 0;
		double totalMath = 0;
		double totalChinese = 0;

		for (int i = 0; i < studentCount; i++) {
			String studentName = "STD" + String.format("%02d", i + 1);
			students[i] = new Student(studentName);

			System.out.print(students[i].getId() + " Nilai Java : ");
			int java = util.getUserIntegerInput();
			System.out.print(students[i].getId() + " Nilai SQL : ");
			int sql = util.getUserIntegerInput();
			System.out.print(students[i].getId() + " Nilai Matematika : ");
			int math = util.getUserIntegerInput();
			System.out.print(students[i].getId() + " Nilai Bahasa Mandarin : ");
			int chinese = util.getUserIntegerInput();

			System.out.println();
			System.out.println("-------------------------------------------");

			students[i].setScores(java, sql, math, chinese);
			
			// Sum subject score
			totalJava += java;
			totalSQL += sql;
			totalMath += math;
			totalChinese += chinese;
			
			//TODO: Set rank, how to check inputted student avg score and compare this student with past student.
			
		    students[i].printScoreInfo();
		}

		// Sort students based on average
		Arrays.sort(students, (s1, s2) -> Double.compare(s2.calculateAverage(), s1.calculateAverage()));

		// Assign ranks based on the sorted order
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(i+1);
		}

		// Print student ranks
		for (Student student : students) {
			System.out.println( student.getId() + " : => Nilai rata - rata : " + student.calculateAverage() + " poin Juara " + student.getRank());
		}
		System.out.println("===========================================");

		//Calculate subject avg, can become a method
		double doubleStudentCount = studentCount;
		double avgJava = totalJava/doubleStudentCount;
		double avgSQL = totalSQL/doubleStudentCount;
		double avgMath = totalMath/doubleStudentCount;
		double avgChinese = totalChinese/doubleStudentCount;
		
		System.out.println("Nilai rata – rata kelas Java : " + avgJava + " poin");
		System.out.println("Nilai rata – rata kelas SQL : " + avgSQL + " poin");
		System.out.println("Nilai rata – rata kelas Matematika : " + avgMath + " poin");
		System.out.println("Nilai rata – rata kelas Bahasa Mandarin : " + avgChinese + " poin");
		System.out.println("===========================================");
	}


}
