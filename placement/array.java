package placement;

// Find the smallest and second smallest elements in an array .


import java.util.*;
import java.util.Scanner;

public class array {
	
	public static void main(String args[]) {
		
		int[] arr = {111, 44, 44,4,6, 7 , 6};
		int n = arr.length;
		
		Arrays.sort(arr); 
		
		
		System.out.println("Smallest element is : " + arr[0]);
		System.out.println("Smallest element is : " + arr[1]);
	}
	

	

}


