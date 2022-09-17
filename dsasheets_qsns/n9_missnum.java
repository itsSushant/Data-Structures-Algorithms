package dsasheets_qsns;

public class n9_missnum {

	public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         
         
        int i,j;
        int sum = 0;
        int sum1 = 0;
        
        int k;
        
        for(i=0; i<=N; i++) {
            
            sum = sum + i;
            
            
        }
        
        for(N=0;N <A.length;N++) {
            sum1 = sum1 + A[N];
            
        } 
        k = sum - sum1;
        return k;
         
    }
	
	
	public static void main(String[] args)
    {
        int A[] = { 1, 3, 7, 5, 6, 2 };
        int N = A.length;
 
        // Function call
        missingNumber(A, N);
    }
}
