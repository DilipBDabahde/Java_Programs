/*
transient keyword is used to to avoid pass its original value while serializing. it just pass it's default value.

transient is a variables modifier used in serialization. At the time of serialization, if we don’t want to save value of a particular variable in a file, then we use transient keyword. When JVM comes across transient keyword, it ignores original value of the variable and save default value of that variable data type.

*/

import java.io.*;

class Demo implements Serializable
{
	public int i;
	public String name;
	public transient int j;
	
	public Demo(int i, String name, int j)
	{
		this.i = i;
		this.name = name;
		this.j = j;	
	}
}

class Hello_transient
{
	public static void main(String args[])
	{
		
		Demo obj =  new Demo(11, "Dilip", 100);
		
		try
		{
		FileOutputStream fo = new FileOutputStream("Marvellous.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fo);
		
		//obj used
		System.out.println(obj.i);
		System.out.println(obj.name);
		System.out.println(obj.j);
		
		oos.writeObject(obj); //writing obj
		
		Demo obj1 = null;
		
		FileInputStream fis = new FileInputStream("Marvellous.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		obj1 = (Demo)ois.readObject();
		
		System.out.println("\nDue to transiend we are unable to copy actual value of valirable");
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		System.out.println(obj1.j);	
		
		}
		catch(Exception e)		
		{
			System.out.println("Excpetion occured: "+e);
			e.printStackTrace();
		}
		
	}
}
