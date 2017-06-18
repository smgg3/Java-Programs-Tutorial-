package com.test.modifiertypes;

public class StaticModifier {
	static int a=10;
	int b;
	StaticModifier(){
		add();
	}
	static void add(){
		System.out.print(a+new StaticModifier().b);
	}

	public static void main(String[] args) {
		StaticModifier obj=new StaticModifier();
		obj.add();
		add();
		System.out.println(a);
	}

}
