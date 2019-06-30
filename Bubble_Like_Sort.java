//accept array from user and sort array like bubble

 import java.util.Scanner;
 
 class Bubble
 {
    public void Bubble_Sort(int arr[])
    {
      
      int i=0,j=0,temp=0;
    
      for(i=0;i<arr.length-1;i++)
      {    
        for(j=0;j<arr.length-i-1;j++)
        {  
           if(arr[j]>arr[j+1])
           {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;          
           }       
        }
      }    
    }    
 }

 class Bubble_Driver
 {
   
   public static void main(String arg[])
    {
    
      Scanner s=new Scanner(System.in);
      Bubble bobj=new Bubble();
      
      System.out.println("Enter array size");
      int size=s.nextInt();
      
      int arr[]=new int[size]; //memory allocation for array
      System.out.println("Enter element for array");
      for(int i=0;i<size;i++)
      {
        System.out.print("Enter Elements: "+(i+1)+":");
        arr[i]=s.nextInt();        
      }
      
       bobj.Bubble_Sort(arr);
       
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }   
       
       System.out.println("\ngood by");  
   }
 }
