
/*
	Demo2 class implemented Runnable interface which is having  run method which is abstract and Demo2 class has concreated that run method in it which is call back method.
	and By creating obj of Thread class in main methood we are calling start method where start method internally call run method which is defined in Demo2 class.

*/

class Demo2 implements Runnable
{
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Runnable: "+i);
		}
	}
}

class TestRunnable
{
	public static void main(String args[])
	{
		Demo2 d1 = new Demo2();
		
		Thread  t1 = new Thread(d1);	
		Thread  t2 = new Thread(d1);	
		
		System.out.println("We wiill have Random ourput on console");
		
		t1.start();
		t2.start();
		

	
	}

}
