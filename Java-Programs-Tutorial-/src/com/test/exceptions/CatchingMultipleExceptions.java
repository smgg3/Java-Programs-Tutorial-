package com.test.exceptions;

public class CatchingMultipleExceptions {

	public static void main(String[] args) {
		
		try{
			int a=1/0;
			int[] array={1,2};
			System.out.println(array[2]);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}
