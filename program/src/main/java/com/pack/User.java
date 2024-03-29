package com.pack;

public class User {
	private int id;
	private String name;
	private int age;
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name +"]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
