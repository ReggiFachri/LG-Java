package com.lgcns.chapter09;

public class AccountTest {

	public static void main(String[] args) {

		FundAccount[] fundAccounts =
			{ new FundAccount("111-2222", "Hong Gil-dong",5000000, 4.7 ),
					new FundAccount("666-7777", "Hong Gil-sun",1000000, 2.9 ) };

		for ( int inx = 0; inx < fundAccounts.length; inx++ ) {
			fundAccounts[inx].openAccount();
			System.out.print("Pengembalian :");
			System.out.println(fundAccounts[inx].getEarningRate() );
			fundAccounts[inx].earnMoney();
			System.out.println();
		}
	}
}
