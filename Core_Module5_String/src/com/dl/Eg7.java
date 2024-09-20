package com.dl;

public class Eg7 {
	public static void main(String[] args) {

		String s1 = "Java and Python and Java";
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 2));
		System.out.println(s1.indexOf('a', 4));
		
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.length());
	}

}
