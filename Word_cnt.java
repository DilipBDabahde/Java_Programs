//accept string from user and total words from taht string 
//inpu="  this  is game "
//output:3
import java.util.Scanner;

class WordCount
 {
     public int wordcnt(String str)
    {
     
     char arr[]=str.toCharArray();
     int i=0,icnt=0;
     
     while(i<arr.length)
     {
          if(arr[i] !=' ')
          {
            icnt++;            
            while(i<arr.length && arr[i]!=' ')
            { 
             i++;
            }          
            i--;
          }
          i++;
     }         
     return icnt;
    } 
 }
 
class Driver
 {
    public static void main(String  args[])
    {
      Scanner S=new Scanner(System.in);
      WordCount wc=new WordCount();
      
      System.out.println("Enter string");
      String str=S.nextLine();
      
      int iret=wc.wordcnt(str);
     
      System.out.println("Total word coount is :"+iret);         
    }
 
 }
