package com.test.modifiertypes;

interface Fields{
	int key=0;	//by default public static final
	void add();//by default public method
}

public class InterfaceFieldsMethods implements Fields{

	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=key;
	}

	

}
