package com.practice.collections;

public class ArrayProblem1 {
	
	int[] a =  { 1,2,3,4,5,6,7,8,9,10};
	int[] b =  {10, 9, 8,7,6,5,4,3,2,1}; 
	
	
	public int getMaxNumber(Numbers position){
		int i = Integer.valueOf(position.getresult())-1;
		int desired = a[i] > b[i]? a[i]: b[i];
		System.out.println("Maximum out of both arrays - "+ desired);
		return desired;
	}
	
	
	public static void main(String[] args) {
		new ArrayProblem1().getMaxNumber(Numbers.Ten);
	}
	
}
