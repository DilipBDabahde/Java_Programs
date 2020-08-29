//array creating in java

class DriverMe
{
	public static void main(String args[])
	{
		int arr[];	//ref created
		arr = new int[4]; /// arr is like objecte created
		
		System.out.println("Hello world ");
		
		arr[0]= 10;
		arr[1]= 30;
		
		System.out.println(arr[0]);
		
		
		////////////////
		
		int arr2[] = new int[4];
		arr2[2] = 333;
		System.out.println(arr2[2]);
		//////////////////////
		int arr3[] = {10, 20, 30, 40};
		System.out.println(arr3[3]);
		/////////////////////////
		int arr4[] = new int[] {20, 40, 60, 80};
		System.out.println(arr4[3]);
		
		
		////////////////// FOR LOOP USAGE //////////////////////////////////
		for(int i = 0; i < arr4.length; i++)
		{
			System.out.print(arr4[i]+" ");
			if(i == arr4.length-1)
			{
				System.out.print("\n");
			}
		}
		
		////////////////// WHILE LOOP USAGE //////////////////////////////////
		
		int x = 0;
		while(x != arr3.length)
		{
			System.out.print(arr3[x]+" ");
			if(x == arr.length-1)
			{
				System.out.println();
			}
			x++;
		}
		
		////////////////// FOR EACH USAGE //////////////////////////////////
		int arrx[] = new int[]{1,2,3,4,5};
		for(int value : arrx)
		{
			System.out.print(value +" ");
		}
		System.out.print("\n");
	
	}


}
