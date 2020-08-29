//array in java

class Array_Demo
{
	public static void main(String args[])
	{
		int arr[][] = new int[][] {{1,2,3},{10,20,30}};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j =0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 
	
	}
}
