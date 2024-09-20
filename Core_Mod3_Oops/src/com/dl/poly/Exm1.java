package com.dl.poly;

public class Exm1 {

	public static void main(String[] args) {
		
		Exm1 exm1 = new Exm1();
		exm1.get(201);
		exm1.get(202);
		exm1.get(203);
		exm1.get(204);

	}

	public void get(int httpSatusCode) {
		System.out.println(httpSatusCode);

	}

	public void get(long httpSatusCode) {
		System.out.println(httpSatusCode);

	}

	public void get(short httpSatusCode) {
		System.out.println(httpSatusCode);

	}

	public void get(byte httpSatusCode) {
		System.out.println(httpSatusCode);

	}
}
