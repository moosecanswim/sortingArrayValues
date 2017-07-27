package sortingValues;

public class SortingValues{
	/**
	This app will sort an array of values and sort them into ascending order
	this will print out the input array (hard coded) on one line
	and the output array on the next line
	
	Kyle G.
	
	**/
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[j]>arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}