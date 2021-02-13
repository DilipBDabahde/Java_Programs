/*
accept three command line arguments and perform addition of max two nums
input: 9 12 84
output: 96

input: 84 12 9
output:
	   96

input:	12 84 9
output:
	    96



*/

import java.util.Scanner;

class MaxNumSum
{
	public static void main(String args[])
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = s.nextInt();
		
		
		System.out.println("Enter second number : ");
		int b = s.nextInt();
		
		System.out.println("Enter third number : ");
		int c = s.nextInt();
		
		
		if(a > c  && b > c)
		{
			System.out.println("Sum of Max two nums is: "+(a+b));
		}
		else if(b > a && c > a)
		{
			System.out.println("Sum of Max Two nums is: "+(b + c));
		}
		else
		{
			System.out.println("Sum of maxt two num is: "+(a + c));
		}
	}
}
