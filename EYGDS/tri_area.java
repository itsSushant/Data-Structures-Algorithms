package EYGDS;

public class tri_area {
	
	public static void main(String[] args ) {
		
		int b1 = 5 ;
		int b2 = 10;
		int h1 =10;
		int h2 = 50;
		
		System.out.println(largestArea(b1,b2,h1,h2));
	}
	
	
	static int largestArea(int b1, int b2, int h1, int h2) {
		int res;
		int i,j;
		int a1;
		
		int a2;
		
		a1 = (b1*h1)/2;
		a2 = (b2*h2)/2;
		
		
		if(a1>a2) {
			
			res= a1;
		}
		else {
			res = a2;
		}
		
		return res;
	}
	
	
	
	
	
	

}

