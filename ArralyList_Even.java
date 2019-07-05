//accept arraylist from user and display only even

import java.lang.*;
import java.util.*;
import java.io.*;

class ArrayListEvenShow
 { 
    
    public static void main(String arg[])
    {
     int arr[]={7,5,2,6,3,66,34,23,63,11,64,63,54,34,33};
     ArrayList <Integer> al=new ArrayList<Integer>();  //object created use ing obj we take values
     ArrayList <Integer> Odd=new ArrayList<Integer>();
     ArrayList <Integer> Even=new ArrayList<Integer>();
     
     for(int i=0;i<arr.length;i++)
     {
       if(arr[i]%2==0)
       {
         Even.add(arr[i]);
       }
       else
       {
         Odd.add(arr[i]);
       }    
     }
     
     al.add(11);
     al.add(12);
     al.add(42);
     al.add(2);
     
     
     
     Collections.sort(al);
     
     for(int val:al)
     {
      System.out.print(val+",");
     }
     System.out.println();
     
     Even.add(5,100);  //after sorting it chage its pose
     System.out.println(Even);
     Collections.sort(Even);
     for(int v:Even)
     {
      System.out.print(v+",");
     }
     
     System.out.println();
     Collections.sort(Odd);
     for(int v:Odd)
     {
      System.out.print(v+",");
     }
     System.out.println("\n"+al.size()+" "+Even.size()+" "+Odd.size());
      
    
    }
 
 
 }
