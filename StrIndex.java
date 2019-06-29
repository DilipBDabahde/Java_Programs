//accept string array from user and and one string show indexx of that string
/*
size of string=4
take 4 string from user 
0 1:Pune
1 2:Nagar
2 3:Goa
3 4:Mumbai

Another string=Goa   
outputL:2 index;

*/


import java.util.Scanner;
import java.io.*;

class StrIndex
 {  
     
     public int Freq_count(String str1[],String str2)
    {
      int i=0,icnt=0;
      
      for(i=0;i<str1.length;i++)
      {
         if(str2.equalsIgnoreCase(str1[i]))
         {
          icnt++;
         }
      }
      
      return icnt;    
    }
 
 }
 
 class Str_Driver
 {
 
   public static void main(String arg[]) throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);//br obj is used to take input
  
    StrIndex si=new StrIndex();
    
    System.out.println("Enter size of string");
    int size=Integer.parseInt(br.readLine());
    
    String arr[]=new String[size];  //memory allcataion done
    
    for(int i=0;i<size;i++)
     {
        System.out.println("Enter:"+(i+1));
        arr[i]=br.readLine();     
     }
     
     System.out.println("Enter Search word");
     String search=br.readLine();  //enter word to find into string
     
     int iret=si.Freq_count(arr,search); 
     
     System.out.println("Word Search Freq into array is :"+iret);  
  }
}
