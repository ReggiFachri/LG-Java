package com.lgcns.chapter12;

public class ArrayDivideTest {

	public static void main(String[] args) {
		
		int arrayOne[] = {10,20,13,25};
		int arrayTwo[] = {2,5,0,3};
		
		for(int i = 0; i < arrayOne.length; i++) {
			try {				
				int result = arrayOne[i] / arrayTwo[i];
				System.out.print(arrayOne[i] + " / " + arrayTwo[i] + " = ");
                System.out.println( result );
			}catch(ArithmeticException e){
				System.out.println(e);				
			}
			
			
		}
	}

}
