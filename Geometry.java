//example of inheritance


import java.lang.*;
import java.io.*;



class Circle
 {
 
	public float radius = 0.0f;
	public final float PI = 3.14f; // this type is constant
	
	public Circle(float val)	// parametersized constructor
	{
	 	//constructor of circle
	 	this.radius = val;	
	}
	
	public float Area() // not parameter
	{
	   float ans = 0.0f; // for float type
	   return PI*radius * radius;
	} 
 }
 
 final class NewCircle extends Circle
 {
 	public NewCircle(float ifval)
 	{
 		super(ifval);   // this call goes to 15 line parent construcotr
 		System.out.println("passing value from NewCircle to Circle");
 	}
 	
 	public float Circum()
 	{
 	  float ans = 0.0f;
 	  ans = 2 * PI * radius;
 	  return ans; 	
 	}
  }
  
  
  class Geomatry
  {
  	public static void main(String args[])
  	{
  	
  		System.out.println("Inside main:");
  		
  		Circle cobj = new Circle(3.9f);
  		
  		float fret = 0.0f;
  		
  		fret =cobj.Area();
  		
  		System.out.println("Area is: "+fret);
  		
  		NewCircle Nobj = new NewCircle(6.2f);
  		
  		fret = cobj.Area();
  		System.out.println("Area is"+fret);
  		
  		fret = Nobj.Circum();
  		System.out.println("Circum is"+ fret);
  	}
  
  
  }
