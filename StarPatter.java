//Generic Implementation of methods in java
//accep num from user and print given patter of that number
/*
  input:3 
  output:		    - - * - -
			    - * * * -
			    * * * * *
			    skip other places just print given format			    
*/



import java.util.Scanner;

class Demo  
 {   
      public void PatternFun(int size)
      {
         int i=0,j=0;
         int x=0;
         for(i=1;i<=size;i++)
         {   
            x++;
           for(j=1;j<=size+size;j++)
           {
              x++;
              if((j>size-i) && (j<size+i))
              {
               System.out.print("*  ");  //both should contains same spaces on this line
              }
              else
              {
               System.out.print("   ");  //both should contains same spaces on this line  
              }          
           }
            System.out.print("\n");         
         }         
         System.out.println("total loop looping is:"+x);    
      }
 }
 
 
 class Demo2
  {
      public void PatternFun(int size)
      {
         int i=0,j=0;
         int x=0;
         for(i=1;i<=size;i++)
         {   
            x++;
           for(j=1;j<=size-i;j++)
           {
              x++;
              System.out.print("   ");
           }
           
           for(int k=1;k<=(i*2)-1;k++)
           { 
             x++;
             System.out.print("*  ");
           } 
            
            System.out.print("\n");         
         }         
         System.out.println("total loop looping is:"+x);    
      }  
  
  
  
  
  }
 
 class StarPatter
 {
   public static void main(String arg[])
   {
     Scanner s=new Scanner(System.in);
     Demo dobj=new Demo();
     Demo2 d2obj=new Demo2();
     
     System.out.println("Enter size of pattern");
     int size=s.nextInt();
        
     d2obj.PatternFun(size);
       
   }
 }
