package com.dl.cont;

import java.util.Scanner;

public class Exm5_swit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anyNumber = scanner.nextInt();
		switch (anyNumber) {
		case 10:
			System.out.println("The number you entered is : " + anyNumber);

			break;
		case 20:
			System.out.println("The number you entered is : " + anyNumber);

			break;
		case 30:
			System.out.println("The number you entered is : " + anyNumber);

			break;
		case 40:
			System.out.println("The number you entered is : " + anyNumber);

			break;
		case 50:
			System.out.println("The number you entered is : " + anyNumber);

			break;

		default:
			System.out.println("The number you entered is out of range ");
			break;
		}
		
		scanner.close();

	}

}
