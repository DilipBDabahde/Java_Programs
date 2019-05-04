import java.util.*;
import java.io.*;

 class All
  {
          
   public int Count(String str,String word)
   {
      int count=0;
      String arr[]=str.split(" ");
      
      for(int i=0;i<arr.length;i++)
      {
         if(word.equals(arr[i]))
         {
          count++;
         }
      }
      return count;
    }
    
    public String ReverseString(String str)
    {
          
     String rev="";
    
     for(int i=str.length()-1;i>=0;i--)
     {
      rev=rev+str.charAt(i);      
     }   
          
     return rev;
    }
    
    
    
 }

 class Sum
 {
 
  public static void main(String args[])
  {
  
  
  //  String str="Hi i Dilip love mumbai";
    All obj=new All();
  //  String word="Dilip";
  //  System.out.println(obj.Count(str,word));
    
    
    
    System.out.println("Enter string");
    Scanner read=new Scanner(System.in);
    
    String str=read.nextLine();
    
    System.out.println(obj.ReverseString(str)); 
    
    
    
     
  } 
 }
