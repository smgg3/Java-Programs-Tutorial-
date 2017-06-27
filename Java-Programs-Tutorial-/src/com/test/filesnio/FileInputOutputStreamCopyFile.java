package com.test.filesnio;
import java.io.*;
public class FileInputOutputStreamCopyFile {

	public static void main(String[] args) throws IOException{
		File fip=new File("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//input.txt");
		File fop=new File("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//output.txt");
		if(!fip.exists())
			fip.createNewFile();
		else
			System.out.println("Input Already File Exists");
		if(!fop.exists())
			fop.createNewFile();
		else
			System.out.println("Output Already File Exists");
		
		System.out.println(fip.getAbsolutePath());
		FileInputStream input=new FileInputStream(fip);
		FileOutputStream output=new FileOutputStream(fop);
		//FileInputStream input=new FileInputStream("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//input.txt");
		//FileOutputStream output=new FileOutputStream("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//output.txt");
		int s;
		int count=0;
		
		//read(byte[] r)
				byte[] r = new byte[10];
				System.out.println(input.read(r));
				for(int i=0;i<r.length;i++){
					System.out.println(r[i]);
				}
				
		//available()
				System.out.println("Available bytes to read from file :"+input.available());
				
		while((s=input.read())!=-1){
			output.write(s);
			count++;
		}
		output.write(new byte[]{106,107,108});
		System.out.println("Count"+count);
		
		
		if(input!=null)
			input.close();
		if(output!=null)
			output.close();
	}

}
