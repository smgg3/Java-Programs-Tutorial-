package com.test.modifiertypes;

 class ProtectedModifiers {

	protected int a;
	protected void add(){
		
	}
	protected ProtectedModifiers() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args){
		
	}

}
 class Speaker{
	 
 }
 class AudioPlayer {
	 protected boolean openSpeaker(Speaker sp) {
	 // implementation details
		 return true;
	 }
	}
class StreamingAudioPlayer extends AudioPlayer{
	  protected boolean openSpeaker(Speaker sp) {
	 // implementation details
		 return true;
	 }
	}