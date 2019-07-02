//accept matrix from user and display max number from each row
/*
   row=3
   col=3		matrix like		   max
   			4   8   7		-->8 
   			9  11   1		-->11
   		 	10  4  74  		-->74
*/

import java.util.Scanner;
class Matrix
 {
     public void max_Row_Num(int arr[][])
     {
         for(int i=0;i<arr.length;i++)
          {
            int max=arr[i][0];
            for(int j=0;j<arr[i].length;j++)
            {                           
              System.out.print(arr[i][j]+"    ");
              if(arr[i][j]>max)
              {
                max=arr[i][j];
              }
            }
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
         
        System.out.println("Enter RowSize"); 
        int row=s.nextInt();
        
        System.out.println("Enter ColSize");    
        int col=s.nextInt();
        
        int arr[][]=new int[row][col]; //memory structure is created for matrix        
      
        for(int i=0;i<row;i++)
         {
          System.out.println("Enter valeus ["+col+"] for :["+(i+1)+"] Row");
          for(int j=0;j<col;j++)
          {
             arr[i][j]=s.nextInt();
          }
         }  
                  
        mobj.max_Row_Num(arr);       
    }  
  }
