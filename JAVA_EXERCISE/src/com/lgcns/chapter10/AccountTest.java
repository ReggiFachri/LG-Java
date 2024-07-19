package com.lgcns.chapter10;

public class AccountTest {

	public static void main(String[] args) {

		Account[] accounts ={ 
					new Account("1313-445566", "Jeon Woo-chi",100000),
					new FundAccount("111-2222", "Hong Gil-dong",5000000, 5.6 ),
					new FundAccount("666-7777", "Hong Gil-sun",1000000, 2.9 ) 
			};

		for ( int inx = 0; inx < accounts.length; inx++ ) {
			System.out.println(accounts[inx]);
		}
	}
}
