package com.dl;

public class Stringpalindrome {

	public static void main(String[] args) {

		String s = "abcdeescba";
		boolean flag = true;// default true
		for (int i = 0; i <= s.length()/2; i++) {
			flag=true;
			char left = s.charAt(i);
			char right = s.charAt(s.length() - 1 - i);
			if (left!= right) {
				flag = false;// if not equals
				break;
				}
			}
			if (flag)
				System.out.println("palindrome");
			else
				System.out.println("not palindrome");
		}
	}

