//Demo of try and catch with finally
//Exception occured: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

// to get exception in this file then add in loop isize+1 it will generate exception but now our program is ok	
class A
{
	public int ArraySum(int arr[])
	{
		int isize = arr.length, isum = 0;
		System.out.println("Array size is: "+isize);
		
		//in loop we increated size of array which is Wrong so it generate exception
		
		for(int i = 0; i < isize+1; i++)
		{
			isum += arr[i];
		}
		
		return isum;
	}
}

class A_Driver
{
	public static void main(String args[])
	{
		try
		{
			A aobj = new A();
			
			int arr[] = {10,20,30,40,50};
			
			int isum = aobj.ArraySum(arr);		
			System.out.println("All elements sum is: "+isum);
		}		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured 2: "+e);
		}		
		catch(Exception e)
		{
			System.out.println("Exception occured 1: "+e);		
		}
		finally
		{
			//resource deallocation done in this block
			System.out.println("inside finally block\nIn ArraySum of program change size of it to avoid exception\n");  //this block execute all time after try block
		}
	
	}

}
