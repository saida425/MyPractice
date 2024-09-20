package com.dl.cont;

import java.util.Scanner;

public class Exm3ScannerClassFull {

	static int a = 10;
	static int b = 20;
	//we writen an inside the class and outside the method
	//we can call st v in the main method and any other method
	int x=10;
	int y=20;
	
	public static void main(String[] args) {
		//new Scanner(null);
		System.out.println(a);
		System.out.println(b);
		System.out.println(new Exm3ScannerClassFull().x);
		System.out.println(new Exm3ScannerClassFull().y);
		
		
		int i = 1000;
		int j = 2000;
		System.out.println(i);
		System.out.println(j);
		
	}
}
