//accept string from user and shift all specail character at rigth side of string inwhich order they are used  as input

//input: we@are#not&machin*ok@
//output:wearenotmachinok@#*@

import java.util.Scanner;

class Str_Conversion
 {
    public String String_Change(String str)
    {
       
       char arr[]=str.toCharArray(); 
       String str1="";
       String str2="";
       
       for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>='A' && arr[i]<='Z' || arr[i]>='a' && arr[i]<='z')
            {
              str1=str1+arr[i];
            }
            else
            {
              str2=str2+arr[i];
            }
        }        
        return (new String(str1+str2));
    } 
 }
 
 class SpecialShiftTORigth
  {
      public static void main(String args[])
     {
        Scanner s=new Scanner(System.in);
        Str_Conversion sobj=new Str_Conversion();
        
        System.out.println("Enter string");
        String str=s.nextLine();
       
         System.out.println(sobj.String_Change(str));    
     }
  
  }
