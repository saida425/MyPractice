package com.dl;

public class Eg3 {
	
	public static void main(String[] args) {
		
		String s1 = new String("java");//2 objects
		String s2 = new String("java");//2 objects
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String ("Python");//2 objects
		System.out.println(s3.equals(s2));//false
		
		String s4 = "java";//scp
		System.out.println(s1 == s4);//s1 heap == s4 scp
		System.out.println(s1.equals(s4));
		
		String s5 = "java".concat("python");
		System.out.println(s5);
		
		String s6 = new String("javapython");
		System.out.println(s5 == s6);
		System.out.println(s6.equals(s5));
		
		String s7 = "".concat("NameOne").concat("NameTwo");
		System.out.println(s7);
		
		
		
		
	}
}
