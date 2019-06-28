//accept string from user and count Freq of each word from that string
//input:  str=" this is not a game this is challenge"
//output: {this=2, is=2, not=1 ,a=1, game=1, challenge=1}

import java.util.Scanner;
import java.util.HashMap;

class Word_Freq
 {
    public void word_cnt(String str)
    {
	HashMap<String,Integer> hobj;
	hobj=new HashMap<String,Integer>();
	//now creating array of string
	
	String arr[]=str.trim().split("\\s+");  //string conversion into arrray
	
	for(String elements:arr)
	{
	  if(hobj.containsKey(elements))
	   {
	      hobj.put(elements,hobj.get(elements)+1);
	   }
	   else
	   {
	     hobj.put(elements,1);
	   }	
	}
	
	System.out.println(hobj);
	hobj=null;
    }
 }
 
 
 class Word_Counter
  {
    public static void main(String arg[])
    {
       Scanner s=new Scanner(System.in);
       Word_Freq wf=new Word_Freq();
       
       System.out.println("Enter string");
       String str=s.nextLine();       
       wf.word_cnt(str);    
    }  
  }
