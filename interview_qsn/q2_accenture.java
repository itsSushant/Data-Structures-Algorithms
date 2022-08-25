package interview_qsn;

// Accenture coding round question 2

// DICE SUM: You are given 2 unbiased dice containing 6 faces each. And
// also you are given with a “sum” which should be obtained by throwing
// those two dice at same time. You have to print the number of
// possibilities where the sum of both dice is equal to output sum. If
// there are no possibilities return zero.


import java.util.*;
import java.util.Scanner;

public class q2_accenture {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int sum = sc.nextInt();
		int count = 0;
		while(i<4) {
			
		}
		for(int i=1; i<=6;i++) 
		{
			for(int j = 0; j<=6 ;j++) {
				if(i+j==sum)
					count++;
				
			}
				
				
		}
		System.out.println(count);
		
		
		
				
	}
}
