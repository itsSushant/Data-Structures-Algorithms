package dsasheets_qsns;


// Find all pairs with a given sum

public class n4_Two_Sum { 
	
	public pair[] allPairs( long A[], long B[], long N, long M, long X) {
    
    int i,j;
    int n = A.length;
    
    
    ArrayList<pair>arr = new ArrayList<>();
    

    for(i=0;i<n;i++) {
        
        for(j =0;j<n;j++) {
            
            if(A[i] + B[j] == X) {
                
                arr.add(new pair(A[i],B[j]));
            }
        }
    }
    return arr.toArray(new pair[arr.size()]);
    
}
	
	

}

