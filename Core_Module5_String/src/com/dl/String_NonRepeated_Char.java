package com.dl;

public class String_NonRepeated_Char {

	public static void main(String[] args) {
		String s = "javadeveloper";

		char[] charArray = s.toCharArray();//convert string into array

		for (char i : s.toCharArray()) {//check the condition 
			if (s.indexOf(i) == s.lastIndexOf(i)) {
				System.out.println("The first character which is not repeating is: " + i);
				
				break;//if you don't put this it will find all non repeated value will print
				
			}
		}

	}
}
