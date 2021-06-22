package com.practice.collections;

public class IsBst {

	Node root;
	
	
/*    5                            
     4  6
        7
         9
        8

*/
	public boolean isBst(){
		Node temp = root;
		if(root==null){
			return true;
		}
		
		while(true){
			if(root==null){
				break;
			}
			if((root.left==null || root.data>root.left.data) && (root.right==null  || root.data<root.right.data)){
				/*if(root.left==null)
					return true;*/
				root = root.left;
			}
			else{
				return false;
			}
			
		}
		root = temp.right;
		while(true){
			if(root==null){
				break;
			}
			
			if((root.left==null || root.data>root.left.data) && (root.right==null  || root.data<root.right.data))
			{
				root = root.right;
				
			}
			else{
				return false;
			}
		}
		
		return true;
	}
}


class Node {

	int data;
	Node left;
	Node right;

	public void node(int input) {
		this.data = input;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
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
