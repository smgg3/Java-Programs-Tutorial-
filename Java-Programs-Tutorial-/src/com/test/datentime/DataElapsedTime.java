package com.test.datentime;
import java.util.Date;
public class DataElapsedTime {

	public static void main(String[] args) {
		
		try{
			long start=System.currentTimeMillis();
			System.out.println(new Date());
			Thread.sleep(10000);
			long end=System.currentTimeMillis();
			System.out.println(new Date());
			long diff=end-start;
			System.out.println("Elapsed time is :"+diff);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
