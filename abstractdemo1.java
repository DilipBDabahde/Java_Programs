/*
use of abstract in java

Demo is abstract class so we can not create direct its class in hello
so that we can not call fun of Demo 
to call fun of Demo we have to crate derived class where tthat derived class inherit Demo
then we create ref of Demo and create obj of derived




*/

abstract class Demo
{
   public void fun()
   {
   	System.out.println("Demo fun");
   }
}

class Derived extends Demo
{

}

class Hello
{
	public static void main(String args[])
	{
	Demo dobj = new Derived();
	dobj.fun();
    }
}