/*
accept input from user and print given pattern
input:4
output:			4	    4
			  3	  3
			    2   2                                                                    
			      1
 			    2   2
 			  3	  3
 		        4           4	
 		        
 		     		      
*/

import java.util.Scanner;

class  CrossPattern
 {
   
   public void CrossPatFun(int size)
    {
    // System.out.println("hello trying");
    
     int i=0,j=0;
     
     System.out.println("\n\n");
     for(j=1;j<=size+size;j++)
      {        
          for(i=1;i<=size+size-1;i++)
           {
               if(i==j)
               {  
                 if(i==j && j<=size)
                 {               
                 System.out.print((size-j+1)+"  ");
                 }
                 else if(i==j && size<j)
                 {
                  System.out.print((j-size+1)+"  ");
                 }
               }
               else  if(i+j==size+size && i!=j)
               {                  
                if(i<j)
                {             
                System.out.print((size-i+1)+"  ");
                }
                else if(i>j)
                {             
                  System.out.print((i-size+1)+"  ");                
                }
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
 
 class CrossPattern_Driver
 {
   public static void main(String arg[])
   {
     Scanner s=new Scanner(System.in);
     CrossPattern sp=new CrossPattern();
     
     System.out.println("Enter a value");
     int ival=s.nextInt();
     
     sp.CrossPatFun(ival);         
   } 
 }
