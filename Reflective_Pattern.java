/*
 accept size from user and print given patter
 //input:4
 	output:				4  4  4  4  4  4  4
					   3  3  3  3  3
					      2  2  2
					         1
					         1			! Woooooow Nice Paaaaaaaaatern
					      2  2  2
					   3  3  3  3  3      
					4  4  4  4  4  4  4  
					   
*/

import java.util.Scanner;

class Reflective_Triangle
 {
      int iNum;
      public Reflective_Triangle(int x)	//constructor
      {
        iNum=x;
      }
      
      public void Triangle()
      {
         int i=0,j=0,k=0,Size=iNum;
         
         for(i=1;i<=Size+Size;i++)
          { 
             if(i<=Size)
             {
                 for(j=1;j<=((Size+Size)-1);j++)
                 {
                   if(j>=i  && j<=(Size+Size)-i)       
                    {
                      System.out.print((Size-i+1)+"  ");                    
                    }
                    else
                    {
                      System.out.print("   ");
                    }                
                 }                
                 System.out.print("\n");
             }
             else
             {
                 for(j=1;j<=Size+(i-Size-1);j++)
                 {
                     if(j>(Size-(i-Size)) && (j<=(i-1)))                 
                     {
                       System.out.print(i-Size+"  ");
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
 }
 
 class Reflective_Pattern
  {
     public static void main(String arg[])
     {
       Scanner s=new Scanner(System.in);         
                    
       System.out.println("Enter a value");
      		
       Reflective_Triangle rt=new Reflective_Triangle(s.nextInt());
       
       rt.Triangle();      
     }  
  }
