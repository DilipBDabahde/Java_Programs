//jagged array

class Jagaa_Array
{
	public static void main(String args[])
	{
		int arr[][]= new int[3][];
		
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {10, 20, 30, 40, 50};
		arr[2] = new int[] {110, 120, 130};
		
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
