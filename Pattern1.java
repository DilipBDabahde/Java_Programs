/*
  input=1758
  output 8	
  	 8 5
  	 8 5 7
  	 8 5 7 1
*/

import java.io.*;
import java.util.*;
import java.lang.*;

class Pattern1
 {
      public void pat_one(int iNo)
     {
       int s=0,temp=iNo,i=0,icnt=0,idigit=0;
      
         System.out.println(iNo); 
         while(iNo>0)
         {
           iNo=iNo/10;         
           icnt++;        
         }    
         
         for(i=1;i<=icnt;i++)
         {
            iNo=temp;
            s=i;
            while(s>0)
            {               
              System.out.println(iNo%10);
              iNo/=iNo;
              s--;            
            }         
         }      
     }
 }
 
 
 class Pattern_1
  {
    public static void main(String args[])
    {
       int iNo;
       Pattern1 pobj=new Pattern1();       
       Scanner sobj=new Scanner(System.in);
       System.out.println("Enter a value");
       
     //  Scanner sobj=new Scanner(System.in);
       iNo=sobj.nextInt();
       
       pobj.pat_one(iNo);       
    
    
    }
  
  
  }
