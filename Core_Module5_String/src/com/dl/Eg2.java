package com.dl;

public class Eg2 {

	public static void main(String[] args) {
		
		//String literal
		
		String s1= "Java";//1 object (scp :String constant pool)
		String s2="Python";//1 object(scp :String constant pool)
		String s3="Java";//1 object(scp :String constant pool)
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//==reference comparison
		System.out.println(s1==s2);//false //java==python
		System.out.println(s1==s3);//true //java == java

		
		//content com
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
	
		String s4 = s1.concat("javaScript");
		System.out.println(s4);
		System.out.println(s1);
	
	
	}

}