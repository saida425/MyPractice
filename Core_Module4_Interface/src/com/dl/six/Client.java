package com.dl.six;

public interface Client {
	
	public static void m1() {
		System.out.println("M1 Method");
	}
//	default void m2  :implents in java8 features
//	() {
//		System.out.println("M2 Method");
//	}
	public static void main(String[] args) {
		
		m1();
		
	}

}
