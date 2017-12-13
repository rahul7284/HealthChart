package com.healthcart.utils;

import java.util.Random;

public class PasswordUtils {
	private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

	public static String generateSaltPasword() {

		Random rnd = new Random();
		int len = rnd.nextInt(10) ;
		char[] pswd = new char[len];

		for (int i = 0; i < len; i++) {
			if (pswd[i] == 0) {
				pswd[i] = ALPHA.charAt(rnd.nextInt(ALPHA.length()));
			}
		}

		System.out.println(String.valueOf(pswd));

		return String.valueOf(pswd);

	}

}
