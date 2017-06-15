package com.test.objectsnclasses;

public class Singleton {

	private static Singleton singleton=new Singleton();
	/*
	 * if it is design pattern
	 * private static Singleton singleton=null;
	 */
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		return singleton;
		/*
		 * if it is design pattern
		 * if(singleton==null(){
		 * 		singleton=new Singleton();
		 * }
		 * return singleton;
		 */
		 
	}
	protected void demomethod(){
		
	}
}
