package com.test.stringsclass;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Hello");
		System.out.println(s);
		//append()
		s.append(true);
		System.out.println(s);
		s.append('a');
		System.out.println(s);
		s.append(4);
		System.out.println(s);
		s.append(5.0);
		System.out.println(s);
		char c[]={'a','b'};
		s.append(c);
		System.out.println(s);
		s.append(5.0f);
		System.out.println(s);
		char[] d={'W','o','r','l','d','c','f'};
		s.append(d,0,5);
		System.out.println(s);
		Object obj=new Object();
		s.append(obj);
		System.out.println(s);
		s.append("Good");
		System.out.println(s);
		s.append(new StringBuffer("Bye"));
		System.out.println(s);

		//reverse()
		s.reverse();
		System.out.println(s);
		
		//delete()
		s.delete(7,28);
		System.out.println(s);
		
		//insert
		s=new StringBuffer("Hello");
		s.insert(3, "hi");
		System.out.println(s);
		s.insert(1,d,2,4);
		System.out.println(s);
		
		//replace
		s=new StringBuffer("Hello");
		s.replace(4, 5, "hi");
		System.out.println("8"+s);//Hhio we given end-start 3 but we have 2 length string then it will remove 3 length string from s and appends 2 length hi
		
		//capcity()
		s=new StringBuffer("Hello");
		System.out.println(s.capacity());
		
		//charAt()
		System.out.println(s.charAt(1));
		
		//ensureCapacity()
		s.ensureCapacity(22);
		System.out.println(s.capacity());
		
		//getChars()
		char[] ch=new char[10];
		s.getChars(0, 3, ch, 0);
		System.out.println(ch);
		
		//indexOf()
		System.out.println(s.indexOf("llo"));
		
		//indexOf()
		System.out.println(s.indexOf("l",3));
		
		//lastIndexOf()
		System.out.println(s.lastIndexOf("l"));
		
		s.append("ll");
		//lastIndexOf()
		System.out.println(s);
		System.out.println(s.lastIndexOf("l",1));
		
		//length()
		System.out.println(s.length());
		
		//setCharAt()
		s.setCharAt(3,'L');
		System.out.println(s);
		
		//setLength()
		s.setLength(5);
		System.out.println(s);
		
		//subSequence()
		System.out.println(s.subSequence(2,4));
		
		//substring()
		System.out.println(s.substring(1));
		
		//substring()
		System.out.println(s.substring(2,4));
		
		//toString()
		System.out.println(s.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
