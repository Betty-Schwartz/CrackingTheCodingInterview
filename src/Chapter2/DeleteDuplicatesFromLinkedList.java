package chapter2;

import java.util.Hashtable;
import careerCupLibrary.LinkedListNode;
import careerCupLibrary.AssortedMethods;

/*
 * Write code to remove duplicates from an unsorted linked list. 
 */

public class DeleteDuplicatesFromLinkedList {
	
	public static void removeDuplicates(LinkedListNode node){
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		LinkedListNode previous = null;
		while (node != null){
			if (table.containsKey(node.data)) {
				previous.next = node.next;
			} else {
				table.put (node.data, true);
				previous = node;
			}
            node = node.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		removeDuplicates(head);
		System.out.println(head.printForward());

	}

}
