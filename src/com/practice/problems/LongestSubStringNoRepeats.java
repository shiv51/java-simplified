package com.practice.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringNoRepeats {

	public static void main(String[] args) {
		lengthOfLongestSubstring("abccde");
	}

	private static int lengthOfLongestSubstring(String s) {
		char[] c  = s.toCharArray();
		int low = 0;
		int high = 0;
		int output = Integer.MIN_VALUE;
		Map<Character, Integer> map = new HashMap<>();
		if(s.length()<=1)
			return s.length();
		while(low<=high && high<c.length){
			if(map.containsKey(c[high])){
				while(map.containsKey(c[high])){
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
		return output;
	}
}
