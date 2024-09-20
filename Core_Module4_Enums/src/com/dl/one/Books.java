package com.dl.one;

import java.util.Iterator;

//Enums are set of named Constrains
public enum Books {
	
	JAVABOOK, PYTHONBOOK,JSBOOK,REACTBOOK;
	
	public static void main(String[]args) {
		
		System.out.println(Books.JAVABOOK);
		System.out.println(Books.valueOf("PYTHONBOOK"));
	
	Books[] values = Books.values();
	for (Books books : values) {
		System.out.println(books +""+books.ordinal());
	}
	}

	
}
