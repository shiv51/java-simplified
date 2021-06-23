package com.practice.problems;

import java.util.Arrays;

public class MergeIntervals {

	public static void main(String[] args) {
		Meeting[] m =  {new Meeting(6,7), new Meeting(2,4), new Meeting(5,9), new Meeting(1,2)};
		Arrays.sort(m,(m1,m2)-> m1.start-m2.start);
		int i=0;
		int k = 0;
		while(i<m.length-1){
			if(m[k].end>=m[i+1].start){
				m[k]=new Meeting(m[i].start, Math.max(m[i].end, m[i+1].end));
			}
			else{
				k++;
				m[k] = m[i+1];
			}
			i++;
		}
		for(int j=0;j<=k;j++){
			System.out.println(m[j].toString());
		}
	}
}

class Meeting{
	int start;
	int end;
	
	public Meeting(int start, int end){
		this.start= start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Meeting [start=" + start + ", end=" + end + "]";
	}
	
	
}