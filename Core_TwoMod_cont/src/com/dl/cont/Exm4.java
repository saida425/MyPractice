package com.dl.cont;

import java.util.Scanner;

public class Exm4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value :");
		int a = scanner.nextInt();
		System.out.println("enter b value :");

		int b = scanner.nextInt();

		if (a < b) {
			System.out.println("Condition checked");
		} else {
			System.out.println("Condition not checked");
		}
		scanner.close();
	}

}
