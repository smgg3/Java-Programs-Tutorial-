package com.test.stringsclass;

import java.io.UnsupportedEncodingException;

public class StringClassMathods {

	public static void main(String[] args) {
		
		String s="Hello";
		char[] c={'H','e','l','l','p'};
		
		//length()
		System.out.println(s.length());
		
		//concat()
		System.out.println(s.concat(" World"));
		
		//format()
		String s1=String.format("Hi %f, Hello %d Hey %s",5.8f,8,"sai");
		System.out.println(s1);
		
		//charAt()
		System.out.println(s.charAt(2));
		
		//compareTo()
		String s2=new String("Hello");//object
		System.out.println(s.compareTo(s2));
		
		//compareTo()
		System.out.println(s.compareTo("hello"));
		
		//compareToIgnoreCase()
		System.out.println(s.compareToIgnoreCase("hello"));
		
		//concat()
		System.out.println(s.concat("Hi"));
		
		//contentEquals()
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(s.contentEquals(sb));
		System.out.println(s.contentEquals(s));
		
		//copyValueOf()
		
		System.out.println(String.copyValueOf(c));
		
		//copyValueOf()
		System.out.println(String.copyValueOf(c,1,2));
		
		//endsWith()
		System.out.println(s.endsWith("lo"));
		
		//equals()
		System.out.println(s);
		System.out.println(s.equals("Hello"));
		
		//equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase("hello"));
		
		//getBytes()
		try {
			System.out.println(s.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getBytes()
		System.out.println(s.getBytes());
		
		//getChars()
		char[] c1=new char[10];
		s.getChars(1,3,c1,2);
		System.out.println(c1);
		
		//hashCode()
		System.out.println(s.hashCode());
		
		//indexOf()
		System.out.println(s.indexOf('l'));
		
		//indexOf()
		System.out.println(s.indexOf('l',3));
		
		//indexOf()
		System.out.println(s.indexOf("lo"));
		
		//indexOf()
		System.out.println(s.indexOf("lo",3));
		
		//intern()
		String c3="Hello";
		String c2="Hlloe";
		System.out.println(c2.equals(c3));
		c2=c2.intern();
		c3=c3.intern();
		System.out.println(c2.equals(c3));
		System.out.println(c2.intern());
		System.out.println(c3.intern());
		
		//indexOf()
		System.out.println(s.lastIndexOf('l'));
		
		//lastIndexOf()
		System.out.println(s);
		System.out.println(s.lastIndexOf('l',1));
		
		//lastIndexOf()
		System.out.println(s.lastIndexOf("l"));
		
		//lastIndexOf()
		System.out.println(s.lastIndexOf("l",2));
		
		//length()
		System.out.println(s.length());
		
		//matches()
		System.out.println(s.matches("(.*)ll(.*)"));
		
		//regionMatches()
		System.out.println(s.regionMatches(2,"ll",0,2));
		
		//replace()
		System.out.println(s.replace('l', 'L'));
		
		//replaceAll()
		System.out.println(s);
		System.out.println(s.replaceAll(".*","Hello"));//HelloHello
		System.out.println(s.replaceAll(".+","Hello"));//Hello
		
		//replaceFirst()
		System.out.println(s.replaceFirst(".*","Hello"));//Hello
		System.out.println(s.replaceAll(".+","Hello"));//Hello
		
		//split()
		String[] array="Hello#World#How-R-u".split("#",2);
		for(String i:array){
			System.out.println(i);
		}
		
		//split()
		array="Hello#World#How-R-u".split("#");
		for(String i:array){
			System.out.println(i);
		}
		
		//startsWith()
		System.out.println(s.startsWith("H"));
		
		//startsWith()
		System.out.println(s.startsWith("l",1));
		
		//subSequence()
		System.out.println(s.subSequence(1,3));
		
		//substring()
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(1));
		
		//toCharArray()
		for(char c4:s.toCharArray()){
			System.out.println(c4);
		}
		
		//toLowerCase()
		System.out.println(s.toLowerCase());
		
		//toUpperCase()
		System.out.println(s.toUpperCase());
		
		//toString()
		System.out.println(s.toString());
		
		//trim()
		System.out.println("  Hello  ".trim());
		
		//valueOf()
		System.out.println(String.valueOf(1.3f));	
	}

}
