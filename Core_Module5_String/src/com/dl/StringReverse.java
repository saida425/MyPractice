package com.dl;

public class StringReverse {

	public static void main(String[] args) {

		String s = "I am a java full stack developer";
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) 
			result += s.charAt(i);
			System.out.println(result);
		}
	}

