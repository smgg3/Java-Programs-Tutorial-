package com.test.methods;

public class VarArgs {
	
	static double sum(double...numbers){
		double d=0;
		for(int i=0;i<numbers.length;i++){
			d=d+numbers[i];
			}
		return d;
	}  
	static void dif(String s,int a,char c,boolean b,int...array){
		
		for(int i=0;i<array.length;i++){
			System.out.println(s+a+c+b+array[i]);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum(new double[]{1,2,3,4,5}));
		double[] i={1,2,3,4,5};
		System.out.println(sum(i));
		dif("sravani",1,'a',true,new int[]{1,2,3,4,5});
		dif("sai",2,'b',false,1,2,3,4,5,6);
		int[] j={1,2,3,4,5};
		dif("nani",3,'c',true,j);
	}

}
