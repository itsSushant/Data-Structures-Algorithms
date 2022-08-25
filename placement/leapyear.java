package placement;

// Time Complexity = O(1)

public class leapyear {
	
	static boolean checkYear(int year) {
		
		if(year%400==0) 
			return true;
		
		if(year%100==0) 
			return false;
		
		if(year%4== 0) 
			return true;
		return false;
		
	}
	
	
	public static void main(String[] args) {
		
		int year=8000;
		System.out.println( checkYear(year)? "Leap" : "Not a Leap");
	}
		
	

}
