
//just create object and make method call from entry point function of this file
class Hello
{
	public int i;
	public int j = 10;
	
	public void fun()
	{
		System.out.println("Hello fun");
	}
}

class Demo
{
	public static void main(String args[])
	{
		System.out.println("Inside main");
		
		Hello hobj = new Hello();
		
		hobj.fun();
		System.out.println(hobj.i +" "+ hobj.j); //default value of i is 0
	}
}
