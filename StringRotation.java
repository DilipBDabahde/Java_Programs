/*string from user and check second string is rotation of first string

input1:wearehere
|  |  |-- input2:areherewe    TRUE
|  |------input2:herewe       FALSE
|---------input2:ereweareh    TRUE
*/

import java.util.Scanner;
import java.io.*;

class Str_rotation
 {
       public boolean chkRotationString(String str1,String str2)
       {       
         if(str1.length() == str2.length())
         {
         String str3=str1+str2;
         
         boolean bret;
         
         bret=str3.contains(str2);
         
          return bret;
        }
        else
        {
          return false;
        }
       }       
 }
 
 class StringRotation
 {
   public static void main(String arr[])
   {
     Scanner s=new Scanner(System.in);
     Str_rotation sr=new Str_rotation();
      
     System.out.println("Enter First String"); 
     String str1=s.nextLine();
     
     System.out.println("Enter Second String"); 
     String str2=s.nextLine();
     
     boolean bret=sr.chkRotationString(str1,str2);
     
     if(bret==true)
      {
        System.out.println("Given second string is ROTATIONAL");
      }
      else
      {
        System.out.println("Given second string is NOT-ROTATIONAL");      
      }     
   }
 }
