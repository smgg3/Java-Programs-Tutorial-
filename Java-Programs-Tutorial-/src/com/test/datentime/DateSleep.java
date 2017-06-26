package com.test.datentime;
import java.util.Date;

public class DateSleep {

	public static void main(String[] args) {
		try{
		System.out.println(new Date());
		Thread.sleep(5*60*10);
		System.out.println(new Date());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
