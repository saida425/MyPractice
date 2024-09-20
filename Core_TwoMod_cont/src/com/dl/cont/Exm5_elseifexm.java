package com.dl.cont;

import java.util.Scanner;

public class Exm5_elseifexm {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter emp sal:");
		float sal = scanner.nextFloat();
		if (sal <= 10000) {
			System.out.println("emp sal is from 0 to 10000 : " + sal);
		} else if (sal <= 20000) {
			System.out.println("emp sal is from 0 to 20000 : " + sal);

		} else if (sal <= 30000) {
			System.out.println("emp sal is from 0 to 30000 : " + sal);

		} else if (sal <= 40000) {
			System.out.println("emp sal is from 0 to 40000 : " + sal);

		} else {
			System.out.println("emp sal is out of range ");
		}
		scanner.close();

	}

}
