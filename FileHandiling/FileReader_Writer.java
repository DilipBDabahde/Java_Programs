/*
write java program in which we can copy data of one file into another file using FileReader and FileWriter class
in this class file copying format is "text" but in last case we used FileInputStream and FileOutputStream file copying format was byte.

but now we are using another class which are already defined and same task we perform using this class 
inputfile.text :  "hi this is wed"
output.text : after copyed   "hi this is wed" <--- this file will get created at run time
*/

import java.io.*;

class FileReadingCp
{
	public static void main(String args[])
	{
	
		try
		{
			FileReader fr = new FileReader("today.text");
			FileWriter fw = new FileWriter("data.txt");
			
			int c = 0;
			
			while((c = fr.read()) != -1)
			{
				fw.write(c);
			}
			
			System.out.println("Data is copyied  Successfully");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
	}
}
