package dsasheets_qsns;

public class n7_long_sum {
	
	
	static int maxLen(int arr[], int n)
    {
        int i,j;
        int max = 0;
        
        for(i=0;i<n;i++ ) {
            int sum = 0;
            for( j = i; j<n;j++) {
                
                sum+= arr[j];
                
                if(sum == 0) {
                    max = Math.max(max,j-i+1);
                        
                        
                    
                }
            }
        }
        return max;
    }
	
	
	public static void main(String args[]) {
		
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		int n = 6;
		
		System.out.println(maxLen(arr, n));
	}

}
