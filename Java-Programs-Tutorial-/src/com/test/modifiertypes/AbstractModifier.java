package com.test.modifiertypes;

public abstract class AbstractModifier {//with only abstract methods

	abstract int add();
	abstract int diff();
}	
abstract class AbstractModifier1 {//with both abstract and normal methods

	int add(){
		return 0;
	}
	abstract int diff();
}	
 abstract class AbstractModifier2 {//with only normal methods bur we cant instantiate the class

	final int add(){
		return 0;
	}
	 int diff(){
		return 0;
	}
}	
 
abstract class New extends AbstractModifier2{
	abstract int mul();
}
class SubNew extends AbstractModifier1{

	@Override
	int diff() {
		
		return 0;
	}
	
}

