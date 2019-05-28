import java.io.*;
import java.lang.*;
import java.util.*;

class LargeWord
 {
     public int L_W(String str)
   	{
   	
   	int index=0;
   	
   	String arr[]=str.trim().split("\\s+");
   	
   	int imax=0;
   	
   	    	
   	for(int i=0;i<arr.length;i++)
   	 {
   	     if(arr[i].length() > imax)
   	      {
   	        imax=arr[i].length();
   	        index=i;
   	      }
   	 }
   	 
   	 if(index != -1)
   	 {
   	  System.out.println("Largest word is--->> "+arr[index]);   	 
   	 }
   	 return imax;	
   	} 
       
       public static void main(String args[])
       
       {
        String str="i am indian ok!!!!!!";
        System.out.println("given string is "+str);
        LargeWord obj=new LargeWord();
        
       int size=obj.L_W(str);
       
       System.out.println("size is "+size);
       
       }
       
 }
