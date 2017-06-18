package com.test.modifiertypes;
class MyRunnable implements Runnable{
	 private volatile boolean active;
	 public void run(){
	 active = true;
	 while (active){ // line 1
	System.out.println("Hello");
	Thread.currentThread();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
	 }
	 public void stop(){
	 active = false; // line 2
	 } }
public class VolatileModifier {

	public static void main(String[] args) {
		MyRunnable t1=new MyRunnable();
		MyRunnable t2=new MyRunnable();
		t1.run();
		t2.stop();
		
	}

}
