//accept array from user and do binary search
//input:arr[]={4,7,8,12,51,99}
//no=7  
//output:1


import java.util.Scanner;

class BinarySearch
 {
 
    public int binary_Search(int arr[],int iNo)
    {
        int start=0,end=arr.length-1;
        int mid=(start+end)/2;
        
        while(start<=end)
        {
           if(arr[mid]==iNo)		//if found required num return index
           {
            break;
           }
           
           if(iNo > arr[mid])
          {				//{4,7,8,12,51,99}
            start=mid+1;
          }
          else if(iNo<arr[mid])
          {
            end=mid-1;
          }         
          mid=(start+end);
        }
        
        if(start > end)
        {
         return -1;
        }
        else
        {
          return ++mid;   //if we go through else part then consider we found our required number
        }   
    }
    
    public void arrayrun(int arr[])
    {
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
    } 
 }

 class BinarySearch_Driver
 {
   
   public static void main(String arg[])
    {
    
      Scanner s=new Scanner(System.in);
      BinarySearch bobj=new BinarySearch();
      
      System.out.println("Enter array size");
      int size=s.nextInt();
      
      int arr[]=new int[size]; //memory allocation for array
      System.out.println("Enter element for array");
      for(int i=0;i<size;i++)
      {
        System.out.print("Enter Elements: "+(i+1)+":");
        arr[i]=s.nextInt();        
      }
      
      System.out.println("Enter number to seach binaryway");
      int no=s.nextInt();
      
      int iret=bobj.binary_Search(arr,no);
      if(iret >= 0)
      {
      System.out.println("we found number at index:"+iret);
      bobj.arrayrun(arr);
      System.out.println();
      }
      else
      {        
      System.out.println("Given number is not existing in array");
      }
      
   }
 }
