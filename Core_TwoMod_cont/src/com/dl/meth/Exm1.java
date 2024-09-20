package com.dl.meth;

public class Exm1 {

	public void add() {
		System.out.println("add");
		
	}
	public static void get() {
		System.out.println("get");
		
	}
	public static void main(String[] args) {
		get();
		Exm1.get();
		
		Exm1.get();
		new Exm1().add();
		Exm1 exm1 = new Exm1();
		exm1.add();
	}
}
