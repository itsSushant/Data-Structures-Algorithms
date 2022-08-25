package javaproj;


//This is a game in which user has to guess the stored in here by the programmer 

import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int myNumber = (int)(Math.random()*100);
		int userNumber = 0;
		
		// Here used loop to see if its right or wrong and on that loop goes on till guess
		// And at entering exit no. i.e = -1 : The real no. displays . 
		
		do {                                           
			
			System.out.println("Guess my number");
			userNumber = sc.nextInt();
			
			if(userNumber == myNumber) {
				
				System.out.println("Gotch You") ;
				break;
			}
			
			else if(userNumber > myNumber) {
				System.out.println("your number big");
			}
			
			else if(userNumber < myNumber) {
				System.out.println("your number small");
			}
		} while( userNumber >= 0);
		
		System.out.print("Number was ____");
		System.out.println(myNumber);
		
	}
}

	