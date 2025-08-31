package com.wipro.oop;

public abstract class Animal {
	String name;
	int age;
	public abstract void lifeSpam(String name,int age);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
