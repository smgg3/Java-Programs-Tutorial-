package com.test.characterclass;

public class CharacterClass {

	public static void main(String[] args) {
	
		char c='a';
		Character ch=new Character('b');
		Character cha='c';
		
		//isLetter()
		System.out.println(Character.isLetter('c'));//true
		System.out.println(Character.isLetter('5'));//false
		
		//isDigit()
		System.out.println(Character.isDigit('5'));//true
		System.out.println(Character.isDigit('c'));//false
		
		//isWhitespace()
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
		
		//idUpperCase()
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));
		
		//isLowerCase()
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));
		
		//toUpperCase()
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('A'));
		
		//toLowerCase()
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('a'));
		
		//toString()
		System.out.println(Character.toString('a'));
		System.out.println(Character.toString('a') instanceof String);
	}

}
