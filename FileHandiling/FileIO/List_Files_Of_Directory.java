/*
write java program to display files list of a Directory
accept directory name from user and dipslay its files
*/


import java.io.*;

class List_Files_Of_Directory
{
	public static void main(String args[])
	{
		
		File fobj = new File(args[0]);
		
		if(fobj.isFile() == true)
		{
			System.out.println(args[0]+" is a file");
		}
		else if(fobj.isDirectory() == true)
		{
			String list[] = fobj.list();
			
			for(String fname : list)
			{
				System.out.println(fname);
			}
		}
	}
}
