//Threader

class Demo3 extends Thread
{

	public void fun()
	{
		synchronized(this)		//start sync   block synchronizeds
					{
						for(int i = 1; i <= 10; i++)
						{
							System.out.println("In fun: "+i);
						}	
					}	//till this line
	}
	
	public void run()
	{
		fun();
	}
}

class TestDemo3
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
