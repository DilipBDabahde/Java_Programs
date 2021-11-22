/*
write java program to create file

accept file name from user and create it, if geven file is already existing then show message.

*/


import java.io.*;
import java.util.Scanner;

class CreateNewFile
{
	public static void main(String args[])throws IOException
	{
		//keyboard connected		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter filename : ");
		
		//take filename from user
		String filename = input.nextLine();
		
		//create File name class object to get file properties
		File fobj = new File(filename);
		
		//check file is existings or not if file exists then return True else return false
		boolean result = fobj.exists();
		
		//if file is existing then exists method return true and then control goes through the if block
		if(result == true)
		{
			System.out.println(filename +" : is already existing");
			return;
		}
		else
		{
			fobj.createNewFile();
			System.out.println(filename +" : is created successfully");
			return;
		}
	}
}
