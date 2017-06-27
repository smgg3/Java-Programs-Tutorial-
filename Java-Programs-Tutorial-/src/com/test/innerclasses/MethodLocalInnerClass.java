package com.test.innerclasses;

public class MethodLocalInnerClass {

	void method(){
		int num=10;
		class InnerClass{
			public void print(){
				System.out.println("From inner class");
			}
		}
		InnerClass inner=new InnerClass();
		inner.print();
	}
	public static void main(String[] args) {
		
		MethodLocalInnerClass outer =new MethodLocalInnerClass();
		outer.method();

	}

}
