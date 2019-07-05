

interface c
{
    public static void main(String ...arg)
    {
     System.out.println("hi from Interface c");
    }
} 

class A
 {
    public static void main(String ...arg)
    {
      System.out.println("hi from A");  
    }
 }
 
 class B extends A
  {
    public static void main(String ...arg)
    {     
    
     A.main();    
     System.out.println("hi from B");
      c.main();
    }
  
  }
