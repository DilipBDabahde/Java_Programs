class Base
{
	public Base()
	{
		
		System.out.println("inside default constructor");	
	}


	public Base(int x)
	{
		this();
		System.out.println("inside 1 para constructor");	
	}
	
	public Base(int a, int b)
	{
		this(a);
		System.out.println("inside 2 para constructor");	
	}

}


class Driver
{
	public static void main(String args[])
	{
		Base obj1 = new Base(11, 21);	
	} 
}
