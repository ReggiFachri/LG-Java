package com.lgcns.chapter09;

public class AccountTest {

	public static void main(String[] args) {

		FundAccount fundAccount = new FundAccount();

		fundAccount.setNumber("111-2222");
		fundAccount.setName("Hong Gil-dong");
		fundAccount.setBalance( 5000000 );
		fundAccount.setEarningRate( 4.7 );

		fundAccount.openAccount();
        System.out.print("Nomor Rekening :");
        System.out.println( fundAccount.getNumber() );
        System.out.print("Pemilik Akun :");
        System.out.println( fundAccount.getName() );
        System.out.print("Saldo :");
        System.out.println( fundAccount.getBalance() + " won");
        System.out.print("Pengembalian :");
        System.out.println( fundAccount.getEarningRate() + "%");
        fundAccount.earnMoney();
	}

}
