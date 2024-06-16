package com.app;

public class Box<T> {
	//Private attribute to store the object of type T
	private T object;
	
	//Method to set the object
	public void set(T object) {
		this.object = object;
	}
	
	//Method to get the object
	public T get() {
		return object;
	}

	public static void main(String[] args) {
		//Create a Box to store an Integer
		Box<Integer> intergerBox = new Box<>();
		intergerBox.set(231);
		System.out.println("Integer values: "+intergerBox.get());
		
		//Create a Box to Store an String
		Box<String> stringBox = new Box<>();
		stringBox.set("Hello Generics");
		System.out.println("String values: "+stringBox.get());
		
		//Create a Box to Store an double
		Box<Double> doubleBox = new Box<>();
		doubleBox.set(12.45);
		System.out.println("Double values: "+doubleBox.get());
	}

}
