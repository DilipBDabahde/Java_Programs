//accept input from user using scanner and and display it


import java.util.Scanner;
import java.io.*;


class Math
{
	public int Add(int a, int b)
	{
		return a+b;
	}


}


class Driver
{
	public static void main(String args[])throws Exception
	{
		
		Scanner sobj = new Scanner(System.in); //attached keyboard
	
		System.out.println("Using Buffred Reader");
		
		InputStreamReader iobj = new InputStreamReader(System.in); //attached keyboard
		BufferedReader  bobj = new  BufferedReader(iobj);
		
		System.out.println("Enter number: ");
		
		int ival1 = Integer.parseInt(bobj.readLine());		
		System.out.println("Given value is: "+ival1);	
		
		int ival2 = Integer.parseInt(bobj.readLine());
		System.out.println("Given value is: "+ival2);
		
		Math mobj = new Math();
		
		System.out.println("Addition is: "+mobj.Add(ival1, ival2));
		
		//using scanner obj
		System.out.println("\nUsing Scanner class");
		
		System.out.println("Enter first Value: ");
		ival1 = sobj.nextInt();
		
		System.out.println("Enter second Value: ");
		ival2 = sobj.nextInt();
		
		System.out.println("Addition is: "+mobj.Add(ival1, ival2));
		
		
	}

}
