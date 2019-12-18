import java.io.*;


class Math
{
	
	public void Add()
	{
		System.out.println("Inside Math add");	
	}
	
	public void Add(int ival)
	{
		System.out.println("inside Math add 1 para");
	}
	
	public void Add(float fval)
	{
		System.out.println("Inside Math add float value");
	}
	
	public void Sub()
	{
		System.out.println("Inside Math Sub");
	}
	public void Sub(int ival)
	{
		System.out.println("Inside Math Sub 1 para");
	}
}

class Check extends Math
{
	public void Multi()
	{
		System.out.println("Inside Check Multi");	
	}
	
	public void Add(int ival)
	{
		System.out.println("inside Check  1 para");
	}
	
	public void Div(float fval)
	{
		System.out.println("Inside Check  float value");
	}
	
	public void Sub()
	{
		System.out.println("Inside Check Sub");
	}
	public void Sub(int ival)
	{
		System.out.println("Inside Check Sub 1 para");
	}

}


class LeadMath
{
	public static void main(String args[])
	{
		Math mobj = new Check();
		
		mobj.add(2.0f);

	
	}
}
