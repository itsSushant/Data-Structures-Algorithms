package dsasheets_qsns;

public class n1_max_ones {
	
	static int findMaxConsecutiveOnes(int[] nums) {
        int maxxnum = 0;
        
        int count = 0;
        
        for(int i = 0; i<nums.length;i++) {
            
            if(nums[i] == 1) { count++;
                              
                maxxnum = Math.max(count,maxxnum);
            }
            
            else {
                count = 0;
                
            }
            
            
        }
        
        
        return maxxnum;
    }
	
	
	 public static void main(String args[]) {
		 
		 
	     int nums[] = { 1, 1, 0, 1, 1, 1 , 1, 1, 0, 1, 1, 1};
	     
	     int ans = findMaxConsecutiveOnes(nums);
	     
	     
	     System.out.println("The maximum  consecutive 1's are " + ans);
	     
	     
	 }
	       


	// O(n)

}
