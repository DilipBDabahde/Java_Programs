/*accept array from user and return diff bet max and min 
find max and after findig max ignore its right size then find small till max from 0 index and once you get small then return diff bet smalll and max
 
 int arr[]={7,2,9,7,4,5}
 
 max is 9
 min is 2 
 ans	= 9-2 --->7
 
*/

import java.util.*;
import java.lang.*;
import java.io.*;
//import java.Scanner;

class DiffMaxAndMin
 {
 
    public int Diff(int arr[])
    {
       int i=0,imax=0,imin=0,icnt=0;
       imin=imax=arr[0];
       for(i=0;i<arr.length;i++)
       {
          
          if(arr[i]>imax)
          {
            imax=arr[i];
            icnt=i;
          }        
       }
       
       for(i=0;i<=icnt;i++)
      {
         if(arr[i]<imin)
         {
           imin=arr[i];
         }     
      }
      
      if(imax>imin)
      {
        return imax-imin;
      }
      else
      {
        return imin-imax;
      }          
    }
 
 }
 
 
 class Enter extends  DiffMaxAndMin
 {
   public int Diff(int arr[])
  {
     int i=0,imaxd=arr[1]-arr[0];
     
     for(i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length;i++)
        {
           if((arr[j]-arr[i])>imaxd)
           {
             imaxd=arr[j]-arr[i];
           }        
        }
      }      
      return imaxd;  
  }

 }
 
 
 
 class MaxAndMin
  {
  
    public static void main(String args[])
    {
      
      Enter Obj=new Enter();
      
       
      System.out.println("enter arrraay size");
      Scanner scan=new Scanner(System.in);
      int size=scan.nextInt();
      
      int arr[]=new int[size];
      
      System.out.println("enter values for array");
      for(int i=0;i<size;i++)
      {   
          System.out.print(i+1+":");
          arr[i]=scan.nextInt();
      }    
      
     System.out.println("diff is "+Obj.Diff(arr));    
      
   //   System.out.println("diff is "+Obj.Second_opt(arr));       
    }  
  }
