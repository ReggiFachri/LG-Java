package com.lgcns.chapter02;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySalary = 1_000_000;
		double salaryBonus = 0.2;
		double tax = 0.1;
		double bonusTax = 0.055;
		
		int yearlySalary = monthlySalary * 12;
		double taxedSalary = yearlySalary - (yearlySalary * tax);

		double bonus = monthlySalary - (monthlySalary * salaryBonus);
		double taxedBonus = bonus - (bonus * bonusTax);
		
		double salary = taxedSalary + taxedBonus;

		System.out.println("Gaji: " + yearlySalary + ", gaji setelah pajak: " + (int)taxedSalary);
		System.out.print("Bonus: ");
		System.out.printf("%,d", (int)bonus);
		System.out.print(", bonus setelah pajak: ");
		System.out.printf("%,d", (int)taxedBonus);
		System.out.println("\nPembayaran: " + (int)salary);
	}

}
