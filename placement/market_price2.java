package placement;

//tcs nqt 2021

public class market_price2 {
	
	
	static int arr[] = {1,3,4,5,45} ;
	
	static int multiply(int a[] , int n) 
	{
		if(n==0) 
			return(a[n]);
		
		else 
			return(a[n] *multiply(a,n-1)); 
		
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(multiply(arr,arr.length -1 ));
	}

}
