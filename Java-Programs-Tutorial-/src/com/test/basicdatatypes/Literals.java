package com.test.basicdatatypes;

public class Literals {

	static int a;
	static byte b;
	static short c;
	static long d;
	static float e;
	static double f;
	static boolean g;
	static char h;
		
	public static void main(String[] args) {
		
		int decimal=100;
		int octal=0144;
		int hexa=0X64;
		System.out.println(decimal);
		System.out.println(octal);
		System.out.println(hexa);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		String ch="\uffff";
		System.out.println(ch);//output is ? though it is double quotes
		String cha="\uffff";
		System.out.println(cha);//output is ?
		
		String s="\"Hello World\"";
		System.out.println(s);
		
		String r="Hello\nWorld";
		System.out.println(r);
		
		String r1="Hello \r World";//return carriage
		System.out.println(r1);
		
		String r3="Hello\fWorld";//form feed
		System.out.println(r3);
		
		String r4="Hello \b World";
		System.out.println(r4);
		
		String r5="Hello\tWorld";
		System.out.println(r5);
	}

}
