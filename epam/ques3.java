package epam;

public class ques3 {
	
	public static int checkNest(char[] arr) {
	    int counter = 0,index = 0;
	    for(int i=0; i<arr.length; i++) {
	        // Only one incorrect parentheses. 
	        index = i;
	        if(arr[i] == '(')
	            counter++;
	        else if(arr[i] == ')')
	            counter--;
	    }
	    if(counter == 0)
	        index = -1;
	    return index;


	}
	
}
