package com.test.basicoperators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a=0b111100;
		int b=5;
		int c;
		System.out.println(a);
		c=a|b;
		System.out.println(c);
		c=a&b;
		System.out.println(c);
		c=a^b;
		System.out.println(c);
		c=~a;
		System.out.println(c);
		c=a<<2;
		System.out.println(c);
		c=a>>2;
		System.out.println(c);
		c=a>>>2;
		System.out.println(c);
	

	}

}
