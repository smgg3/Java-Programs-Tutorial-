package com.test.modifiertypes;

public final class FinalModifier {				//we can't inherit it
	
	static final FinalModifier f=new FinalModifier();//we can't assign other reference to it.
	int a=10;
	final int b=10;									//we can't assign some other value to it
	 FinalModifier(){
		
	}
	 final void add(){				//we can't override it
		 
	 }
	public static void main(String[] args) {
		
		f.a=12;
	}

}
/*we can't extend final class */
//class S extends FinalModifier{
//	
//}
