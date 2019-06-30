//accept array from user and do binary search
//description of insertion sort
/*
  insertion means setting values in incresing order in given array  as we have example below
*/
//input:arr[]={4,1,91,5,11}
//output:{1,4,5,11,91}

import java.util.Scanner;

class InsertionSort
 {
      public void InsertionSort(int arr[])
      {
        
         int i=0,icnt=0,temp=0;
         
         for(i=1;i<arr.length;i++)
         {
            temp=arr[i];
            icnt=i-1;      //i index copyed into icnt by(-1)         
            
             while((icnt >= 0) && (arr[icnt] > temp))
             {
               arr[icnt+1]=arr[icnt];
               icnt=icnt-1;       	
             }             
             arr[icnt+1]=temp;               
         }               
      }
     
 }

 class Insertion_Driver
 {
   
   public static void main(String arg[])
    {
    
      Scanner s=new Scanner(System.in);
      InsertionSort bobj=new InsertionSort();
      
      System.out.println("Enter array size");
      int size=s.nextInt();
      
      int arr[]=new int[size]; //memory allocation for array
      System.out.println("Enter element for array");
      for(int i=0;i<size;i++)
      {
        System.out.print("Enter Elements: "+(i+1)+":");
        arr[i]=s.nextInt();        
      }
      
       bobj.InsertionSort(arr);
       
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }   
       
       System.out.println("\ngood by");  
   }
 }
