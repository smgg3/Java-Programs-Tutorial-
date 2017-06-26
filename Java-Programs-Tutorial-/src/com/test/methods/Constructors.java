package com.test.methods;

public class Constructors {
	static int x;
	int y;
	static{
		System.out.println(x);
	//	System.out.println(y);
	}
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void sum(int x,int y){
		System.out.println(x);
		//System.out.println(y);   //we can't use non static in static method
	}
	void dif(int x,int y){
		System.out.println(this.x);
		System.out.println(this.y);
	}
	Constructors(int x){
		System.out.println(this.x);
		this.dif(2, 3);
	}
	public Constructors() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Constructors c=new Constructors();
	}

}
