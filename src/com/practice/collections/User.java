package com.practice.collections;

public class User {

	private Integer id;
	private String name;
	
	public Integer getId(){
		return id;
	}
	
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		User user = new UserBuilder().setId(1).build();
		System.out.println(user.getId());
	}
}

class UserBuilder{
	
	private Integer id;
	private String name;
	
	
	public UserBuilder setId(Integer id){
		this.id = id;
		return this;
	}
	
	public UserBuilder setId(String name){
		this.name = name;
		return this;
	}
	
	public User build(){
		return new User(this.id, this.name);
	}
	
}