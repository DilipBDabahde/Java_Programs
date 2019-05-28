//accept string from user and one word and return freq of that word 
// Stirng str="ram is god, ram is a boy"
// String word="ram";
//output=2


import java.io.*;
import java.lang.*;
import java.util.*;

class Word_Freq
 {
     public int w_freq(String str,String word)
     {
      int icnt=0;
      String arr[]=str.split(" ");
   
               
      for(int i=0;i<arr.length;i++)
       {
         if(word.equals(arr[i])) 
         {
           icnt++;
         }       
       }
       return icnt;               
     } 
 }
 
 class  Word_Freq_Drive
 {
 
   public static void main(String args[])
     {
       Word_Freq obj=new Word_Freq();
       
       Scanner s=new Scanner(System.in);
       System.out.println("Enter str");
       String str=s.nextLine();
       
       System.out.println("Enter word");
       String word=s.nextLine();
       
       int icnt=obj.w_freq(str,word);     
       
       System.out.println("Total word Freq is "+icnt);
     }
 
 }
