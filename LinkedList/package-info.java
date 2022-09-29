package LinkedList;

import java.util.*;

class Linkedlist  {
	
	
	Node head;
	
	
	static class Node {
		
		
		int value;
		
		Node next;
		
		Node(int d) {
			
			value = d;
			next  = null;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList();
		
		Node second = new Node(2);
		
		Node third = new Node(3);
		
		
		linkedlist.head.next = second;
		second.next = third;
		
		
		
		
		Node pointer = linkedlist.head;
		
		System.out.println("LinkedList : "); 
		
		while(pointer != null ) {
			
			System.out.println(pointer.value + " ");
			
			pointer = pointer.next;
		}
		
		
	}
	
	
	
	//find the middle element 
	
	
	Node ptr1 = linkedlist.head;
	Node ptr2 = linkedlist.head;
	
	while(ptr.next != null) {
		
		
		ptr1 = ptr1.next ;
		
		if(ptr1.next != null) {
			
			ptr1 = ptr1.next;
			
			ptr2 = ptr2.next;
		}
		
	}
		
		
		
		
	System.out.println("\nMiddleElement : " + ptr2.value);
		 
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}