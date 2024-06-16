package com.app;

public class MainClass {

	public static void main(String[] args) {
//		Cat c1 = new Cat();
//		c1.name = "Leo";
//		
//		c1.eat();
//		c1.walk();

	}

}

abstract class Animal {
	public abstract void walk();
	
	public abstract void eat();
}

class Cat extends Animal {
	
	//field of Cat class
	String name;

	@Override
	public void walk() {
		System.out.println(name+" is walking");	
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating");
	}
	
}