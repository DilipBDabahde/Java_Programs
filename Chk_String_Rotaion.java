//accept two string from user and check second string is rotation of first string

import java.io.*;
import java.lang.*;
import java.util.*;

class Str_Rotation
 {
     public boolean Chk_Rot(String Str1,String Str2)
     {
     
      if(Str1.length() != Str2.length())
      {
         return false;
      }
      
      String Str3=Str1+Str1;
      System.out.println(Str1+" "+Str2+" "+Str3);
      
      boolean bret;
      bret=Str3.contains(Str2);
      return bret;     
     }
   
   public static void main(String args[])
   {
     Str_Rotation obj=new Str_Rotation();
     
     Scanner s=new Scanner(System.in);
     
     System.out.println("Enter first string");
     String s1=s.nextLine();
     
     System.out.println("Eneter Second string");
     String s2=s.nextLine();
     
     boolean Bret=obj.Chk_Rot(s1,s2);
     
     System.out.println(Bret);  
   
   
   }
   
 }
