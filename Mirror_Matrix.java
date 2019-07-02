/*
accept matrix from user and check given matrix values are mirror image or not
input: row=3
input: col=3
			row*2=6
			col*2=6
			3	 1  2  3  4  5  6 
			2	 7  8  4  9  4  5
			1	 7  4  1  2  3  4  <<<<<<<<<----- this is upper half part
  comparison--> chk				 	
			1	 7  4  1  2  3  4
			2	 7  8  4  9  4  5
			3	 1  2  3  4  5  6  <<<<<<<<------ this is downside part 
				 		 	now we have to check this given values programmatically 
				 		 	if given values are mirror reflect then return TRUE else FALSE
*/


import java.util.Scanner;


class Mirror_XMatrix 
 {
     public void matrix_show(int brr[][])
     {
       System.out.println("Given Matrix is.............");
       for(int i=0;i<brr.length;i++)
        {
          for(int j=0;j<brr[i].length;j++)
          {
            System.out.print(brr[i][j]+"   ");
          }
          System.out.print("\n");
        }       
     }
    
     public boolean mirror_Matrix(int arr[][])
     {
       int i=0,j=0,icnt=0,temp=0;
       int k=1;
       for(i=0;i<arr.length;i++,k++)
        {
             temp=arr.length-k;
           for(j=0;j<arr[i].length;j++)
           {
               if(arr[i][j]==arr[temp][j])
               {
                 icnt++;
               }
           }        
        }
        System.out.println(icnt+"  "+arr.length*arr.length);
        if((arr.length*arr.length) == icnt)
        { 
          return true;
        }
        else
        {
          return false;
        }
     }
  } 
  
 
 class Mirror_Matrix
 {  
    public static void main(String arg[])
    {
      Mirror_XMatrix mx=new Mirror_XMatrix();
      Scanner sobj=new Scanner(System.in);
    
      System.out.println("Enter rowsize");
      int row=sobj.nextInt();
      
            
      System.out.println("Enter colsize");
      int col=sobj.nextInt();
      
      //creating array structure  for matrix
      if(row==col)
      {
       int arr[][]=new int[row][col];  //2d structrue is alloacted on heap,just need to fill values
    
       System.out.println("Enter values for Squar matrix");
         
          for(int i=0;i<arr.length;i++)
          {  
            System.out.println("Enter values for:"+(i+1)+" row");
            for(int j=0;j<arr[i].length;j++)
            {
              arr[i][j]=sobj.nextInt();
            }            
          } 
     
       mx.matrix_show(arr);
         
        
       boolean bret=mx.mirror_Matrix(arr);
       if(bret==true)
       System.out.println("Given Matrix is Mirror matrix");
       else
       System.out.println("Given Matrix is-Not Mirror matrix");
       }
       else
       {
         System.out.println("given rows and cols sizes are not same for square matrix");
       }
        
    }
 }
