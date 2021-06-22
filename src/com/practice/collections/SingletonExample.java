package com.practice.collections;

public class SingletonExample implements Cloneable{

	private static SingletonExample single = null;
	
	public static SingletonExample getInstance(){
		if(single == null){
			single = new SingletonExample(); 
			return single;
		}
		return single;
	}
	
	
	
}
