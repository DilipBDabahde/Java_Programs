//accept array from user and check that array is sorted in incresing order if it is then return 1,, if it is sorted in decreasing order then return 2 , if it is not sorted then return 0

//input: arr[]={1,3,5,6};  output:increasing sorted 1
//input: arr[]={5,4,2,1};  output:Decresing sotred  2
//input: arr[]={5,1,6,3};  ouput:unsorted 0

import java.util.Scanner;
import java.io.*;

class Sorting
 {
    public int ChkSorted(int arr[])
   {
      int i=0,icnt1=0,icnt2=0,icnt3=0;
      
      for(i=0;i<arr.length-1;i++)
       {
         if(arr[i] < arr[i+1])
         {
           icnt1++;
         }
         else if(arr[i] > arr[i+1])
         {
          icnt2++;
         }
       }
       if(icnt1==arr.length-1)
       {
         return 1;
       }
       else if(icnt2==arr.length-1)
       {
         return 2;
       }
       else
       {
         return 0;	
       }   
   }    
      public void MixSort(int arr[])
   {
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
   }
 }
 
 class Sorting_Driver
  {
    public static void main(String arg[])
    {
    
      Scanner s=new Scanner(System.in);
      Sorting sobj=new Sorting();
      
      System.out.println("Enter array size");
      int size=s.nextInt();
      
      int arr[]=new int[size]; //memory allocation for array
      System.out.println("Enter element for array");
      for(int i=0;i<size;i++)
      {
        System.out.print("Enter Elements: "+(i+1)+":");
        arr[i]=s.nextInt();        
      }
      
      int bret=sobj.ChkSorted(arr);    
      if(bret==1)
      {  
        System.out.println("Given array is Incresing sorted");
        sobj.MixSort(arr);
        System.out.println("");
      }
      else if(bret==2)
      {  
        System.out.println("Given array is Decresing sorted");
        sobj.MixSort(arr);
        System.out.println("");
      }
      else
      {  
        System.out.println("Given array is unsorted");
        sobj.MixSort(arr);
        System.out.println("");
      }      
    }  
  }
