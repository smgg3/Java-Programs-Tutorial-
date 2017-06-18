package com.test.variabletypes;

public class InstanceVariables {

	int age;								//instance variable
	
	static String name;
	
//	static {
//		name="sravani";
//	}
//	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	int add(){
								//if don't initialize it will set default value to 0
		age=age+10;
		System.out.println(name);
		return age;				
	}

	public static void main(String[] args) {
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.add());
		obj.name="sai";
		

	}
}
