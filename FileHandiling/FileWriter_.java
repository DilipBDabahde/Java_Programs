

import java.io.*;
//file writer

class FileWriter_
{
	public static void main(String args[])
	{
		try
		{
		
			FileWriter fw = new FileWriter("data.text");
			
			fw.write("i am student\n");
			
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured :"+e);
		}
	
	
	}

}
