package dsasheets_qsns;

public class n8_removeduplicates {
	


    
    static int remove_duplicate(int A[],int N){
        
        //Arrays.sort(A)
        
        if(N == 0) {
            return 0;
        
        }
        
        int i, j;
        
        
        // this is our resultt that is new array final one .
        
        int res=0;
        
        for(j= 0; j<N ; j++) {
            
            if(A[j] != A[res]) {
                
                res = res+1 ; 
                A[res] = A[j];
                
                
                
            }
            
        }
        return res + 1;
        
    
    
    

    }

    public static void main(String args[]) 
	{
        int arr[] = {1,1,2,2,2,3,3};
        int k = remove_duplicate(arr);
        System.out.println("The array  removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}









// Method 2 
//
//int res=1;
//
//for(int x : nums) {
//    
//    if(nums[res-1] != x) {
//        
//        nums[res] = x;
//        
//        res++;
//        
//    }
//    
//    
//}
//return res;
//
//
//
//
//
//

