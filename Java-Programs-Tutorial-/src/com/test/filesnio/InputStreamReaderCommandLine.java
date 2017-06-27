package com.test.filesnio;
import java.io.*;
public class InputStreamReaderCommandLine {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input=new InputStreamReader(System.in);
		//InputStreamReader input=new InputStreamReader(new FileInputStream("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//input.txt"));
		char c;
		System.out.println("Enter q to quit");
		do{
			c=(char)input.read();
			System.out.print(c);
		}while(c!='q');
		
		OutputStreamWriter output=new OutputStreamWriter(System.out);
		output.write("sravani");
		if(input!=null)
				input.close();

	}

}
