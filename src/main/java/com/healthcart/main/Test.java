package com.healthcart.main;

import java.util.Random;

public class Test {
	private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
public static void main(String[] args) {
   System.out.println("this test to check commit ");
   
   
   
   Random rnd = new Random();
   int len = rnd.nextInt(4- 4 + 1) + 4;
   char[] pswd = new char[len];
      
      for (int i = 0; i < len; i++) {
   		if (pswd[i] == 0) {
   			pswd[i] = ALPHA.charAt(rnd.nextInt(ALPHA.length()));
   		}
   	}
    
      System.out.println(String.valueOf(pswd));
   }


}
