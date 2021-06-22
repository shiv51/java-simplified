package com.practice.collections;

public class DeadLockPrg1 {

	
	public static void main(String[] args) {
		String r1 = "hello";
		String r2 = "shivaraj";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (r1) {
					System.out.println("T1 locked r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (r2) {
						System.out.println("t1 locked r2");
					}
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (r2) {
					System.out.println("T2 locked r2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					
					synchronized (r1) {
						System.out.println("t1 locked r2");
					}
				}

				
			}
		};
		t1.start();
		t2.start();
	}

}
