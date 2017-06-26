package com.test.gregoriancalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianConstructors {

	public static void main(String[] args) {
		
		GregorianCalendar g=new GregorianCalendar();
		
		System.out.println(g);
		
		GregorianCalendar g1=new GregorianCalendar(2017,5,1);
		
		System.out.println(g1);
		
		GregorianCalendar g2=new GregorianCalendar(2017,5,1,1,10);
		
		System.out.println(g2);
		
		GregorianCalendar g3=new GregorianCalendar(2017,5,1,1,10,5);
		
		System.out.println(g3);
		
		GregorianCalendar g4=new GregorianCalendar(java.util.SimpleTimeZone.getTimeZone("America/Los_Angeles"));
		
		System.out.println(g4);
		
		GregorianCalendar g5=new GregorianCalendar(java.util.Locale.TAIWAN);
		
		System.out.println(g5);
		
		GregorianCalendar g6=new GregorianCalendar(java.util.SimpleTimeZone.getTimeZone("America/Los_Angeles"),java.util.Locale.CANADA);
		
		System.out.println(g6);
		

	}

}
