package com.test.gregoriancalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianMethods {

	public static void main(String[] args) {
		
		GregorianCalendar g=new GregorianCalendar();
//		System.out.println(g.get(0));
//		System.out.println(g.get(1));
//		System.out.println(g.get(2));
//		System.out.println(g.get(3));
//		System.out.println(g.get(4));
//		System.out.println(g.get(5));
//		System.out.println(g.get(6));
//		System.out.println(g.get(10));
		//ERA=1,YEAR=2017,MONTH=5,WEEK_OF_YEAR=26,WEEK_OF_MONTH=5,DAY_OF_MONTH=25,DAY_OF_YEAR=176,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=21,SECOND=39,MILLISECOND=410,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]
		System.out.println(g);
		
		//get()
			System.out.println(g.get(2));
			System.out.println(g.get(Calendar.MONTH));
			System.out.println(Calendar.MONTH);
		
		//add()
		//	g.add(2, 2);
			System.out.println(g.get(2));
		
		//equals()
			System.out.println(g.equals(new GregorianCalendar()));//depending on running time it will give true false if running time takes more than one milli second this object takes one milli second more so both are not equal
			System.out.println(g.equals(new Date()));				//always false
		
		//getActaulMaximum()
			System.out.println(g.getActualMaximum(4));
			
		//getActualMinimum()
			System.out.println(g.getActualMinimum(13));
		
		//getGreatestMinimum()
			System.out.println(g.getGreatestMinimum(5));
			
		//getGregorianChange()
			System.out.println(g.getGregorianChange());
		
		//int getLeastMaximum(int field)
			System.out.println(g.getLeastMaximum(4));
		
		//getMaximum(field)
			System.out.println(g.getMaximum(2));
		
		//getTime()
				System.out.println(g.getTime());
				
		//getTimeInMillis()
				System.out.println(g.getTimeInMillis());
		
		//getTimeZone()
				System.out.println(g.getTimeZone());
		
		//getMinimum()
				System.out.println(g.getMinimum(2));
				
		//hashCode()
				System.out.println(g.hashCode());
			
		//isLeapYear()
				System.out.println(g.isLeapYear(2000));
		
		//roll()
				g.roll(2,true);
				System.out.println(g);//g.roll(2, 1);
		//set()
				GregorianCalendar g1=new GregorianCalendar();
				System.out.println(g1);
				g1.set(2018, 4, 5, 7, 30,30);
				System.out.println(g1);
				
		//setGregorianTime()
				g1.setGregorianChange(new Date());
				System.out.println(g1);
			
		//toString()
				System.out.println(g1.toString());
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
