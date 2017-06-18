package com.test.basicoperators;
class Operators{}
public class MiscellaneousOperators extends Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=a>b?a:b;
		String name="sravani";
		boolean d=name instanceof String;		//IS-A relationship
		
		
		Operators obj=new MiscellaneousOperators();
		
		boolean e=obj instanceof Operators;
		
		boolean f=obj instanceof MiscellaneousOperators;
		
		System.out.println(e);
		System.out.println(f);
		

	}

}
