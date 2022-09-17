package dsasheets_qsns;

public class n10_ele_onetime {

	public static int search(int A[], int N)
    {
        
        
        int i = 0;
        int ans = 0;
        
        for( i= 0; i<N; i++){
            
            ans = ans^A[i];
        }
        
        return ans;
        
        
        
        
    }
	
	public static void main(String[] args) {
		
		int A[] = {1, 1, 2, 5, 5};
		int N = 5;
	
		
		System.out.println("The element is : " + search(A,N));
	}
	
	
}
