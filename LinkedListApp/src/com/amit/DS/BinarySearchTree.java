package com.amit.DS;

public class BinarySearchTree {
	Node root;
	class Node{
		int data;
		Node left, right;
	}
	
	public Node insert(Node node, int value) {
		
		if(node == null) {
			root = new Node();
			root.data = value;
			return root;
		} 
		
		if(value > node.data){
			root.right = insert(root.right, value);
		} else if(value < node.data) {
			root.left = insert(root.left, value);
		}
		return root;
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
