import java.io.*;
import java.util.*;
import java.lang.*;

class Nebour
 {
   
     public int  Find_Neibour(int arr[],int value)
     {
         int n=arr.length;
         int ipose=0,mindiff=0,diff=0;
         
         mindiff=arr[0]-value;
         
         if(mindiff<0)
          {
           mindiff=-mindiff;
          }
         
         for(int i=0;i<n;i++)
         {
             diff=arr[i]-value;
             
             if(diff<0)
             {
              diff=-diff;
             }
             
             if(mindiff>diff)
             {
               mindiff=diff;
               ipose=i;
             }
             
             if(diff==0)
             {
               ipose=i;
               break;
             }             
         } 
          return arr[ipose];    
     }
 }
 
 class Driver_H
  {
  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        
        int size=s.nextInt();
        System.out.println("Enter values for array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
         {
           arr[i]=s.nextInt();                    
         }
         
         System.out.println("Enter value to find it inot array");
         int value=s.nextInt();
         Nebour obj=new Nebour();
         
         int iret=obj.Find_Neibour(arr,value);
         System.out.println("Exact or neibour num of given number is ["+iret+"]");
         
    }
  
  }
