//accept num from user and print that num of Size pattern
/*
  input:4			PATTER FUN  Piramid
  		      1
  		    1 2 1
  		  1 2 3 2 1
  		1 2 3 4 3 2 1
*/

import java.util.Scanner;  //package importing

class PatternFun
 {
   public static int  Size;  //instance valirable  //scop program scop
     
    
     public PatternFun(int Size)
     {
        
        if(Size<0)  //negative to positive modifier
        {
          Size=-Size;
        }
     
       this.Size=Size;
     }
     public static void Par_Fun()
     {       
      int i=0,j=0,k=0,x=0;
      
      for(i=1;i<=Size;i++)
       {
        x++;
        for(j=1,k=1;j<Size+Size;j++)
        {  
           x++;
           if((j>Size-i) && (j<Size+i))
            {
              if((k<i) && (j<Size))
              {
               System.out.print(k+"  ");
               k++;
              }
              else if(k<=j)
              {
                System.out.print(k+"  ");
                k--;
              }
            }
            else
            {
              System.out.print("   ");
            }       
        }
        System.out.print("\n");
       }
       System.out.println("Loop interation: "+x);     
     } 
     
     public void MinTimePatternExecution()
      {
          int iNo=this.Size; 
          int i=0,j=0,k=0,p=0,x=0;
          
          for(i=1;i<=iNo;i++)
          { 
            x++;
            for(j=1;j<=iNo-i;j++)
            { 
              x++;
              System.out.print("  ");
            }            
            for(k=1;k<=i;k++)
            { 
              x++;           
              System.out.print(k+" ");
            }            
            for(p=k-2;p>=1;p--)
            {  
              x++;           
              System.out.print(p+" ");
            }            
            System.out.print("\n");
          }         
          System.out.println("Loop interation: "+x); 
          
          PatternFun.Par_Fun();
      }    
 }
 
 class Pyramid_Driver
  {
      public static void main(String arg[])
      {
        
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Size");
        PatternFun pf=new PatternFun(sobj.nextInt());  //objected created and concurrently input taking and passing to 
      
        						// parameterSized constructor
        pf.MinTimePatternExecution(); //method call      
      }  
  }
