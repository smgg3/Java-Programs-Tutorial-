package com.test.exceptions;

import java.io.File;

public class UnCheckedExceptions {

	public static void main(String[] args) {
		try{
			int c=5/0;
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
			e.printStackTrace();
			for(StackTraceElement ele:e.getStackTrace()){
				System.out.println(ele.getMethodName()+"\t"+ele.getFileName()+"\t"+ele.toString());
			}
			System.out.println(e.fillInStackTrace().toString());
			for(StackTraceElement ele:e.fillInStackTrace().getStackTrace()){
				System.out.println(ele.getMethodName()+"\t"+ele.getFileName()+"\t"+ele.toString());
			}
		}

	}

}
