/*
below we have 3 clasees fist Base class is final so that is can not be inherirted.

derived class in going to inherit Base but not able to inherit bcs its final so that derived class
create errors

in Hello class we use composition 
where we have object of base class in Hello and 
Demo class has object of Hello aftere bu using object of hello we call fun of hello 
in fun of hello we are calling to base fun 
*/


final class Base
 {	
 	public void fun()
 	{
 		System.out.println("in base fun");
    }
 }  

/*
class Derived extends Base
{
	public void sun()
 	{
 		System.out.println("in Derived fun");
    }
}

*/

class Hello
{	
	public	Base bobj = new Base();  //composition

	public  void fun()
	{		
		bobj.fun();
		System.out.println("Hello fun");
	}
}


class Demo 
{
	public static void main(String args[])
	{
		Base bobj = new Base();
		Hello hobj = new Hello();
		hobj.fun();
	}
}