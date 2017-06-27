package com.test.filesnio;
import java.io.*;
public class ByteArrayInputOutputStream {

	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream output=new ByteArrayOutputStream(12);
		//while(output.size()!=10){
		output.write(new byte[] {1,2,3,4,5,6,7,8,9,10});
		//}
		
		
		byte[] in=output.toByteArray();
		for(int i=0;i<in.length;i++){
			System.out.println(in[i]);
		}
		
		ByteArrayInputStream input=new ByteArrayInputStream(in);
		input.mark(3);
		System.out.println(input.read());
		System.out.println("Available bytes :"+input.available());
		byte[] b=new byte[6];
		System.out.println("Read "+input.read(b,0,3)+" bytes");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println(input.skip(5));
		System.out.println(input.read(b,0,4));
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
