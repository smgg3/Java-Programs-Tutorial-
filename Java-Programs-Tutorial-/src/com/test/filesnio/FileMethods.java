package com.test.filesnio;
import java.io.*;
public class FileMethods {

	public static void main(String[] args) throws IOException {
		File f=new File("C://Users//Sravani Chowdary//Documents//GitHub//Java-Programs-Tutorial-//Java-Programs-Tutorial-//src//com//test//filesnio");
		if(!f.exists())
			System.out.println(f.mkdirs());
		else
			System.out.println("File Already Exits");
		File[] files;
		String[] paths;
		paths=f.list();
		for(String path:paths){
			System.out.println(path);
		}
		files=f.listFiles();
		for(File file:files){
			System.out.println(file);
		}
	}

}
