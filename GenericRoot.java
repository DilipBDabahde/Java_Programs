//accept num from user and show generic root of given number
/*
 input:2332     
 	2+3+3+2= 10
 	1+0=1 
 	output:1 
*/

import java.util.Scanner;
class GenericRoot
 {
    
    public int GenericRoot_Finder(int iNo)    
   {
     int icnt=0,idigit=0,isum=0;
     
     while(iNo>9)
     {   
       while(iNo>0)
       {
        idigit=iNo%10;
        isum=isum+idigit;
        iNo=iNo/10;       
       }              
       iNo=isum;
       isum=0;
     } 
     
     return iNo;  
   } 
 }
 
 class GenericRoot_Driver
 {
   public static void main(String arg[])
   {  
   
     Scanner s=new Scanner(System.in);
     GenericRoot GR=new GenericRoot();
     
     System.out.println("Enter a num");
     int i=s.nextInt();
     
     int Res=GR.GenericRoot_Finder(i);
     
     System.out.println("Generic Root of given number is :"+Res);
     
   }
 }
