package com.test.loopcontrol;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		for(int i : a){
			if(i==3)
				continue;
			System.out.println(i);
			if(i==4)
					break;
		}

	}

}
