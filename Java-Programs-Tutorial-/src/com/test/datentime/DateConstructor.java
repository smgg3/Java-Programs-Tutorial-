package com.test.datentime;
import java.util.Date;

public class DateConstructor {

	public static void main(String[] args) {
		
		Date current =new Date();
		System.out.println(current.toString());
		Date d=new Date(10000000);
		System.out.println(d.toString());
		
	System.out.println(new Date(12,3,2018));
//	
//	System.out.println(new Date());
//	
//	System.out.println(new Date(2018,3,12,6,30));
//	
//	System.out.println(new Date(12,3,2018,6,30,30));
//	
//	System.out.println(new Date("2018-12-03"));
	

	}

}
