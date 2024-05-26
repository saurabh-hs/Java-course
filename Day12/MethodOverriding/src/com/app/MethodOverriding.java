package com.app;

class Vehicle {
	//method to be overridden
	public void move() {
		System.out.println("The vehicle is moving.");
	}
}

class Car extends Vehicle {
	//Overriding the move method
	@Override
	public void move() {
		System.out.println("The car is driving on the road.");
	}
}

class Bicycle extends Vehicle {
	//Overriding the move method
	@Override
	public void move() {
		System.out.println("The bicycle is being pedaled on the path.");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//create instance of vehicle, car and Bicycle
		Vehicle myVehicle = new Vehicle();
		Vehicle myCar = new Car();
		Vehicle myBicyle = new Bicycle();
		
		//call the move method on each instance
		myVehicle.move(); //Output: The vehicle is moving.
		myCar.move();	//Output: The car is driving on the road.
		myBicyle.move();//Output: The bicycle is being pedaled on the path.

	}

}
