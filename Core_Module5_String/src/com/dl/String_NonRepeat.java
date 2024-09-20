package com.dl;

public class String_NonRepeat {
	
	public static void main(String[] args) {
		
	
	
	String s = "javadeveloper";
	int n = s.length();
    for (int i = 0; i < n; ++i) {
        boolean found = true;

        for (int j = 0; j < n; ++j) {
            if (i != j && s.charAt(i) == s.charAt(j)) {
                	System.out.println();
        }
    }

}
	}
}