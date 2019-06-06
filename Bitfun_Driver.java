//accpet 4 number from user and shift them each by one byte in which they are declared 
/*
   input
   	a1 a1 a1 a1
  	a2 a2 a2 a2
  	a3 a3 a3 a3
  	a4 a4 a4 a4 
  	
  	
  	output after shifting 
  	a1
  	   a2			shift by 8
  	      a3		shift by 16
  	      	 a4		shift by 24  	      	 
*/

import java.io.*;
import java.util.*;
import java.lang.*;

class Bitfun
 {  
 
   public int iNo1,iNo2,iNo3,iNo4;
   public final int imask=0xff000000;
   Scanner s=new Scanner(System.in); 
  
   public Bitfun()
   {     
     System.out.println("Enter value"); 
     iNo1=s.nextInt();
     iNo2=s.nextInt();
     iNo3=s.nextInt();
     iNo4=s.nextInt();  
   }
   
   public int BitShift()
   {
     int ians;
     
     iNo1=iNo1 & imask;
     iNo2=iNo2 & imask;
     iNo3=iNo3 & imask;
     iNo4=iNo4 & imask;
     
     iNo2=iNo2>>8;
     iNo3=iNo3>>16;
     iNo4=iNo4>>24;
     
     ians=iNo1 | iNo2 | iNo3 | iNo4;
       
     return ians; 
   }
 }
 
 class Bitfun_Driver
 {
   public static void main(String args[])
  {
    Bitfun bf=new Bitfun();
    int iret=0;

    iret=bf.BitShift();
    System.out.println("After shifting formed num is :"+iret); 
  }
} 
  
