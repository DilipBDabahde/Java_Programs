//accept string from user and count word in java
//input: Ram is god			output:3
//input:				output:0
//input:  d  ds  sdf sfd 		output:4
//input:ffffffffffffff			output:1
import java.util.Scanner;

class WordCount
 {
    public int Word_cnt(String str)
    {        
        int icnt=0,i=0,j=0;
        char arr[]=str.toCharArray(); //char array conversion of string 
        
        for(i=0;i<arr.length;i++)
        {
          if(arr[i]==' ')
          {
            for(j=i;j<arr.length;j++)
             {
               if(arr[j] != ' ')
               {
                 break;
               }
             }          
             i=j-1;
          }
          else if(arr[i]!=' ')
          {
             icnt++;
             
             for(j=i;j<arr.length;j++)
             {
               if(arr[j]==' ')
               {
                break;
               }             
             }
             i=j-1;
          }       
        }
        return icnt;    
    } 
 }
 
 class WordCount_Driver
  {
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);
       
       System.out.println("Enter string");
       String str=sobj.nextLine();
       
       WordCount wobj; 		//referecne
       wobj=new WordCount();   //object creation done on this line
       
       int iret=wobj.Word_cnt(str);
       
       System.out.println("Total words freq is string is :"+iret);
              
    } 
  
  }
