package com.app;

//Base class Engine
class Engine {
	//Method to start the engine
	public void start() {
		System.out.println("Engine started.");
	}
}

//class Car that contains an Engine object
class Car extends Engine {
	//Engine object as a field in Car class
	private Engine engine;
	
	//constructor to initialize the Engine object
	public Car() {
		engine = new Engine();
	}
	
	//Method to drive the car, which start the engine
	public void drive() {
		engine.start();
		System.out.println("Car is driving.");
	}
}

//Main class to demonstrate composition
public class CompositionAndInheritance {

	public static void main(String[] args) {
		//Create object of Car class
		Car car = new Car();
		
		//Call the drive method on the Car object
		car.drive();
	}

}
