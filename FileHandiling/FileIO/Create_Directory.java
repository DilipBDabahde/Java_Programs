/*
write java program to create directory

accept directory name from user and create a directory

*/



//import required classes
import java.io.*;

class Create_Directory
{

	public static void main(String args[])
	{
	
		//create File class object
		File fobj =  new File(args[0]);
		
		//call method to create direcotry
		boolean result = fobj.mkdir();
		
		if(result == true)		
		{
			System.out.println(args[0] +" : directory is created");
		}
		else
		{
			if(fobj.isDirectory() == true)
			{
				System.out.println(args[0] +" : directory is already existing");
				return;
			}
			
			System.out.println(args[0]+ " : directory is not created");
		}
		
	}
}
