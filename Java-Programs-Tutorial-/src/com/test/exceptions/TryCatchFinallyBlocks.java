package com.test.exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyBlocks {

	public static void main(String[] args) {
		FileInputStream input=null;
		try{
			int[] array={1,2};
//			System.out.println(array[2]);
			input=new FileInputStream("path");
			input.read();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
