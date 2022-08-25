package code1;

import java.util.Scanner;

public class arr_loop {
	public static void main(String args[]) {
		
		
		Scanner sc =  new Scanner(System.in);
		int size =  sc.nextInt();
		
		int[] age = new int[size];
		
		for(int i=0; i<size; i++) {
			age[i] = sc.nextInt();
		}
		
		for(int i=0; i < age.length; i++) {
		System.out.println(age[i]);
		
		}
	 
	}
 
}
