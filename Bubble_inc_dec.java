/*
 accept array from user for bubblesort and also ask option to user if user give option '1' then sort array in increasing order 
 if user does not provide option then sort given array in decresing order
 
 input:arr[]={7,6,1,66,12}
 option=1
 
 incresing order={1,6,7,12,66}
 else
 	   order={66,12,7,6,1} 
*/

import java.util.Scanner;

 class Bubble_Inc_Dec
  {
      public void bubble_Sord_Sith_Option(int arr[],int option)
      {
        int i=0,j=0,temp=0,sort=0,x=0,y=0;
        
        
        if(option==1)
        {		//for incresing order  array sort
           x=0;
           y=1;       
        }
        else
        {		//for decresing order  array sort
           x=1;
           y=0;
        }
      
       sort=1;
       
       for(i=0; (i<arr.length) && (sort==1);i++)
        {
          sort=0;
          
          for(j=0; j<arr.length-i-1;j++)
          {
            if(arr[j+x] > arr[j+y])
            {
              temp=arr[j+x];
              arr[j+x]=arr[j+y];
              arr[j+y]=temp;           
              sort=1;
            }          
          }       
        }     
      }
  }
  
  
 class Bubble_In_De_Driver
 {
   
   public static void main(String arg[])
    {
    
      Scanner s=new Scanner(System.in);
      Bubble_Inc_Dec bobj=new Bubble_Inc_Dec();
      
      System.out.println("Enter array size");
      int size=s.nextInt();
      
      int arr[]=new int[size]; //memory allocation for array
      System.out.println("Enter element for array");
      for(int i=0;i<size;i++)
      {
        System.out.print("Enter Elements: "+(i+1)+":");
        arr[i]=s.nextInt();        
      }
      
     System.out.println("Enter option");
     System.out.println("For Incresing order enter 1\nFor Decresing Enter any number");
     
     int opt=s.nextInt();
     
     
       bobj.bubble_Sord_Sith_Option(arr,opt);
       
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }        
       System.out.println("\ngood by");  
   }
 }
