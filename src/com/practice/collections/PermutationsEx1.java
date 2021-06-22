package com.practice.collections;

public class PermutationsEx1 {

	public static void perm(String x, String y){
		
		if(x.length()==0){
			System.out.println(y);
			return;
			
		}
		
		for(int i=0;i<x.length();i++){
			char ch  = x.charAt(i);
			String rest = x.substring(0,i)+x.substring(i+1);
			perm(rest, y+ch);
		}
		
	}
	
	public static void main(String[] args) {
		String input = "abc";
		PermutationsEx1.perm(input, "");
	}
}
