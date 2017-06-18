package com.test.variabletypes;

public class LocalVariables {

		
	static int add(){
		int age=0;							//it is local variable scope is add method
		//int age;							//if dont initialize it will give error i.e variable number might not have been initialized
		age=age+10;
		return age;				
	}

	public static void main(String[] args) {
		
		System.out.println(add());

	}

}
