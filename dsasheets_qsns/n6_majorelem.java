package dsasheets_qsns;



//Majority Element - GFG


public class n6_majorelem {
	
	
	// Sorting array 
    Arrays.sort( a);
    
    
    // taking our mid value
    int mid  =  a[size/2];
    
    int count = 0;
    
    //traversing
    for(int i = 0; i<size;i++) {
        
        if(a[i] == mid) {  // conditions
            count++;
        }
    }
    
    if(count>size/2) { // taking thr count form condn 1 & then our problem condn here .
        return mid;    // then returning mid-value/ .
    }
    
    
    return -1;

}


//Sort an array of 0s, 1s and 2s
