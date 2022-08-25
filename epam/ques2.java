package epam;

// “Uniqueness of Integer Array in Java” // 


public class ques2 {
	
	public static void main(String[] args) {
		
		int [] arr = {1,1,1,2,2,2,3,3,3,4,47,588,577,446,7,8,};

		for (int i= 0; i < arr.length; i++){
		int count_int = 0;  // to find out how many time value is appeared in the arry
		for (int j = 0; j < arr.length; j++){
		     if(arr[j] == arr[i] ) {    
		    // if(arr[i] == 1 ) { once boyleydi ikinci for gelince soldaki oldu
		      count_int++; // arraydeki harfleri tek tek saymak icin
		     }
		 }
		
		 if(count_int == 1 ){
			 
			 System.out.print(arr[i]+" ");
		 }
		
	}
	
	}
		

}
