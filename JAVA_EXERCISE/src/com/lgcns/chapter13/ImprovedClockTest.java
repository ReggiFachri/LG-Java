package com.lgcns.chapter13;

public class ImprovedClockTest {

	  public final static int DURATION = 60*1000;

	  public static void main(String[] args)
	  {
	          System.out.println("Output waktu saat ini dimulai.");
	          ImprovedClock clock = new ImprovedClock("Zenith");
	          clock.start();

	          try {
	              Thread.sleep(DURATION);
	              clock.interrupt();
	          } catch (InterruptedException e) {
	              /* */
	          }
	          System.out.println("Output waktu saat ini selesai.");
	      }

}
