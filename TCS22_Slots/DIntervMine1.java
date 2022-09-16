package TCS22_Slots;



// find the second largest element in an array - They asked me this one 1st.

 
public class DIntervMine1 {
	
	static boolean checkPalindrome(String str) {
		
		int len =  str.length();
		
		for(int i = 0; i<len/2 ; i++) {
			
			if(str.charAt(i) != str.charAt(len-1 - 1))  {
				return false;
				
			}
			
			
		}
		return true;

	}
	
	public static void main(String[] args)
	{
		
		// Taking number as string
		String st = "121";
		
		if (checkPalindrome(st) == true)
			System.out.print("Yes");
		else {
			System.out.print("No");
			
		}
			
	}
	
	

	
	
	
	

}
