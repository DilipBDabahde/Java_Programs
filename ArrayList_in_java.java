//example of ArrayList

/*
  this below exmple demostrate the use of array list in java

 collection is readymade datastructure implementaion in java, and also collection is also collection of objects
 arraylist index start from 0
 

*/
import java.lang.*;
import java.io.*;
import java.util.*;

class Collectect_ArrayList
 {
      public static void main(String arg[])
     {
      ArrayList <String> al=new ArrayList<String>();
      
      al.add("c prog");
      al.add("c++ prog");
      al.add("java prog");
      al.add("python prog");
      al.add("php prog");
      
      System.out.println("Given data is\n\n"+al);
      
      al.add(2,"C# Prog");      
      System.out.println("After inserting one values is at 2 index\n\n"+al);
      
      al.remove(3);      
      System.out.println("After deleting one values is at 3 index\n\n"+al);
      
      al.set(3,"java-Prog");
      System.out.println("After Replacing one values is at 3 index\n\n"+al); 
      al.clear();     
     } 
 }
