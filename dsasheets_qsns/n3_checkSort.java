package dsasheets_qsns;

//Check if array is sortted or not.


public class n3_checkSort {

	boolean arraySortedOrNot(int[] arr, int n) {
	     
	     
	     int i;
	     for( i=0;i<n-1;i++) {
	         if(arr[i] > arr[i+1]) {
	             return false;
	             
	         }
	         
	     }
	     return true;
	     
	 }
	
	public static void main(String args[]) {
		
	    int arr[] = {1, 2, 3, 4, 5}, n = 5;

	    System.out.println(isSorted(arr, n));
	}
}

