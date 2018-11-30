package com.amit.DS;

public class LinkedListClass {

	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void insert(int i) {
		Node current = new Node(i);
		if(head == null) {
			head = current;
		} else {
			current.next = head;
			head = current;
		}
	}
	
	public void append(int i) {
		Node current = new Node(i);
		if(head == null) {
			head = current;
		}
		current.next = null;
		
		Node lastNode = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = current;	
	}
	
	public void update(Node node, int i) {
		if(node == head) {
			head.data = i;
		}
		// extra logic.. traverse and update
	}

	public void nthNodeValue(Node current) {
		Node temp = head;
		int value = 0;
		// if current node is head.
		if(current == head) {
			value = current.data;
			System.out.println("nth Node Value " + value);
		} 
		
		while(temp != null) {
			if(temp == current) {
				value = temp.data;
			}
			temp = temp.next;
		}
		System.out.println("nth Node Value " + value);
	}
	
	// need revisit.
	public void delete(int key) {
		Node temp = head, prevNode = null;
		
		// if head contains key to be deleted.
		if(temp != null && temp.data == key) {
			head = temp.next;
		}
		
		// traverse and change temp node till temp.data == key.
		while(temp != null && temp.data != key) {
			prevNode = temp;   
			temp = temp.next;   
		}
		
		prevNode.next = temp.next;
	}
	
	// need revisit.
	public void isCircular() {
		Node fast = head, slow = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				System.out.println("Loop found");
				break;
			} 
		}
		if(fast != slow) {
			System.out.println("No loop found");
		}
	}
	
	// need revisit.
	public void insertAfter(Node prevNode, int i) {
		if(prevNode == null) {
			System.out.println("Previous Node can't be null");
			return;
		} 
		
		Node current = new Node(i);
		current.next = prevNode.next;
		prevNode.next = current;
	}
	
	public void middleElement() {
		Node fast = head, slow = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("Middle Elememnt " + slow.data);
	}
	
	public void clear() {
		while(head != null) {
			head = null;
		}
	}
	
	public void print() {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
}
