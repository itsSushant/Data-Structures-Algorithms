package placement;

public class rem_duplicates {
	
	public static int remove_dup(int A[], int n) {
		
		int res =1; 
		int x=0;
		for(int A[] : x) {
			
			if(A[res - 1] != x) {
				
				A[res] = x;
				
				res++;
			}
				
				
		}
		
		return res;
	}
	
	// Follow such steps to write your driver code /
	public static void main(String args[])
    {
        int A[] = { 1, 6, 3, 1, 3, 6, 6 };
        int n =  A.length;
        System.out.println("The repeating elements are: ");
 
        // Function call is here 
        remove_dup(A, n);
    }

}
