package dsasheets_qsns;

public class kadanes_algo {
	
	
	//Maximum Subarray Sum | Kadane's Algorithm
	
	
	
	static long maxSubarraySum(int arr[], int n){
		
		long max_so_far = arr[0];
	    long max_end = 0;
	        
	    int i,j;
	    
	    for(i= 0;i<n;i++) {
	    	
	    	max_end =  max_end + arr[i];
	            
	        if(max_end > max_so_far) {
	        	
	        	max_so_far = max_end;
	                
	        }
	            
	        if(max_end < 0) {
	        	
	        	
	        	
	        	
	           max_end =  0;
	                
	        }
	            
	        
	        
	     
	    
	    } 
	    return max_so_far;
	    

	    
	   
	    
	}
	public static void main(String args[]) {
    	int arr[]={1 ,2, 3, -2, 5};
    	int n = 5;
    	
    	System.out.println(maxSubarraySum(arr,n));
    }
	
	
        
        
        
        
    
    	
    
        
}
