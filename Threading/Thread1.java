/*
here we are having Thread class extends and we creaed two obj of tthead class 
but output is random here we need to make syncronise this.

*/
class Demo1 extends Thread
{
	public void run()
	{
		for(int i = 1;i <= 10; i++)
		{
			System.out.println("Thread :"+i);
		}	
	}
}


class TestThread
{
	public static void main(String args[])
	{
		Demo1 d1 = new Demo1();
	
		
		Thread t1 = new Thread(d1);

		Thread t2 = new Thread(d1);
		
		
		t1.start();
		t2.start();
			
	}
}
