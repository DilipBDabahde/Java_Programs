/*
in this program we are taking input as file and read input of that file in byteformat but to complete this task we have to use java's inbuild classes such FileInputStrea to read file in byte format
and another to write into file FileOutputStream in Byte format
*/

import java.io.*;


class FileIO
{
	
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		
		try
		{
			FileInputStream fi = new FileInputStream("abc.text");
			FileOutputStream fo = new FileOutputStream("ioutput.text");
			
			
			int i = 0;
			while((i = fi.read()) != -1)
			{
				//System.out.print((char)i);
				fo.write(i);
			}
			System.out.println("Data write successfully");			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
	}
}
