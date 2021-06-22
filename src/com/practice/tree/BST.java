package com.practice.tree;

/**
 * 
 * Inorder trversal of a tree is a ascending order
 * @author shivarajm
 *
 */
public class BST {

	Node head;
	
	public void addElement(Node root, Integer input){
		Node temp = null;
		if(root==null || root.getValue()==null){
			root = new Node(input);
			if(head==null)
				head = root;
			return;
		}
		else if(input<root.getValue()){
			temp = root.getLeft(); 
			if(temp==null){
				root.setLeft(new Node(input));
				return;
			}
		}
		else if(input>root.getValue()){
			temp = root.getRight(); 
			if(temp==null){
				root.setRight(new Node(input));
				return;
			}
		}
		addElement(temp,input);
	}

	public void display(Node root){
		if(root == null){
			return; 
		}
		display(root.getLeft());
		System.out.println(root.getValue());
		display(root.getRight());
	}
	
	public boolean isBst(Node root){
		
		if(root==null)
			return true;
		if((root.getLeft()==null || root.getValue()<root.getLeft().getValue())
				&& (root.getRight()==null || root.getValue()<root.getRight().getValue())
				&& isBst(root.getLeft()) 
				&& isBst(root.getRight())){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		BST bst = new BST();
		bst.addElement(bst.head, 10);
		bst.addElement(bst.head, 6);
		bst.addElement(bst.head, 4);
		bst.addElement(bst.head, 14);
		bst.addElement(bst.head, 11);
		bst.display(bst.head);
		System.out.println("ISBST " + bst.isBst(bst.head));
	}
}

class Node{
	
	Integer value;
	Node left;
	Node right;
	
	public Node(Integer i){
		value=i;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}

