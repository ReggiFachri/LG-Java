package com.lgcns.chapter06;

public class AccountTest {
	public static void main( String[] args ) {

		Account account = new Account();

		account.accountNumber = "123-456789";
		account.accountHolder = "Hong Gil-dong";
		System.out.println("Rekening " + account.accountNumber+ " (Deposan : " + account.accountHolder + ")");

		//set saldo ke 10k
		account.balance = 10_000;
		System.out.println("Saldo " + account.getBalance()+ " won.");

		//Setor sebanyak 20k
		int setoran = 20_000;

		if(setoran < 0) {
			System.out.println("[kesalahan] Jumlahnya tidak boleh negatif.");
		}else {
			account.deposit(setoran);			
			System.out.println("Setoran " + setoran + " won.");
		}


		//Cetak jumlah saldo
		System.out.println("Saldo " + account.getBalance() + " won.");

		//Penarikan 45k
		int tarik = 45_000;
		if(tarik < 0) {
			System.out.println("[kesalahan] Jumlahnya tidak boleh negatif.");
		}else if(tarik > account.getBalance()) {
			System.out.println("[kesalahan] Saldo anda tidak mencukupi");			
		}else {
			account.withdraw(tarik);
			System.out.println("Penarikan " + tarik + " won.");
		}
		System.out.println("Saldo " + account.getBalance() + " won.");		

	}
}
