package code1;


import java.util.*;

class sorting {
	
	public static void printArray(int arr[])  {
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] =" ");
			
		}
		System.out.println();
		
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5,8,7,9,4,1};
	
		
		
		
		//BubbleSort
		
		//This is outer loop to calculate n-1 iterations .  arr.len=n
		for(int i = 0; i<arr.length-1;i++) {
			
			//innerloop
			for(int j=0; j<arr.length-i-1;j++) { 
				
				if(arr[i]> arr[i+1]) {
					//swap 
					
					int temp = arr[i] ;
					arr[i] = arr[i+1] ;
					
					arr[i+1] = temp;
					
				}
				
				
				
			}
				 
				
		}
		
		printArray(arr);
		
	}

}
