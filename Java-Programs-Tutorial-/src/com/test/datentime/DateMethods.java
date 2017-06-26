package com.test.datentime;
import java.util.Date;
import java.text.*;
public class DateMethods {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		Date current=f.parse("01/01/2017");
		Date future =f.parse("01/01/2018");
	
		
		System.out.println(future.after(current));
		System.out.println(future.before(current));
		
		Date d=(Date) current.clone();
		System.out.println(d);
		
		System.out.println(current.compareTo(future));
		
		System.out.println(current.equals(future));
		
		System.out.println(current.getTime());
		
		System.out.println(current.getDate());
		
		System.out.println(current.getClass());
		
		System.out.println(current.hashCode());
		
		current.setTime(1000);
		
		System.out.println(current);
		
		System.out.println(current.toString());
		
		
		
		

	}

}
