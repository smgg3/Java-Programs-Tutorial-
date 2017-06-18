package com.test.loopcontrol;

public class LoopControlStatements {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				
				if(i==j)
					break;			//it will break only inner loop not outer
				System.out.println(j);
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				
				if(i==j)
					continue;			//it will break only inner loop not outer
				System.out.println(j);
			}
		}

	}

}
