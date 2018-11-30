package com.amit.DS;

public class BinarySearchTree {

	class Node{
		int data;
		Node left, right;
	}
	
	public Node insert(Node node, int value) {
		Node n = null;
		if(node == null) {
			n = new Node();
			n.data = value;
			n.left = null;
			n.right = null;
			return n;
		}
		
		if(value > node.data){
			n.right = insert(n.right, value);
		} else if(value < node.data) {
			n.left = insert(n.left, value);
		}
		
		return n;
	}
	
	public Node delete(Node node, int value) {
		if(node == null) {
			return null;
		}
		
		if(value < node.data) {
			node.left = delete(node.left, value);
		} else {
			node.right = delete(node.right, value);
		}
		return null;
	}
	
}
