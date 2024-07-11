package com.lgcns.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
	
		int sum = 0, index = 1;
		
		while(sum < 100) {
			int number = index * 5;
			sum += number;
						
			System.out.println(index + ". ( + " + number + " ) " + sum);
			index++;
		}
		
	}
	
}
