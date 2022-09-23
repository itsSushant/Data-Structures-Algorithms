package dsasheets_qsns;

public class n11_subsum {
	
	
	public static long pairWithMaxSum(long arr[], long N)
    {
		
		
      long sum = 0;
      
      for(int i = 0; i<N-1; i++) {
         
            
        
          
          if(sum< (arr[i] + arr[i+1])) {
              sum = arr[i] + arr[i+1];
          }
      }
      
      
     return sum;
         
        
    }
	
	public static void main(String args[]) {
		
		long arr[] = {};
		long N =  6;
		
		System.out.println(pairWithMaxSum(arr,N));
	}
	
	
	
	
	

}
