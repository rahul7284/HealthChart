package com.healthcart.main;

import java.lang.management.ThreadInfo;
import java.util.Random;

public class TestThread extends Thread {
	public static void main(String[] args) {

		TestThread test = new TestThread();
		TestThread test2 = new TestThread();
		
		
		
		System.out.println(Thread.currentThread().getName());
		test.setName("first");
		test2.setName("sec");
		test.setPriority(MAX_PRIORITY);
		test2.setPriority(MIN_PRIORITY);
		test.start();
		test2.start();
}

	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("thread running   "+ i +"  "+ Thread.currentThread().getName());	
		}
		
	}
	
	
}
