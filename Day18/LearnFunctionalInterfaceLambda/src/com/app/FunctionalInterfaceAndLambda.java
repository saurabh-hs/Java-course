package com.app;

public class FunctionalInterfaceAndLambda {

	public static void main(String[] args) {
//		SuperInterface obj = () -> {
//			System.out.println("Interface method is printed!!");
//		};
//		
//		obj.interfaceMethod();
		
//		Walkable walkable = (int steps) -> {
//			System.out.println("Walked "+steps+" Steps");
//			return steps;
//		};
//		
//		walkable.walks(50);
		
//		Walkable walkable = (steps) -> (2 * steps);
//		
//		System.out.println("Walked "+walkable.walks(25)+" Steps");
		
//		AddNumbers addNumbers = (x,y) -> (x + y);
//		
//		System.out.println("Addition of number: "+addNumbers.add(13.5, 54.8));
		
		Dog dog = () -> {
			System.out.println("Dog is eating");
		};
		
		dog.eat();
		
		
	}

}

interface Walkable {
	int walks(int steps);
}

interface SuperInterface {
	void interfaceMethod();
}

@FunctionalInterface
interface AddNumbers {
	double add(double x, double y);
}

interface Dog {
	void eat();
}












