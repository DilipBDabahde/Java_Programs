/*
accept matrix from user and chk it's each column is palindrom or not 

input: row:4
       col:4 
              1 5 1 7
              4 4 5 6
              4 4 5 6
              1 5 1 7 
              T T T T   OK all columns are palindrom
*/

import java.util.Scanner;

interface Matrix_show   //interface declaration
 {
   public void matrix_showing(int arr[][]);   //abstract method 
 }


class Full_pal_matrix implements Matrix_show     
 {
    
   public void matrix_showing(int arr[][]) //concreating abstract method of Matrix_show interface
   {
      for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
         System.out.print(arr[i][j]+"  ");
        }
        System.out.print("\n");
       }  
   }
   
   
    public boolean full_pal_mat(int arr[][])
    {
      System.out.println("Trying");
      boolean flag=true;
      int temp=arr.length;
      int x=arr[0].length-1;
      for(int i=0;i<arr.length && flag!=false;i++,temp--)
      {
        for(int j=0,pose=x;j<=pose;j++,pose--)
        {           
           if(arr[j][i]!=arr[pose][i])
           {
            flag=false;
           }
        }        
      }    
       return flag;
    } 
 }
 
 class Matrix_Column_is_Palindrom_Or_Not
  {
     public static void main(String arg[])
     {
       Scanner s=new Scanner(System.in);
       Full_pal_matrix fpm=new Full_pal_matrix();
       Matrix_show ms=new Full_pal_matrix();


       System.out.println("Enter row values");
       int row=s.nextInt();
      
       System.out.println("Enter Column values");
       int col=s.nextInt();
       
       int brr[][]=new int[row][col]; 
       
       System.out.println("Enter values for Matrix");       
          
       for(int i=0;i<row;i++)       
          {
           System.out.println("Enter values for row:"+(i+1));
           for(int j=0;j<col;j++)
            {
               brr[i][j]=s.nextInt();
            }
          } 
          
        ms.matrix_showing(brr);
        boolean bret=fpm.full_pal_mat(brr);
        
        if(bret==true)
        {
          System.out.println("Given matrix  columns is-palindrom");
        }
        else
        {
          System.out.println("Given matrix  columns IS-Not-palindrom");
        }
              
     }  
  }
