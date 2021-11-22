/*
write java program in which accept filename from user and display file length

input:	java classfile  filename
*/


import java.io.*;


class Get_File_ActualSize
{
	public static void main(String args[])
	{
		
		File fobj = new File(args[0]);
		
		long fileSize = fobj.length();
		
		System.out.println(args[0] +" : file size is : "+fileSize);
	
	}

}
