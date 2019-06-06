//actual user of inhetance

class Circule
 {
    public float radius=0.0f;
    public final float PI=3.14f;
    
   public  Circule(float value)
   { 
     radius=value;
   }
   
   
   public float Area()
   {    
     return PI*radius*radius;
   }
 }
 
 class NewCircum extends Circule
 {
    
   public NewCircum(float iNo)  
   {
    super(iNo);     //send value to parend constructor
   }
   
   public float CircumArea()
   {     
     return 2*PI*radius;  
   } 
 }
 
 
 class Geometry
  {
   
   public static void main(String args[])
   { 
   
      Circule cobj=new Circule(10.10f); 
      float fret=0.0f;`           
      
      System.out.println("----------------------------------------");
      fret=cobj.Area();
      System.out.println("This is Circule area :"+fret);
      
      
      NewCircum ncobj=new NewCircum(18.5f);
      fret=ncobj.Area();
      System.out.println("Area is :"+fret);
      
      fret=ncobj.CircumArea();
      System.out.println("Circumeference Area is :"+fret);
      
      System.out.println("----------------------------------------");  
   }  
  
  }
