package com.test.innerclasses;



class OuterCls {

	int num;
	private int x=10;
	 class InnerCls{
		
		public int getPrivate(){
			System.out.println("From InnerClass returned private varible x;");
			return x;
		}	
	}
}
public class InnerClassPrivateVariables {

	public static void main(String[] args) {
		OuterCls outer=new OuterCls();
		OuterCls.InnerCls inner=outer.new InnerCls();
		System.out.println(inner.getPrivate());
		
	}

}
