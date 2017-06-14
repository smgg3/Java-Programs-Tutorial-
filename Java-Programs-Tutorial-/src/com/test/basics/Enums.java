package com.test.basics;

public class Enums {

	enum List{small,large,medium};
	List type;

	public static void main(String[] args) {
		Enums e=new Enums();
		e.type=Enums.List.medium;
		System.out.println(e.type
				);
	}

}
