/*
accept matrix from user and set diagonal max  values

input: row:3 col:3			matrix:			8    1    9    //after diagonalset     9   1   8
								1    7    5			       1   7   5
								9    1    5			       5   1   7
*/

import java.util.Scanner;
class Matrix
 {
    public void before_Diagnol_change(int arr[][])
    {
      System.out.println("Before Diagnol change");
        
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[i].length;j++)
         {
           System.out.print(arr[i][j]+"   ");
         }
         System.out.println("\n");
        }    
    }
    
    public void after_Diagnol_change(int arr[][])
    {
      System.out.println("After Diagnol change");
        
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[i].length;j++)
         {
           System.out.print(arr[i][j]+"   ");
         }
         System.out.println("\n");
        }    
    }
    
    
     public void max_Row_Num(int arr[][])
     {
         int pose=0;
         for(int i=0;i<arr.length;i++)
          {
            int max=arr[i][0];
            for(int j=0;j<arr[i].length;j++)
            {       
              if(max < arr[i][j])
              {
                pose=j;
                max=arr[i][j];
              }
            }
                   
            for(int k=0;k<arr[i].length;k++)
            {
               if(k==i)
               {
                  int temp=arr[i][k];
                  arr[i][k]=arr[i][pose];
                  arr[i][pose]=temp;               
               }
            }
            pose=0;            
             System.out.print("---> max is:"+max+"\n");
          }
     } 
 }
 
 class Matrix_Driver
  {
    public static void main(String arg[])
    {
        Matrix mobj=new Matrix();
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Sqaure Matrix for Diagonal Max Set of row"); 
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
        
        
         mobj.before_Diagnol_change(arr);                        
         mobj.max_Row_Num(arr); //function call 
         mobj.after_Diagnol_change(arr);
        } 
        else
        {
         System.out.println("Rows and Cols sizes are not Same");
        }
    }  
  }
