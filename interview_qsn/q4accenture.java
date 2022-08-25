package interview_qsn;

public class q4accenture {

	static int countDistinct(int arr[], int n)
	{
	    int res = 1;
	 
	    // Pick all elements one by one
	    for (int i = 1; i < n; i++)
	    {
	        int j = 0;
	        for (j = 0; j < i; j++)
	            if (arr[i] == arr[j])
	                break;
	 
	        // If not printed earlier,
	        // then print it
	        if (i == j)
	            res++;
	    }
	    return res;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
	    int n = arr.length;
	    System.out.println(countDistinct(arr, n));
	}
	




}
