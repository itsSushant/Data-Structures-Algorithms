package interview_qsn;

//Accenture Coding Question 1
 
// In this you have to find second highest number in a given array 


public class q1_accenture {
	
	public static void main(String[] args) {
		
		int[] arr = {666,1,449,2444,116,8555};
		
		int num1;
		int num2;
		
		if(arr[0] > arr[1]) {
			num1 = arr[0];
			num2 = arr[1];
		}
		else {
			num1 = arr[1];
			num2 = arr[0];
			
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]> num1) {
				int temp = num1;
				num2 = num1;
				num1 = arr[i];
			}
			else if(arr[i]> num2) {
				num2 =  arr[i];
			}
		}
		System.out.println(num2);
		 
		
		
		
		
		
	}
}