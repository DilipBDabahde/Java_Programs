//accept int array from user and show freq of each num from that array
//input: arr[]={11,3,5,11,3,22,4,5,11,4,11}
//ouput: 11=4, 3=2, 5=2, 22=1, 4=2

import java.util.Scanner;
import java.util.HashMap; 
class Num_Freq
 {
     public void Num_Freq_Cnt(int arr[])
     {
     /*  int val=0,icnt=0,j=0;
       
       System.out.print("Freq of each number\n{");
       for(int i=0;i<arr.length;i++)
        {            
           if(arr[i]!=0)
           {                               
           for(j=0;j<arr.length;j++)
           {
              if(arr[i]==arr[j])
              {                    
                icnt++;
              }           
           }    
           
           val=arr[i];
           for(j=0;j<arr.length;j++)
           {
              if(arr[j]==val)
              {
               arr[j]=0;
              }
           }           
           System.out.print(val+"="+icnt+" ");
           icnt=0;
          }
        }
        
       System.out.println("}");  
     */   
        HashMap<Integer,Integer> hobj;
        hobj=new HashMap<Integer,Integer>();
        
        for( int no: arr)
         {
           if(hobj.containsKey(no))
           {
             hobj.put(no,hobj.get(no)+1);           
           }
           else
           {
             hobj.put(no,1);
           }              
         }
         
         System.out.println(hobj);
         hobj=null; 
               
    } 
 }

class Number
 {
   public static void main(String arg[])
   {
     Scanner s=new Scanner(System.in);
     Num_Freq nobj=new Num_Freq();
     
     System.out.println("Enter array size");
     int size=s.nextInt();
     
     int arr[]=new int[size];
          
     System.out.println("Enter values for array");
     for(int i=0;i<size;i++)
      {
            arr[i]=s.nextInt(); 
      }
     
      nobj.Num_Freq_Cnt(arr);   
     // System.out.println("\nAbove is freq of each num of array");
   }
 }
