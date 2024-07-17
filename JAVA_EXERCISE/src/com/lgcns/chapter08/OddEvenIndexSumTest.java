package com.lgcns.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int[] nums = {12, 53, 24, 10, 22, 38, 64, 39};
		int oddSum = 0;
		int evenSum = 0;
		
		System.out.print("Data array : ");
		
		for(int i = 0; i < nums.length; i++) {
			if(i != nums.length - 1) {				
				System.out.print(nums[i]+", ");			
			}else {
				System.out.println(nums[i]);							
			}
			
			if(i % 2 == 0) {
				oddSum += nums[i];
			}
			
			if(i % 2 == 1) {
				evenSum += nums[i];
			}
		}
		
		System.out.println("Jumlah bilangan bulat ganjil : "+oddSum);							
		System.out.println("Jumlah bilangan bulat genap : "+evenSum);
	}
}
