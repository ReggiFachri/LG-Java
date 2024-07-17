package com.lgcns.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		
		int[] nums = {12, 53, 24, 10, 22, 38, 64, 39};
		int max = 0;
		int min = 0;
		
		System.out.print("Data array : ");
		
		for(int i = 0; i < nums.length; i++) {
			if(i != nums.length - 1) {				
				System.out.print(nums[i]+", ");			
			}else {
				System.out.println(nums[i]);							
			}
			
			if(max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i] || min == 0) {
				min = nums[i];
			}
		}
		
		System.out.println("Nilai maksimum : "+max);							
		System.out.println("Nilai minimum : "+min);							
	}
}