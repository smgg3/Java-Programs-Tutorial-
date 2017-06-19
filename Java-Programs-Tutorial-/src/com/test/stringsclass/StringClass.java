package com.test.stringsclass;

public class StringClass {

	public static void main(String[] args) {
	
		//how to create string
		char[] c={'h','e','l','l','o'};
		String s=new String(c);
		System.out.println(s);
		System.out.println(new String("Hello"));
		byte[] b={1,2,3,4,5};
		System.out.println(new String(b));
		
		StringBuilder s1=new StringBuilder("World");
		System.out.println(s1);
		
		StringBuilder[] array;
		
		StringBuffer s2=new StringBuffer("Hi");
		System.out.println(s2);

	}

}
