package com.dl;

public class Eg5 {

	// loops : for,while,do-while,for each,collection
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

		int i = 0;
		while (i < 5) {
			System.out.println(a[i]);
			i++;
		}
		
		int j = 4;
		while (j >= 0) {
			System.out.println(a[j]);
			j--;
		}
	}
}