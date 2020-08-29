//accept all type input in java using Scanner input

import java.util.Scanner;



class Scanner_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		// Byte type 
		System.out.println("Enter byte: ");
		Byte ival1 = input.nextByte();
		System.out.println("Entered byte: "+ival1);
		
		//int
		System.out.println("Enter integral value: ");
		int ival2 = input.nextInt();
		System.out.println("Entered value: "+ival2);
		
		System.gc();
		//float type
		System.out.println("Enter float value: ");
		float ival3 = input.nextFloat();
		System.out.println("Entered float value: "+ival3);
		
		//char type
		System.out.println("Enter character: ");
		char ival4 = input.next().charAt(0); //char c = sc.next().charAt(0)	
		System.out.println("Entered char: "+ival4);
		
		//double type
		System.out.println("Enter double value: ");
		double ival5 = input.nextDouble(); //char c = sc.next().charAt(0)	
		System.out.println("Entered double value: "+ival5);
	
	}
	





}
