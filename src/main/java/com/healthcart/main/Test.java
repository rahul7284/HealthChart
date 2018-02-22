package com.healthcart.main;

import java.util.Random;

public class Test {
	public static void main(String[] args) {

		int firstLargest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;

		int thirdLargest = Integer.MIN_VALUE;

		
		int arr[] = { 100, 6, 10, 7, 11, 12, 3 };

		for (int i = 0; i < arr.length; i++) {

			if (firstLargest < arr[i]) {

				thirdLargest = secLargest;
				secLargest = firstLargest;
				firstLargest = arr[i];

			}
			else if (secLargest < arr[i] && (arr[i]!=firstLargest)) {

				thirdLargest = secLargest;
				
				secLargest = arr[i];

			}
			else if (thirdLargest < arr[i]   && (arr[i]!=secLargest)) {

				
				thirdLargest = arr[i];

			}
				
		}
		System.out.println(thirdLargest);
		
		
		
		
		
		
		
		

		
}
	/*public static void generateSaltPasword() {
	 String ALPHA = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		int len = rnd.nextInt(10) ;
		char[] pswd = new char[len];

		for (int i = 0; i < len; i++) {
			if (pswd[i] == 0) {
				pswd[i] = ALPHA.charAt(rnd.nextInt(ALPHA.length()));
			}
		}

		System.out.println(String.valueOf(pswd));
}*/
}
