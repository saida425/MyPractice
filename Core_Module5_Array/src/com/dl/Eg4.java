package com.dl;

public class Eg4 {
	
	public static void main(String[] args) {
		
		//int a[]=new int[0];
		//a[0]=10;
		//System.out.println(a);//java.lang.ArrayIndexOutOfBoundsException:
		
		int b[]= new int[-5];
		b[-4]=10;
		System.out.println(b);//java.lang.NegativeArraySizeException:
	}

}