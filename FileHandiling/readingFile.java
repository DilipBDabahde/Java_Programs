//write program in java which accept file jave from user and read its data

import java.io.*;

class FileReading
{

	  public static void main(String args[]){    
          try{    
            	FileInputStream fin=new FileInputStream("input.text");    
           		
           		int i=0;    

				while((i=fin.read())!=-1)
				{    
					System.out.print((char)i);    
				}    
				
            	fin.close();             	
         	 }
         	 catch(Exception e)
         	 {
         	 	System.out.println(e);         	 
         	 }    
         }  
}
