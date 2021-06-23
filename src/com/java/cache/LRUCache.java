package com.java.cache;

import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {

	private int size;
	private HashSet<Integer> set;
	private LinkedList<Integer> queue;
	
	public LRUCache(int size){
		set = new HashSet<>();
		queue = new LinkedList<>();
		this.size = size;
	}
	public void add(int num){
		
		if(set.contains(num)){
			if(queue.size() == size){
				queue.remove(num);
			}
		}
		else{
			set.add(num);
			if(queue.size() == size){
				queue.poll();
			}
		}
		queue.offer(num);
	
	}
	
	public void display(){
		for(Integer x:queue){
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.add(1);
		cache.add(2);
		cache.display();
		cache.add(3);
		cache.add(1);
		cache.display();
		
	}
	
}
