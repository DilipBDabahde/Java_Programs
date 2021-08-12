/*
wap with thread without thread
*/
import java.text.NumberFormat;
import java.text.DecimalFormat;

class NewThread extends Thread
{
	public void aM()
	{
		for(int i = 5; i >= 0; i--)
		{
			System.out.println("aM is : "+i);
		}
	}
	
	
	public void bM()
	{
		for(int i = 5; i >= 0; i--)
		{
			System.out.println("bM is : "+i);
		}
	}
	
	
	public void cM()
	{
		for(int i = 5; i >= 0; i--)
		{
			System.out.println("cM is : "+i);
		}
	}

	public void run()
	{
		aM();
		bM();
		cM();
	}
}


class MainThread
{
	public static void main(String args[])
	{
		
		NewThread nt = new NewThread();
		
		long start = System.nanoTime();

		nt.aM();
		nt.bM();
		nt.cM();		
		
 		long end = System.nanoTime();
 		long elapsedTime = end - start;
		System.out.println("Execution time without thread is "+ elapsedTime/1000);
		
		
		
		start = System.nanoTime();
		Thread t = new Thread();
		t.start();
					
 		end = System.nanoTime();
 		elapsedTime = end - start;

		System.out.println("Execution time with thread is "+ elapsedTime/1000);
		
	}
}
