/*accept array from user and return it is palindrom or not T &  F
arr[]={1,2,3,3,2,1} =TRUE
arr[]=[1,2,3,3,3,4]=FALSE
*/
import java.io.*;
import java.util.*;
import java.lang.*;


class Palindrom_2
 {
     public boolean Pal3(int arr[])
     {
        int start=0,end=arr.length-1;
        
        while(1==1) 
        {
          if(start>end || arr[start]!=arr[end])
          {
            break;
          }
          start++;
          end--;
        }
        
        if(start>end)
        {
         return true;
        }     
        else
        {
         return false;
        }
     } 
 }

class Palindrom_1 extends Palindrom_2
 {
 
    public boolean Pal2(int arr[])
    {
      int start=0,end=0;
      for(start=0,end=arr.length-1;(start<=end)&&(arr[start]==arr[end]);start++,end--);
       if(start>end)
       {
        return true;
       }
       else
       {
        return false;
       }    
    }
 }

class Palindrom extends Palindrom_1
 {
    public boolean Pal(int arr[])
    {
       int start=0,end=arr.length-1;
       for(start=0;start<=end;start++,end--)
       {
         if(arr[start] != arr[end])
          {
           break;
          }
       }       
       if(start>end)
       {
        return true;
       }
       else
       {
        return false;
       }   
    }  
 }
 
 class Pal_driver
 {
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      
      System.out.println("Eneter array size");
      int size=s.nextInt();
      
      int arr[]=new int[size];
      
      System.out.println("Enter values for array");
      for(int i=0;i<size;i++)
      {
        arr[i]=s.nextInt();      
      }
      
      Palindrom obj=new Palindrom();
      
      boolean val=obj.Pal(arr);
      
      System.out.println(val);     
      
      System.out.println(obj.Pal2(arr));
      
       System.out.println(obj.Pal3(arr));
      
   } 
 }
