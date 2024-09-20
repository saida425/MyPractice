package com.dl;

public class Eg6 {
	
	public static void main(String[] args) {
		
		String s1 = "Java is a PL";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(8));
		
		
		String s2 = "Java";
		boolean b = s2.contains("Py");
		System.out.println(b);
		
		String s3 = "Java and Python";
		System.out.println(s3.startsWith("J"));
		System.out.println(s3.endsWith("n"));
	}

}
