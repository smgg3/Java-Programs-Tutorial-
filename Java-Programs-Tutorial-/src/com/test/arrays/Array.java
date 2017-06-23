package com.test.arrays;

public class Array {

	static int[] reverse(int[] arr){
		int[] reverse=new int[arr.length];
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
			reverse[j]=arr[i];
		}
		
		return  reverse;
	}
	public static void main(String[] args) {
		int[] i;
		i=new int[10];
		int[] j={1,2,3,4,5,6,7,8,9,10};
		for(int k:j){
			System.out.println(k);
		}
		for(int k=0;k<10;k++){
			System.out.println(i[k]);
		}
		int[] a=reverse(new int[]{1,2,3,4,5});
		for(int k=0;k<5;k++){
			System.out.println(a[k]);
		}
		reverse(i);
		
		//sort method
		java.util.Arrays.sort(a);
		for(int k=0;k<5;k++){
			System.out.println(a[k]);
		}
		
		//binarySearch()
		System.out.println(java.util.Arrays.binarySearch(a, 5));
		
		//equals()
		System.out.println(java.util.Arrays.equals(a, new int[]{1,2,3,4,5}));
		
		//fill method
		java.util.Arrays.fill(a, 1);
		for(int k=0;k<5;k++){
			System.out.println(a[k]);
		}
	}

}
