//accept string from user and count Freq of each word from that string
//input:  str=" this is not a game this is challenge"
//output: {this=2, is=2, not=1 ,a=1, game=1, challenge=1}

import java.util.Scanner;

class Word_Freq
 {
    public void word_cnt(String str)
    {
      int i=0,j=0,icnt=0;
      String space=" ";
      String arr[]=str.split(" ");
      
      System.out.print("{");
      for(i=0;i<arr.length;i++)
      { 
        if(arr[i]!=space)
        {
         for(j=0;j<arr.length;j++)
         {
            if(arr[i].equals(arr[j]))
            {
              icnt++;
            }
         }
                  
         String str2=arr[i];       
         
         for(j=0;j<arr.length;j++)
         {
           if(arr[j].equals(str2))
           {
             arr[j]=space;
           }         
         }         
         System.out.print(str2+"="+icnt+",");
         icnt=0;         
        }
      }
      System.out.println("}");        
    }
 }
 
 
 class Word_Counter
  {
    public static void main(String arg[])
    {
       Scanner s=new Scanner(System.in);
       Word_Freq wf=new Word_Freq();
       
       System.out.println("Enter string");
       String str=s.nextLine();       
       wf.word_cnt(str);    
    }  
  }
