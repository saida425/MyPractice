package com.dl;

public class String_Duplicate {

	public static void main(String[] args) {
		
		String s = "java";
		
		int count=0;
		 
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i] == charArray[j]) {
					System.out.println("Duplicate char in string are :" +charArray[j]);
					count++;
				}
			}
		}
		System.out.println("duplicate charaters coutn :"+count);
	}

}