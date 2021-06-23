package com.practice.problems;

import java.util.ArrayList;
import java.util.List;

public class InsectionMeetings {

	public static void main(String[] args) {
		// arr1=[[1, 3], [5, 6], [7, 9]], arr2=[[2, 3], [5, 7]]
		Meeting1[] m1 ={new Meeting1(1, 3), new Meeting1(5, 6), new Meeting1(7, 9)};
		Meeting1[] m2 ={new Meeting1(2, 3), new Meeting1(5,7)};
		List<Meeting1> l = new ArrayList<>();
		int x = 0;
		int y = 0;
		while(x<=m1.length && y<m2.length){
			if((m2[y].start >=m1[x].start && m2[y].start <= m1[x].end  )  || (m1[x].start>=m2[y].start && m1[x].end<=m2[y].start)){
				l.add(new Meeting1(Math.min(m1[x].start, m2[y].start), Math.min(m1[x].end,m2[y].end)));
			}
			if(m1[x].end<=m2[y].end){
				x++;
			}
			else{
				y++;
			}
		}
		System.out.println(l);
	}
}
class Meeting1{
	int start;
	int end;
	
	public Meeting1(int start, int end){
		this.start= start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Meeting [start=" + start + ", end=" + end + "]";
	}
	
	
}