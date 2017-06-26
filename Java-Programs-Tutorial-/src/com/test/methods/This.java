package com.test.methods;

public class This {
	
	int x=10;
	This(){
		
	}
	This(int x){
		this();
		System.out.println(this.x);
		
	}
	void sum(int x){
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		

	}

}
