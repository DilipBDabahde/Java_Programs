 //accept string from user and print below pattern
  //input:  bac ds oks
     /*output:  b
     		b a
     		b a c
     		d
     		d s
     		o
     		o k
     		o k s  
     */
 
 import java.util.Scanner;
 
 class String_Steps
  {    
     
      public void StrPatterFun(String str)
      {
         String sarr[]=str.split(" ");         
         
         for(int i=0;i<sarr.length;i++)
         {
            char arr[]=sarr[i].toCharArray();
            
           for(int j=0;j<arr.length;j++) 
           {             
              for(int k=0;k<=j;k++)
              {
                System.out.print(arr[k]+" ");              
              }
              System.out.println();
           }        
         }     
      } 
  }   
 
 class String_Steps_pattern
 {
   public static void main(String arg[])
   {
     Scanner s=new Scanner(System.in);

     Demo5 d5obj=new Demo5();
         
     System.out.println("Enter string");
     String str=s.nextLine();
        
     d5obj.StrPatterFun(str);   
       
   }
 }
