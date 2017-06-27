package com.test.innerclasses;

interface Anonymous{
	public void print();
}
public class AnonymousInnerClassAsArgument {

	public void method(Anonymous inner){
		inner.print();
	}
	public static void main(String[] args) {
		
		AnonymousInnerClassAsArgument outer=new AnonymousInnerClassAsArgument();
		outer.method(new Anonymous(){
			public void print(){
				System.out.println("From anonymous argument inner class ");
			}
			
		});

	}

}
