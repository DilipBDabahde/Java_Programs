/*
abstract class 
abstract method
demo class has gun abstract method that have to be defined by derived
if we declare abstract method it just contains declaration of methoood

that method should be defined by inherited class 


*/

abstract class Demo
{
	 public void fun()
	{
		System.out.println("Demo fun");
	}

	abstract void gun();
}

class Derived extends Demo
{	
	void gun()
	{
		System.out.println("Derived implements gun");
	}
}

class Hello
{
	public static void main(String args[])
	{

		Demo dobj = new Derived();
		dobj.fun();
		dobj.gun();
	}

}