import java.io.*;
import java.util.*;
import java.lang.*;

class Occur
 {
       
       public int FirstOccu(int arr[],int value,int size)
   	{
   	  int i=0;
   	  for(i=0;i<size;i++)
   	  {
   	      if(arr[i]==value)
   	       {
   	        break;
   	       }
   	  }
   	  
   	  if(i==size)
   	  {
   	    return -1;
   	  }
   	  else
   	  {
   	    return ++i;
   	  }   	
   	} 
   	
   	
   	public int LastOccur(int arr[],int value,int size)
   	{
   	int i=0,icnt=0;
   	  for(i=0;i<arr.length;i++)
   	  {
   	      if(arr[i]==value)
   	       {
   	        icnt=++i;
   	       }
   	  }   	  
   	  if(icnt==0)
   	  {
   	    return -1;
   	  }
   	  else
   	  {
   	    return icnt;
   	  }  	
   	}   
   	
       public boolean check_val_is_avail(int arr[],int size,int val) 
       {
            int start=0,end=size-1;
            while(start<=end)
            {
              // System.out.println(start);
               if(arr[start]==val || arr[end]==val)
               {
                   break;
               }
               start++;
               end--;           
            }
            
            if(start>end)
            {
             return false;
            }
            else
            {
              return true;
            }       
       }  	
   		
 }
 
 
 class Drive
  {
    public static void main(String args[])
    {
     
      Occur obj=new Occur();
      int size=0,i=0,sum=0;

      Scanner scan=new Scanner(System.in);      
      System.out.println("Enter array length");
      size=scan.nextInt();  
      
      System.out.println("Enter values for array elements");    
      int arr[]=new int[size];
      
      for(i=0;i<size;i++)
       {
         arr[i]=scan.nextInt();
       }
       
       System.out.println("Enter num to check Last occurance");
       int val=scan.nextInt();       
       System.out.println(obj.check_val_is_avail(arr,size,val));    
         
    }
  
  }
