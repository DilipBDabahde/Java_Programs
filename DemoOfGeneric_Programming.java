//generic programming example in java

import java.lang.*;

class DemoOfGen
 {
    public static<T> void print(T arr[])
    {
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      } 
    }
  
    public static void main(String arg[])
    {
      
      Integer iarr[]={1,5,3,2,6,7,3};
      Character carr[]={'a','z','t','4','f','y'};
      Float farr[]={10.4f,14.4f,5.5f};
      Double darr[]={14.213,52.432,93.322,3.43232,4.2342};
      print(iarr);
      print(carr);
      print(farr);
      print(darr);
      
    }
 }
 
 
