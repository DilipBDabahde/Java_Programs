//accept input using wrapper classes

import java.io.*;
import java.util.*;


class Wrapper_Input
{
	public static void main(String args[])throws Exception	
	{
		InputStreamReader ist = new InputStreamReader(System.in);
		
		BufferedReader bf = new BufferedReader(ist);
		
		//Byte type can access value till ---------------> 127 
		System.out.println("Enter Byte: ");
		Byte val1 = Byte.parseByte(bf.readLine());
		System.out.println("Entered byte: "+val1);
		
		//int type
		System.out.println("Enter Integer: ");	//last size 2147483647
		int ival2 = Integer.parseInt(bf.readLine());
		System.out.println("Entered integer: "+ival2);
		
		//long int type
		System.out.println("Enter Long: ");	//last size 9223372036854775807
		long  ival3 = Long.parseLong(bf.readLine());
		System.out.println("Entered Long: "+ival3);
		
		//float type
		System.out.println("Enter float value: ");	
		float  ival4 = Float.parseFloat(bf.readLine());
		System.out.println("Entered float value: "+ival4);
		
		
		
		
		
	
	
	}


}
