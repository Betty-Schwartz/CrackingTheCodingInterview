package chapter2;

import java.util.LinkedList;

// Basic Singly Linked List

public class BasicSinglyLinkedListImpl  extends LinkedList {
	
	class Node {
		Node next = null;
		int data;
		
		public Node ( int d) {
			data = d;
			
		}
	
	
		void appendToTail ( int d) {
			Node end = new Node(d);
			Node n = this;
			while (n.next != null) {
				n = next;
			}
			n.next = end;
		}
		
		private Node deleteNode(Node head, int d) {
			Node n = head;
			if (n.data == d){
				return head.next; /* moved head */
			}
			while (next != null) {
				if (n.next.data == d) {
					n.next = n.next.next;
					return head; /* head didn't change */
				}
				n = n.next;
			}
			return head;
	    }
		
		 
		public String toString(Node head) {
			Node n = head;
			
            StringBuffer linkedListString = new StringBuffer("LinkedList: ");
         
			 while(n.next  != null) {
			   linkedListString.append(n.data) ;
			   linkedListString.append(" -> ");
			   
			    n = n.next;
			 }	
			 linkedListString.append(n.data) ;
		     return linkedListString.toString();
		  }
    }	

	/**
	 * @param args  
	 */
	public static void main(String[] args) {
		BasicSinglyLinkedListImpl linkedList = new BasicSinglyLinkedListImpl();
		Node n = linkedList.new Node(2);
		Node head = n;
		n.appendToTail(3);
		n.appendToTail(5);
		String linkedListAsString = n.toString(head);
		System.out.println ("Linked List as String:  " + linkedListAsString);
    	n.deleteNode(head, 3);
		linkedListAsString = n.toString(head);
		System.out.println ("Linked List as String:  " + linkedListAsString);

	}

}
