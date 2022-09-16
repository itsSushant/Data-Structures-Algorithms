


package hash_qsns;

import java.util.*;


public class rem_duplicates {
	
	
	public static void main(String args[]) 
	{
        int arr[] = {1,1,2,2,2,3,3};
        int k = remdup(arr);
        System.out.println("The array  removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
	
	static int remdup(int[] arr) {
		
		
		HashSet<Integer> set =  new HashSet<> ();
		
		for( int i = 0; i<arr.length ; i++) {
			
			set.add(arr[i]) ;
			
			
		}
		
		int k = set.size();
		
		int j  = 0;
		for(int x : set) {
			arr[j++]  = x;
		}
		return k;
	}
	
	
	

}
