//demonstration of ArrayList in java


import java.util.*;
import java.lang.*;
import java.io.*;



class DemoVector 
 {  
    
    public void Vector_v()
   {
     System.out.println("User of Vector in Collection");
   
     Vector <Integer> vobj1=new Vector<Integer>();
     Vector <Integer> vobj2=new Vector<Integer>();
     
     vobj1.add(42);
     vobj1.add(2);
     vobj1.add(53);
     vobj1.add(82);
     vobj1.add(93);
     vobj1.add(25);
     
     vobj1.remove(4);  //42 2 53 82 25
     vobj1.set(2,5);  //42 2 5 82 25
    
     //sorting
     Collections.sort(vobj1);  //2 5 25 42 82 
     Iterator iobj;
     iobj=vobj1.iterator();  
    
     
     while(iobj.hasNext())
     {
      System.out.print(iobj.next()+" ");
     }     
     System.out.println();
     
     vobj1.clear();       
   }
 }


class DemoLinkedList extends DemoVector
  {
      public void LinkedList_L()
      {
      System.out.println("\nUser of LinkedList in Collection");
      LinkedList<Integer> ll=new LinkedList<Integer>();  //LinkedList obj is created 
      
      ll.add(42);
      ll.add(2);
      ll.add(52);
      ll.add(15);
      
      ll.remove(3); //42 2 52	//if we do not define index then this methon remove '0' index value
      ll.add(5); // 42 2 52 5
      ll.add(63); //42 2 52 5 63
      ll.set(2,110); //42 2 110 5 63
      Collections.sort(ll); //1 5 42 63 110
      
      ll.add(30); //1 5 42 63 110 30
      ll.set(3,4);  // 1 5 42 4 110 30
      Collections.sort(ll);//1 4 5 30 42 110     
      ll.remove(5);//1 4 5 30 42 
      Iterator iobj; //Iteration is Inteface
      iobj=ll.iterator();  //ll objext is used to call iteration method 
      
      while(iobj.hasNext())
      {
        System.out.print(iobj.next()+" ");
      }     
      //1 4 5 30 42
       System.out.println();
       ll.clear();
      }
      
      
  
  
  }

class DemoArrayList extends DemoLinkedList
{
   public void ArrayList_A()
   {  
      System.out.println("User of ArrayList in Collection");
      ArrayList <Integer> al=new ArrayList <Integer> ();  //Integer is wrapper class 
    //  ArrayList <Integer> al=new ArrayList <Integer> ();  //Integer is wrapper class 
       
       al.add(13);
       al.add(32);
       al.add(42);
       al.add(3);
       al.add(1);
       
       al.remove(2);  //42 is removed   13  32 3 1
       System.out.println(al);
       al.add(62);	// 13  32 3 1 62
       System.out.println(al);
       al.set(1,9); // 13 9 3 1 62
       System.out.println(al);
       Collections.sort(al);   //1 3 9 13 62
       System.out.println(al);
       Iterator iobj;
       
       iobj=al.iterator();  //iterator is methon in Iterator in interface	         
       
       while(iobj.hasNext())
       {
        System.out.print(iobj.next()+" "	);
       }
       System.out.print("\n"); //1 3 9 13 62
       
       al.clear();
   } 
}

class collection
 { 
    public static void main(String arg[])
    {
      
      DemoArrayList dal=new DemoArrayList();
       dal.ArrayList_A();
       dal.LinkedList_L();
       dal.Vector_v(); 
    
    }
 }
