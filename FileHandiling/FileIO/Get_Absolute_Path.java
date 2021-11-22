/*
accept filename from user and and display its absolute path
*/

import java.io.*;

class Get_Absolute_Path
{
	public static void main(String args[])
	{
		//creating object of File class to get access of file properties
		File fobj = new File(args[0]);
		
		//create String class / type variable to store absolute path in it
		String AbsPath = fobj.getAbsolutePath();
		
		//Display return value
		System.out.println(AbsPath);		

	}
}


