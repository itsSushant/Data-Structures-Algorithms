package placement;

import java.util.Arrays;

public class array1 {
	
	static void getElements(int[] arr, int n) 
	
	{
		int n = 0;
		
		Arrays.sort(arr);
		
		int small = arr[1];
		int large = arr[n-2];
		
		System.out.println("2nd Largest is :" + large);

		System.out.println("2nd Smallest :" + small);
		
		
		
		
	}
	
	// main method driving code;
	
	public static void main(String[] args) {
		int arr[] = {2, 42, 33, 34, 45, 55};
		int n = arr.length;
		getElements(arr, n);
	}

}
