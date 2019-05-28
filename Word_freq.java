//accept string from user and one word return freq of that word 
//input  str="abc abcd ac abc ab abcd ac abc";
//input  word="abc";
//output=3

import java.io.*;
import java.lang.*;
import java.util.*;

 class Word_Freq
  {
     public int Word_Fre(String str,String word)
     {
       int icnt=0;
       
       String arr[]=str.trim().split("\\s+");
        
       for(int i=0;i<arr.length;i++) 
        {        
          if(word.equals(arr[i]))
           {
             icnt++;
           }        
        }   
        return icnt;  
     }
     
     public static void main(String args[])
     {
     
     String str="abc abcd ac abc ab abcd ac abc";
     String word="abc";
      
     System.out.println("Given Stirng is\n"+str+"\nGiven word is\n"+word+"\n"); 
     Word_Freq obj=new Word_Freq();
     
     int ival=obj.Word_Fre(str,word); 
     System.out.println("Total given word cnt is "+ival);
     
     }
  }
