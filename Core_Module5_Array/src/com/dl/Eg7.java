package com.dl;

import java.util.Arrays;

public class Eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[5];
		
		System.out.println(a);
		
		Arrays.fill(a, 10);
		System.out.println(Arrays.toString(a));
		
		int x[]= {10,20,30};
		int y[]= {10,20,30};
		
		int z[]= {10,20};
		System.out.println(Arrays.equals(x, y));
		System.out.println(Arrays.equals(x, z));
		
		int i[] = {10,30,50,40,20};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));


	}

}
