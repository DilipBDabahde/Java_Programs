//use of hashtable in java as collection frameword


import java.util.*;
import java.lang.*;

class Demo_HashTable
 {
     public static void main(String arg[])
     {
      Hashtable <String,Integer> ht=new Hashtable<String,Integer>();
      
      ht.put("Dilip",11); //string is key  and Int value 
      ht.put("Anil",25);
      ht.put("Goa",52);

        for(Map.Entry m:ht.entrySet())
        {  
          System.out.println(m.getKey()+" "+m.getValue());  
        }
         ht.clear();
     }
 }
