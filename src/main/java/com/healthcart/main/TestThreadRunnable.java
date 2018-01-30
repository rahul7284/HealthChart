package com.healthcart.main;

import java.lang.management.ThreadInfo;
import java.util.Random;

public class TestThreadRunnable implements Runnable {
	public static void main(String[] args) {

		TestThreadRunnable test = new TestThreadRunnable();
		Thread t1 = new Thread(test);
		t1.start();
		t1.setName("first thread");
		
		
}

	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("thread running   "+ i +"  "+ Thread.currentThread().getName());	
		}
		
	}
	
	
}
