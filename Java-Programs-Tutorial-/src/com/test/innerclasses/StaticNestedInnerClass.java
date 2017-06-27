package com.test.innerclasses;

public class StaticNestedInnerClass {

	static class StaticInnerClass{
		
		public void print(){
			System.out.println("From static inner class method");
		}
	}
	
	public static void main(String[] args) {
		
		StaticNestedInnerClass.StaticInnerClass inner=new StaticNestedInnerClass.StaticInnerClass();
		inner.print();

	}

}
