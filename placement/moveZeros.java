package placement;

class moveZeros {
    public void moveZeroes(int[] nums) {
        int y=0;
	    for(int i =0;i<nums.length;i++){
	        if(nums[y]==0){
	        int temp =nums[y];
	                 for(int j =y;j<nums.length-1;j++){
	                     
	                     nums[j]=nums[j+1];
	                     
	                 }
	        nums[nums.length-1]=temp;
	        }
	        else{
	            y++;
	        }
	    }
        
    }
}