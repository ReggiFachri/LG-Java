package com.lgcns.chapter13;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			for(int i = 0; i<5; i++)
				System.out.println("Thread 1, " + i);
		});
		Thread t2 = new Thread(()->{
			for(int i = 0; i<5; i++)
				System.out.println("Thread 2, " + i);
		});
		Thread t3 = new Thread(()->{
			for(int i = 0; i<5; i++)
				System.out.println("Thread 3, " + i);
		});

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("Selesai~~~~");

	}

}
