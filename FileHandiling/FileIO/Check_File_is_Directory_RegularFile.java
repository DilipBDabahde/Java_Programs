/*
write a program in which accept file name from user and check accepted file is directory of regular file

accept input from command line

input:
		input.txt

output:
		given file is regular
		

input:
		Music
Output:	Given file is directory


create File class object that helps to get file properties, but by using File class object just check that given file is regular file
or directory file

*/


//import required packages
import java.io.*;

class CheckFileType
{
	public static void main(String args[])	
	{
	
		File fobj = new File(args[0]);	
		
		if(fobj.isFile() == true)
		{
			System.out.println(args[0] +" is a file");
		}
		else if(fobj.isDirectory() == true)
		{
			System.out.println(args[0] +" is a Directory");
		}	
		else
		{
			System.out.println(args[0] +" is nither a direcotry nor a file");
		}
	}
}



