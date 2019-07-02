/*
accept matrix from user and return Cross diagonal Subtraction values

input: Row 4 
input: Col 4			
		Matrix
			7  8  9  5
			1  4  3  7  
			9  4  5  6
			1  7  8  6     Right Diagonal Sum is =7+4+5+6		=22
				       Left Diagonal Sum is  =5+3+4+1 		=13
				       						Final return value is=22-13
				       								     =9	<<----ANS
*/

import java.util.Scanner;

class Matrix_Diagonal_Sub
 {
    public void diagnol_Mat_Show(int arr[][])
    {
      System.out.println("Square Matrix of given number");
        
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[i].length;j++)
         {
           System.out.print(arr[i][j]+"   ");
         }
         System.out.println("\n");
        }    
    }
      
     public int diagonal_Finder_Right_Left(int arr[][])
     {
         int isum1=0,isum2=0;
         for(int i=0;i<arr.length;i++)
          {
            for(int j=0;j<arr[i].length;j++)
            {       
              if(i==j)
              {
                isum1+=arr[i][j];
              }              
              if(arr[i].length-1 == i+j)
              {
                isum2 +=arr[i][j];
              }              
            }  
          }
          
          if(isum1>isum2)
          {
           return isum1-isum2;
          }
          else
          {
           return isum2-isum1;
          }
     } 
 }
 
 class Matrix_Diagonal_Subtraction
  {
    public static void main(String arg[])
    {
        Matrix_Diagonal_Sub mobj=new Matrix_Diagonal_Sub();
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Sqaure Matrix for Diagonal"); 
        System.out.println("Enter RowSize"); 
        int row=s.nextInt();
        
        System.out.println("Enter ColSize");    
        int col=s.nextInt();
      
        if(row==col)
        {  
          int arr[][]=new int[row][col]; //memory structure is created for matrix        
      
         for(int i=0;i<row;i++)
          {
           System.out.println("Enter valeus ["+col+"] for :["+(i+1)+"] Row");
           for(int j=0;j<col;j++)
           {
              arr[i][j]=s.nextInt();
           }
          }  
        
         mobj.diagnol_Mat_Show(arr);                        
         int Diff=mobj.diagonal_Finder_Right_Left(arr);
         
         System.out.println("Diff from Rigth as well as Left Diagonal is :"+Diff);
         
        } 
        else
        {
         System.out.println("Rows and Cols sizes are not Same");
        }
    }  
  }
