package com.dl.one;

public class ProfileImpl implements Profile {

	@Override
	public void m1() {
		
		System.out.println("M1");
	}

	@Override
	public void m2() {
		
		System.out.println("M2");
	}

	@Override
	public void m3() {
		System.out.println("M3");
		
	}
	public static void main(String[] args) {
		ProfileImpl profileImpl = new ProfileImpl();
		profileImpl.m1();
		profileImpl.m2();
		profileImpl.m3();
	}

}