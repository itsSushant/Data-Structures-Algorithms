package interview_qsn;

//--------------------------------------

//Link : https://prepinsta.com/accenture/coding/   ----

// The function accepts two positive integers ‘r’ and ‘unit’ and 
//a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ 
//represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each 
//ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

//--------------------------------------


import java.util.*;
import java.util.Scanner;

public class accenture_21 {
	
	public static int solve(int r, int unit , int arr[], int n) {
		
		if(arr == null)
			
			return -1;
		
		int res = r*unit;
		int sum = 0;
		int count = 0;
		for(int i = 0; i<n; i++) {
			
			sum = sum + arr[i];
		
			count++;
			if(sum >= res)
				break;
			
			
			
		}
		
		if(sum<res)
			

			return 0;
		return count;
		
	}
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int unit = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n ; i++) 
			arr[i] = sc.nextInt();
		System.out.println(solve(r, unit, arr, n));
	}
	
	
}
