/*
accept matrix from user and chk it's full-palindrom  matrix or not 

input: row:7		row and colum should-not be same
       col:7
		1  2   3  2  1  
		1  4   7  4  1  		//this row size or column size is accept
		1  2   3  2  1               
		0  0   0  0  0   	       row=2   1 2 3 4 3 2 1
		1  2   3  2  1  	       col=7   1 2 3 4 3 2 1  TRUE
		1  4   7  4  1  
		1  2   3  2  1    Everyrow and column is palindrom       		
*/

import java.util.Scanner;



class Full_pal_matrix implements Matrix_show     
 {
    
   public void matrix_showing(int arr[][])
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
      int temp=arr.length-1;
      int x=arr[0].length-1;
      
      
        
      for(int i=0;i<=temp && flag!=false;i++,temp--) //for row checking
      {
        for(int j=0,pose=x;j<=pose;j++,pose--)
        {         
            if(arr[i][j]!=arr[i][pose] || arr[temp][j]!=arr[temp][pose])
           {
            flag=false;
           }           
        }        
      }
      if(flag==false)
      {
            return flag;
      }
      else
      {           
         for(int i=0;i<x && flag!=false;i++) //for colunm checking
      {  
        for(int j=0,pose=arr.length-1;j<=pose;j++,pose--)
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
 }
 
 class Mix_Row_Com_Matrix_Palindrom_Cheking
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
        
        fpm.matrix_showing(brr);
        boolean bret=fpm.full_pal_mat(brr);
        
        if(bret==true)
        {
          System.out.println("Given matrix is full-palindrom");
        }
        else
        {
          System.out.println("Given matrix IS-Not full-palindrom");
        }                 
     }  
  }
  

