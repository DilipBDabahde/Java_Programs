/*
abstract class with static method
here we have abstract class but we are using static method in abstract class so we do not need
to creatd object of Demo we are gonna call direct to fun from main()
*/



abstract class Demo
{
	static void fun()
	{
		System.out.println("Static of Demo");
	}
}


class Hello
{
	public static void main(String args[])
	{
		Demo.fun();
	}
}