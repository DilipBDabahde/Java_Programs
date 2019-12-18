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
  
 class CircleDriver
 {
 	public static void main(String args[])
 	{
 		NewCircle cobj = new NewCircle(5.0f);
 		float res = cobj.Circum();
 		System.out.println(res);
 	}
 }
