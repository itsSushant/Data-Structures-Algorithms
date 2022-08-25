package dsasheets_qsns;

public class subarraySum {
	
	int sub_sum(int arr[], int n, int sum) {
		
		int curr_sum,i,j;
		
		
		// this is where the start point is 
		for(i=0;i<n;i++) {
			
			curr_sum = arr[i];
			
			
			for(j=1;j<n;j++) {
				
				if(curr_sum == sum) {
					int p = j -1;
					
					System.out.println("Sum found between indexes "  + i + " and " +p);
					
					return 1;
					
				}
				
				if(curr_sum > sum || j == n) 
					break;
				curr_sum = curr_sum+arr[j];
				
				
			}
			
			
		}
		System.out.println("No subarray found") ;
		return 0;
	}
	
	public static void main(String[] args)
    {
        subarraySum arraysum = new subarraySum();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int sum = 23;
        arraysum.sub_sum(arr, n, sum);
    }

}
