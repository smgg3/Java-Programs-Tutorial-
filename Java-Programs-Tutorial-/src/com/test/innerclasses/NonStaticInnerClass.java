package com.test.innerclasses;

class OuterClass {

	int num;
	private int x=10;
	private class InnerClass{
		
		public void print(){
			System.out.println("From InnerClass ;"+num+x);
			//displayInnerClass();  // we can't call because it will create infinite loop
		}
		
	}
	 void displayInnerClass(){				//we can't return the object for Innerclass though we return using that object we cant use class sections
		InnerClass obj=new InnerClass();
		obj.print();
	}

}
public class NonStaticInnerClass{
	
	public static void main(String[] args){
	OuterClass obj=new OuterClass();
	obj.displayInnerClass();
	
	}
}
