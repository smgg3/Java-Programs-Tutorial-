package com.test.datentime;

import java.util.Date;
import java.text.*;
public class DateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat format=new SimpleDateFormat("E y.dd.MM 'at' hh:mm:ss a zzz G");
		
		Date d=new Date();
		
		System.out.println(format.format(d));
		
		//G Era designator AD
		System.out.println(new SimpleDateFormat("G").format(d));
		
		//y year in four digits
		System.out.println(new SimpleDateFormat("y").format(d));
		
		//M month in year
		System.out.println(new SimpleDateFormat("M").format(d));
		
		//d day in month
		System.out.println(new SimpleDateFormat("d").format(d));
		
		//h hour in day in AM or PM
		System.out.println(new SimpleDateFormat("h").format(d));
		
		//H hour in a day 0 to 23 hour
		System.out.println(new SimpleDateFormat("H").format(d));
		
		//m minute in hour
		System.out.println(new SimpleDateFormat("m").format(d));
		
		//s second in minute
		System.out.println(new SimpleDateFormat("s").format(d));
		 
		//S millisecond
		System.out.println(new SimpleDateFormat("S").format(d));
		
		//E day in a week
		System.out.println(new SimpleDateFormat("E").format(d));
		
		//D day in a year
		System.out.println(new SimpleDateFormat("D").format(d));
		
		//F day of a week in a month
		System.out.println(new SimpleDateFormat("F").format(d));
		
		//w week in a year
		System.out.println(new SimpleDateFormat("w").format(d));
		
		//a AM PM marker
		System.out.println(new SimpleDateFormat("a").format(d));
		
		//k hour in a day 1-24
		System.out.println(new SimpleDateFormat("k").format(d));
		
		//K hour in 0-11 AM PM
		System.out.println(new SimpleDateFormat("K").format(d));
		
		//z time zone eastern standard time
		System.out.println(new SimpleDateFormat("z").format(d));
		
		//' escape for text  delimeter
		System.out.println(new SimpleDateFormat("yy:MM:dd 'at' hh:mm:ss").format(d));
		
		//we use a two letter format start with %t and concat with any of the above letter mentioned
		String s=String.format("Current date %tc", d);
		System.out.printf(s);
		System.out.println();
		
		//It would be a bit silly if you had to supply the date multiple times to format each part. For
		//that reason, a format string can indicate the index of the argument to be formatted.
		//The index must immediately follow the % and it must be terminated by a $. For example:

		System.out.printf("%1$s %2$tB %2$td %2$tm %2$ty","Date :",d);
		
		//Alternatively, you can use the < flag. It indicates that the same argument as in the
		// format specification should be used again. For example:
		System.out.printf("%s %tB %<td %<tm %<ty ", "Date :",d);
		System.out.println();
		
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		String input=args.length==0?"2018-14-05":args[0];
		
		try{
		
		Date t=f.parse(input);
		System.out.println(t);
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
	}

}
