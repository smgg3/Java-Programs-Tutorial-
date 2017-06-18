package com.test.variabletypes;

public class StaticVariables {

	static int a;
	public static int b;
	
	int f;
	
	private static int c;
	
	public static final int d=10;   //we need to intialize
	
	static{
		a=10;			//we can intialize in static blocks
	}
	public static void add(){
		StaticVariables obj=new StaticVariables();
		System.out.println(a+obj.f);     //
	}

	public static void main(String[] args) {
		
		b=12;
		StaticVariables.c=15;   //if we want to use it in other classes use classname.variablename format

	}

}
