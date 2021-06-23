package com.practice.problems;

import java.util.Arrays;

public class DutchNationalFlag {

	public static void solve(){
		int[]  input = {0,2,0,1,0,2,1,0};
		int low = 0;
		int high = input.length-1;
		int i=0;
		while(i<=high){
			if(input[i] == 0){
				swap(input, low, i);
				low++;
				i++;
			}
			else if(input[i] == 2){
				swap(input, high, i);
				high--;
			}
			else{
				i++;
			}
		}
		System.out.println(Arrays.toString(input));
	}
	
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		solve();
	}
}
