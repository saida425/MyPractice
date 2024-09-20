package com.dl.four;

//we impl only one abd method from interface and other methods in next class
interface A{
	
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class B implements A{

	@Override
	public void m1() {
System.out.println("M1 Method");
		
	}
	
	
}

class c extends B{

	@Override
	public void m2() {
		System.out.println("M2 Method");		
	}

	@Override
	public void m3() {
		System.out.println("M3 Method");		
	}

	@Override
	public void m4() {
		System.out.println("M4 Method");		
	}
	
}

public class Client {

}
