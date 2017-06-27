package com.test.innerclasses;

abstract class AnonymousClass{
	public abstract void print();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		AnonymousClass  inner=new AnonymousClass(){
			public void print(){
				System.out.println("From Inner Anonymous Class abstract class");
			}
		};
		inner.print();
		Anonymous obj=new Anonymous(){
			public void print(){
				
				System.out.println("From Anonymous inner class interface");
			}
		};
	}

}
