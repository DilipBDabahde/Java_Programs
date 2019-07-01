//accetpt a numeber from user and print given pattern
/*
input:4
	  * * * * * * *	
	    * * * * *
	      * * *
  		*
*/

import java.util.Scanner;

class Triangle_Pattern
 {
   
     public void Triangle_Pattern_Printer(int iNo)  //control comes here
     {
       int i=0,j=0,k=0;

       for(i=1;i<=iNo;i++)
          {
            for(j=1;j<iNo+iNo;j++)
            {
               if((j>=i) && (j<=iNo+iNo-i))
               {
                System.out.print("*  ");
               }
               else
               {
                System.out.print("   ");
               }
            }
             System.out.print("\n");    
          }          
                   
     }
 
 
 }
 
class Triangle_Pattern_Driver
 {
   public static void main(String arg[])
   {
      
      Scanner s=new Scanner(System.in);
      Triangle_Pattern tp=new Triangle_Pattern();
      
      System.out.println("Enter a Number");
      int iNo=s.nextInt();
      
      tp.Triangle_Pattern_Printer(iNo); //method call
      
   }
 }
