package LinkedList;


import java.util.*;

public class tut1 {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		
		
		l1.add("A");
		
		l1.add("B");
		l1.addLast("C");
		
		l1.addFirst("S");
		l1.add(2,"E");
		
		System.out.println(l1);
		
		l1.remove("B");
        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();
 
        System.out.println(l1);
        
        
        /* Add(int index, Object): 
         This method is used to add an element at a specific index in 
         the LinkedList.
        */
        
        l1.add("Geeks");
        l1.add("Ge5eks");
        l1.add(1, "For");
 
        System.out.println(l1);
        
        
        
        
        
        /* To modify elements.
         */
	
        l1.set(1,"HHHH");
        l1.remove("A");
        
        System.out.println("Updated is: " + l1);
	
	
	
	
	}
	
	
	
	
	

}
