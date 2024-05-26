package com.app;

//Base class with a static method display()
class Base {
	public static void display() {
		System.out.println("Display method in Base class");
	}
}

//Derived class that hides the display() method of Base class
class Derived extends Base {
	public static void display() {
		System.out.println("Display method in Derived class");
	}
}

//Main class to Demonstrate method hiding
public class InheritanceAndStatic {

	public static void main(String[] args) {
		// Call display() using Base class reference
		Base baseRef = new Base();
		baseRef.display(); //Output: Display method in Base class
		
		//Call display() using Derived class reference
		Derived derivedRef =new Derived();
		derivedRef.display(); //Output: Display method in Derived class
		
		//Call display() using Base class reference pointing to Derived object
		Base baseDerivedRef = new Derived();
		baseDerivedRef.display(); //Output: Display method in Base class

	}

}
