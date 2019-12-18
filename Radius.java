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
 
 
 class CircleDriver
 {
 	public static void main(String args[])
 	{
 		Circle cobj = new Circle(5.0f);
 		float res = cobj.Area();
 		System.out.println(res);
 	}
 }
