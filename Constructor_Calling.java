//constructor calling from one to another

class Base
{
	
	public Base()
	{
		System.out.println("Inside Base default constructor:  ");
	}

	public Base(int i, int v )
	{
		this();
		System.out.println("Inside Base parameter Constructor: "+ i);
	}
}

class Driver
{
	public static void main(String args[])
	{
		System.out.println("Inside main of Driver");
		Base objx = new Base(); //only defautl constructor gets call
		Base obj = new Base(11, 21); //default + para constructor gets call	
		
		System.out.println(obj.hashCode());
		System.out.println(objx.hashCode());
		
		Base iobj = obj;
		System.out.println(iobj.hashCode());
	}

}
