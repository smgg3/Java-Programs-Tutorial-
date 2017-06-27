package com.test.filesnio;
import java.io.*;

public class DataInputOutputStream {

	public static void main(String[] args) throws IOException{
		
		File fop=new File("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio//dataoutput.txt");
		if(!fop.exists())
			fop.createNewFile();
		else
			System.out.println("Output Already File Exists");
		
		DataOutputStream output=new DataOutputStream(new FileOutputStream(fop));
		output.writeUTF("Sravani");
		
		DataInputStream input =new DataInputStream(new FileInputStream(fop));
		int count=0;
		while(input.available()>0){
			System.out.println(input.readUTF());
			count++;
		}
		System.out.println("count :" +count);
	}

}
