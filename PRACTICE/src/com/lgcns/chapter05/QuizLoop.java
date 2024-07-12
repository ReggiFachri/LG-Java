package com.lgcns.chapter05;

import java.util.Scanner;

public class QuizLoop {

	public static void main(String[] args) {

		quizAnswer();
	
	}

	public static void quizAnswer() {
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		int sum = 0;
		int idx = 0;

		for(int i = 1; i <= z ; i++) {
			if(i%3 == 0 || i%2 == 0) {
				sum += x;
				sum += idx*y;
				System.out.println("\nhari ke-"+i+" menabung "+((idx*y)+x));	
				idx++;
			}else {				
				System.out.print("\nHari ke-"+i+" tidak menabung ");	
			}
			System.out.println("Total di hari ke-"+i+": "+ sum);	
		}

		System.out.print("\n+++++++++\nTotal: "+ sum);
	}

	public static void finalAnswer() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		scanner.close();

		int total = 0;
		int tabKe = 1;

		for (int hari = 1; hari <= z; hari++) {
			if (hari % 2 == 0 || hari % 3 == 0) {
				total += x + (tabKe - 1) * y;
				tabKe++;
			}
		}

		System.out.println(total);
	}


}
