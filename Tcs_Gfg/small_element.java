package Tcs_Gfg;

public class small_element {

	
	
	static int Small_num(int[] arr) {
		
		int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] < min) {
	    	  
	        min = arr[i];
	        
			}
	      
				
		}
		
		return min;
	}
	
	
	public static void main(String[] args)	{
		
		int[] arr =  {2,5,4,8,9,3,4,5};
		System.out.println("The smallest element in the array is: "+ Small_num(arr)) ;
	}
	
	
}
