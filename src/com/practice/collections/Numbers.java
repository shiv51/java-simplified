package com.practice.collections;

public enum Numbers {

	ONE(1),Ten(10);
	int[] a =  { 1,2,3,4,5,6,7,8,9,10};
	int[] b =  {10, 9, 8,7,6,5,4,3,2,1}; 
	
    private Integer result;
    
	Numbers(Integer result) {
		this.result = result;
	}

	public Integer getresult() {
		return result;
	}
	
	public int getMaxNumber(Numbers position){
		int i = position.getresult()-1;
		int desired = a[i] > b[i]? a[i]: b[i];
		System.out.println("Maximum out of both arrays - "+ desired);
		return desired;
	}
	
	public int getMaxNumber1(){
		int i = this.getresult()-1;
		int desired = a[i] > b[i]? a[i]: b[i];
		System.out.println("Maximum out of both arrays - "+ desired);
		return desired;
	}
	
	public static void main(String[] args) {
		System.out.println(Numbers.ONE.getMaxNumber1());
	}
}
