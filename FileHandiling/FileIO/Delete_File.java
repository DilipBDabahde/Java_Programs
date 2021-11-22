/*
write java program to delete file 
*/

import java.io.*;


class Delete_File
{
	public static void main(String args[])
	{
		File fobj = new File(args[0]);
		
		if(fobj.exists() == true)
		{
			if(fobj.isFile() == true)
			{
				fobj.delete();
				System.out.println(args[0]+" file is deleted");
			}
			else if(fobj.isDirectory() == true)
			{
				System.out.println(args[0]+" is directory can't be deleted");
				
			}
		}
		else
		{
			System.out.println(args[0]+" is not existing\n");
		}
	}
}
