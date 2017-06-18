package com.test.modifiertypes;

public class SynchronizedModifier extends Thread {

	public static synchronized void print(){
		
			System.out.println(Thread.currentThread().getId());
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new Runnable(){
			
			public void run(){
				for(int i=0;i<10;i++){
				print();
					}
			};
			
		});
		Thread t2=new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10;i++)
				{
				print();}
			}
		});
	
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	

}
