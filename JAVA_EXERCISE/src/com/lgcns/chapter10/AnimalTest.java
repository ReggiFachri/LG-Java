package com.lgcns.chapter10;

public class AnimalTest {

	public static void main(String[] args) {

		Bird elang = new Bird("Elang", 3, "Rocky Mountain");
		
		System.out.println(elang.getKind()+"("+elang.getAge()+" tahun): "+elang.getHabitat()+", dll.");
		elang.spreadWings();
		elang.fly();
	}

}
