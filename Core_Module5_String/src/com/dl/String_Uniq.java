package com.dl;

public class String_Uniq {
	public static void main(String[] args) {
		String s = "i am a java full stack developer";
		String unique = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// System.out.println(ch);
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				unique += ch;
			}
		}
		System.out.println(unique);
	}
}
