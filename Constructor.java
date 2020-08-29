//constructor 

class Base
{
	public int i;
	public int j;
	
	public Base()
	{
		i = 10;
		j = 20;
		
		System.out.println("Sum is :"+(i+j));
	}
	
	public Base(int a, int b)
	{
		i = a;
		j = b;
	}
	
	public void Addition()
	{
		System.out.println("Addition is :"+(i+j));
	}
	
	public void Hello()
	{
		System.out.println("Inside Hello method");
	}
}

class Driver
{
	public static void main(String args[])
	{
		System.out.println("Inside main");
		
		Base obj = new Base();
		Base obj1 = new Base(50, 100);
		Base obj2 =  obj1;
		
		obj2.Addition();		
		obj.Addition();
		obj1.Addition();
		obj2.Hello();				
	}

}
