/*
accept file name from user and check user permissions to access file

Read
Write
Execute

input:	java classfile	filename
*/

//import required packaged

import java.io.*;

class Check_File_Read_Write_Execure_Permission
{
	public static void main(String args[])
	{ 
		
		File fobj = new File(args[0]);
	
		if(fobj.exists() == true)	
		{
			
			if(fobj.isFile() == true)
			{
				System.out.println(args[0]+" is existing file");
		
				System.out.printf("%s\n", (fobj.canRead()) ? "Read Access" : "Not Read Access");
				System.out.printf("%s\n", (fobj.canWrite()) ? "Write Access" : "Not Write Access");
				System.out.printf("%s\n", (fobj.canExecute()) ? "Execute Access" : "Not Execute Access");			
			}
			else if(fobj.isDirectory() == true)
			{
				System.out.println(args[0] +" : is a directory");
				
				System.out.printf("%s\n", (fobj.canRead()) ? "Read Access" : "Not Read Access");
				System.out.printf("%s\n", (fobj.canWrite()) ? "Write Access" : "Not Write Access");
				System.out.printf("%s\n", (fobj.canExecute()) ? "Execute Access" : "Not Execute Access");		
			}
		}
		else
		{
			System.out.println(args[0] +" : is not existing file");
		}
	}
}
