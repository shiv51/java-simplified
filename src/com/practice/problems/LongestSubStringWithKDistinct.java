package com.practice.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinct {

	public static void main(String[] args) {
		String s = "aaarccaaaai";
		char[] c  = s.toCharArray();
		int low = 0;
		int high = 0;
		int k = 2;
		int output = Integer.MIN_VALUE;
		Map<Character, Integer> map = new HashMap<>();
		if(k==0){
			System.out.println("0");
		}
		while(low<=high && high<c.length){
			if(!map.containsKey(c[high]) && map.keySet().size()>=k){
				while(map.size()>=k){
					map.put(c[low], map.getOrDefault(c[low], 0)-1);
					if(map.get(c[low])==0){
						map.remove(c[low]);
					}
					low++;
				}
				
			}
			map.put(c[high], map.getOrDefault(c[high], 0)+1);
			output = Math.max(output, high-low+1);
			high++;
		}
		System.out.println(output);
	}
}
