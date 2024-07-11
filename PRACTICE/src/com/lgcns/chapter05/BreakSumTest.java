package com.lgcns.chapter05;

public class BreakSumTest {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(sum > 30) {
				break;
				//i = 11;
			}
		}
		
		System.out.print("Total hasil: " + sum);
	}

}
