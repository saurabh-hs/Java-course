package com.app;

/*
 * Write a Java program to create a class called Animal with a method called makeSound(). 
 * Create a subclass called Cat that overrides the makeSound() method to bark.
 */

public class MainClass {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.makeSound();
		cat.makeSound();

	}

}
