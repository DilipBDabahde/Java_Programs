//Threader

class Demo3 extends Thread
{

	synchronized public void fun()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("In fun: "+i);
		}						
	}
	
	public void run()
	{
		fun();
	}
}

class Method_Synchronized
{
	public static void main(String args[])
	{
		
		Demo3 d = new Demo3();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
	
	}

}
