package com.test.filesnio;
import java.io.*;
public class FileReaderWriterCopyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader input=new FileReader("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//input.txt");
		FileWriter output=new FileWriter("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//output.txt");
		int count=0;
		int s;
		while((s=input.read())!=-1){
			output.write(s);
			count++;
		}
		output.write('c');
		output.write("hello");
		output.write("hello",1,2);
		output.write(new char[]{'h','i'});
		System.out.println(count);
		if(input!=null)
				input.close();
		if(output!=null)
				output.close();
		
	}

}
