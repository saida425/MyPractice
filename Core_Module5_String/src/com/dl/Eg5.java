package com.dl;

public class Eg5 {
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
	}
}
