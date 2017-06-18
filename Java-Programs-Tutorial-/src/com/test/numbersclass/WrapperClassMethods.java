package com.test.numbersclass;

public class WrapperClassMethods {

	public static void main(String[] args) {
		//xxxValue()
		Integer a=10;
		float f=a.byteValue();
		System.out.println(f);
		
		//compareTo()
		int b=a.compareTo(15);
		System.out.println(b);
		
		//equals
		boolean flag=a.equals(10);
		System.out.println(flag);
		
		//valueOf()
		f=Float.valueOf(a);
		System.out.println(f);
		System.out.println(Integer.valueOf("444",8));
		
		//toString()
		String s=a.toString();
		System.out.println(s);
		
		//parseInt()
		int c=Integer.parseInt("10",2);
		System.out.println(Integer.parseInt("444",16));
		
		//abs()
		System.out.println(Math.abs(10.2f));
		
		//ceil()
		System.out.println(Math.ceil(10.3));
		
		//floor()
		System.out.println(Math.floor(10.3));
		
		//rint()
		System.out.println(Math.rint(10.8));
		
		//round
		System.out.println(Math.round(10.5));
		
		//min()
		System.out.println(Math.min(10,11));
		
		//max()
		System.out.println(Math.max(10, 11));
		
		//exp()
		System.out.println(Math.exp(100));
		
		//log()
		System.out.println(Math.log(10.3));
		
		//pow()
		System.out.println(Math.pow(5, 9));
		
		//sqrt()
		System.out.println(Math.sqrt(10));
		
		//sin()
		System.out.println(Math.sin(Math.toRadians(45)));
		
		//cos()
		System.out.println(Math.cos(Math.toRadians(45)));
		
		//tan()
		System.out.println(Math.tan(Math.toRadians(45)));
		
		//asin()
		System.out.println(Math.toDegrees(Math.asin(Math.cos(Math.toRadians(45)))));
		
		//acos()
		System.out.println(Math.toDegrees(Math.acos(Math.sin(Math.toRadians(45)))));
		
		//atan()
		System.out.println(Math.toDegrees(Math.atan(Math.sin(Math.toRadians(45)))));
		
		//atan2()
		System.out.println(Math.atan2(45,30));
		
		//toDegrees()
		System.out.println(Math.toDegrees(0.5));
		
		//toRadians()
		System.out.println(Math.toRadians(28.64788975654116));
		
		//random()
		System.out.println(Math.random());
	}

}
