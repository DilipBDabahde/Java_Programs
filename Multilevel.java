class Base
{	
	public int i;
	public void fun()
	{
		System.out.println("Inside fun of Baase");
	}
	
}

class Derived extends Base
{
	public int j;
	
	public void gun()
	{
		System.out.println("inside gun of Derived");
	}
	
	public void run()
	{
		System.out.println("inside run of Derived");
	}
}

class NewDerived extends Derived
{
	public void sun()
	{
		System.out.println("Inside newDerived sun");
	}

}


class Demo
{
	public static void main(String args[])
	{
		Base bobj =  new Base();
		
		bobj.fun();
		
		Derived dobj = new Derived();
		
		dobj.fun();
		dobj.gun();
		
		//upcasting 
		Base obj; //reference
		obj = new Derived();// 
		obj.fun();
		
		NewDerived nd = new NewDerived();
		nd.sun();
			
	}
}
