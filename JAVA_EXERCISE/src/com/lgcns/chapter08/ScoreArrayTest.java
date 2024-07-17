package com.lgcns.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int[] scores = new int[3];

		scores[0] = 87;
		scores[1] = 93;
		scores[2] = 90;

		double average = (scores[0] + scores[1] + scores[2]) / 3;


		System.out.println("Bahasa Korea : " + scores[0]);
		System.out.println("Bahasa Inggris : " + scores[1]);
		System.out.println("Matematika : " + scores[2]);
		System.out.println("Rata-rata : " + average);
	}

}
