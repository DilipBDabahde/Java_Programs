//using marvellous package

import Marvellous.Base;

class Driver
{
	public static void main(String args[])
	{
		System.out.println("inside Driver where we are using Marvellous package");
		
		Base bobj = new Base();
		
		bobj.fun();
		bobj.gun();
		
		System.out.println(bobj.Addition());
	
	}


}
