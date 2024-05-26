package com.app;

//Base class A
class A {
	//Method display in class A
	public void display() {
		System.out.println("Display method in class A");
	}
}

//Subclass B that extends A
class B extends A {
	//Method display in class B
	@Override
	public void display() {
		System.out.println("Display method in class B");
	}
}

//Subclass C that extends B
class C extends B {
	//Method display in class C
	@Override
	public void display() {
		System.out.println("Display method in class C");
	}
}

public class MultipleLevelsOfInheritance {

	public static void main(String[] args) {
		//Create objects of each class
		A a = new A();
		B b = new B();
		C c = new C();
		
		//Call display method on each object
		System.out.println("Calling display() on object of class A: ");
		a.display();
		
		System.out.println("Calling display() on object of class B: ");
		b.display();
		
		System.out.println("Calling display() on object of class C: ");
		c.display();
		
		//Demonstarting Polymoriphsm
		A polyA = new C();
		System.out.println("Calling display() on polymorphic object of type A, instance of C:");
		polyA.display(); //should call display() of class C

	}

}
