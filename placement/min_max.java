package placement;

public class min_max {

	static class Pair {
		
		int min ;
		int max ;
		
	}
	
	
	static Pair getMinMax(int arr[] , int n) {
		Pair minmax = new Pair();
		
		int i;
		
		if(n==1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;
		}
			
			
			
		if(arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
			return minmax;
			
		} else {
			minmax.max = arr[1];
			minmax.min = arr[0] ;
		}
		
		
		for(i=2 ;i<n;i++) {
			
			if(arr[i] > minmax.max) {
				
				minmax.max = arr[i];
				
			} else if (arr[i] < minmax.min) {
				
				
				minmax.min = arr[i];
			}
		}
		
		
		
		return minmax;
			
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {555,555,4,4444,1,2};
		int arr_size = 5;
		
		Pair minmax = getMinMax(arr, arr_size) ;
		
		
		
		System.out.println(minmax.min);
		System.out.println(minmax.max);
		
		System.out.println(minmax.min + minmax.max);
	}
	
	
	
	
	
}
