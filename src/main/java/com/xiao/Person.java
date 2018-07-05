package com.xiao;


public class Person {

	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("left conflict...");
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
