package com.lgcns.mission.student;

public class Student {

	//	Property
	private String id;
	private int java;
	private int sql;
	private int math;
	private int chinese;
	private int rank;

	//	Constructor
	public Student(String id) {
		this.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setScores(int java, int sql, int math, int chinese) {
		this.java = java;
		this.sql = sql;
		this.math = math;
		this.chinese = chinese;
	}

	public double calculateAverage() {
		double java = this.java;
		double sql = this.sql;
		double math = this.math;
		double chinese = this.chinese;
		double avg = (java+sql+math+chinese)/4;
		return avg;
	}

	public void printScoreInfo() {		
		System.out.println("["+ id + "] Status Nilai");
		System.out.print("Java "+ java + " poin, ");
		System.out.print("SQL "+ sql + " poin, ");
		System.out.print("Matematika "+ math + " poin, ");
		System.out.println("Bahasa Mandarin "+ chinese + " poin");
		System.out.println("-------------------------------------------");

		double avg = calculateAverage();
		System.out.println("Nilai rata - rata : "+ avg + " Juara " + getRank());

		System.out.println("-------------------------------------------");
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
