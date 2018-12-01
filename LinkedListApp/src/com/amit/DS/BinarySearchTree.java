package com.amit.DS;

class Node{
	int data;
	Node left;
	Node right;
}

public class BinarySearchTree {	
	
	public Node insert(Node node, int value) {
		if(node == null) {
			Node n = new Node();
			n.data = value;
			n.left = null;
			n.right = null;
			return n;
		}
		
		if(value > node.data){
			node.right = insert(node.right, value);
		} else if(value < node.data) {
			node.left = insert(node.left, value);
		}
		
		return node;
	}
	
	public Node delete(Node node, int value) {
		if(node == null) {
			return null;
		}
		
		if(value < node.data) {
			node.left = delete(node.left, value);
		} else if(value > node.data) {
			node.right = delete(node.right, value);
		} else {
			if(node.left == null || node.right == null) {
				Node temp = null;
				temp = node.left == null ? node.right : node.left;
				if(temp == null) {
					return null;
				} else {
					return temp;
				}
			} else {
				Node successor = getSuccessor(node);
				node.data = successor.data;		// copy data
				node.right = delete(node.right, value); //  check this value
				return node;
			}
		}
		
		return node;
	}
	
	private Node getSuccessor(Node node) {
		if(node == null) {
			return null;
		}
		
		Node temp = node.right;
		while(temp.left != null) {
			temp = temp.left;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		Node root = null;
		root = bst.insert(root, 8);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 10);
		root = bst.insert(root, 4);
		root = bst.insert(root, 7);
		root = bst.insert(root, 1);
		root = bst.insert(root, 14);
		root = bst.insert(root, 13);
		
		root = bst.delete(root, 1);
	}
}
