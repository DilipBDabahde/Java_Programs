/*
use of unnamed block and static block

*/

class Base
{	
	 static{
	 	System.out.println("Static Base A0");
	 }
	{
		System.out.println("inside first unnamed block A2");
	}

	public Base()
	{
		System.out.println("Inside defuat Base construcor A4");
	}

	public Base(int ival)
	{
		System.out.println("inside parametersized construcor para xx");
	}

	{
		System.out.println("inside second unnamed block A3");
	}

	static{
		System.out.println("Base static block A1");
	}
}

class Hello
{
  {
  	System.out.println("Inside unnamed block before main"); //<<---------  This block executre after static
  }															//Req obj to exeture

  static{
  	System.out.println("static before main");		// <<--------- This block execute first 
  }													// not req object to execute

  public static void main(String args[])
  {
  	Hello hobj = new Hello();	// Hello or Base class obj creation seq is important
  	Base bobj = new Base();
  	Base bobj2 = new Base(11)
  		
  }

}