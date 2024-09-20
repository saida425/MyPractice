package com.dl;

public class CharCount {

	public static void main(String[] args) {
		
		String s = "hakunamatata";
		//System.out.println(s);
		// count occurrence
		int i = s.length() - s.replace("a", "").length();
		System.out.println("occurrence of a: "+i);
	}

}
