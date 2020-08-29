//usage of package and mking user defined package

package Marvellous;

public class Base
{
	int i;
	int j;
	
	public Base()
	{
		i = 10;
		j = 20;	
	}
	
	public void fun()
	{
		System.out.println("inside fun of Base");
	}

	public void gun()
	{
		System.out.println("inside gun of Base");
	}
	
	public int Addition()
	{
		return i + j;	
	}
}


