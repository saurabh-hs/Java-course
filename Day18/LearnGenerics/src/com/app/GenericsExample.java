package com.app;

public class GenericsExample {

	public static void main(String[] args) {
		GenericClass<String,Integer> c1 = new GenericClass<>("1",234);
		System.out.println("ID: "+c1.getId());
		System.out.println("Number: "+c1.getNumber());
		
		GenericClass<Integer,String> c2 = new GenericClass<>(2,"12");
		System.out.println("ID: "+c2.getId());
		System.out.println("Number: "+c2.getNumber());
		
		c1.printData(13.2);
		c2.printData(12);
	}

}

class GenericClass<E,T> {
	//Generic field of GenericClass 
	E id;
	T number;
	
	//Constructor of GenericClass
	public GenericClass(E id, T number) {
		this.id = id;
		this.number = number;
	}
	
	public E getId() {
		return id;
	}
	
	public T getNumber() {
		return number;
	}
	
	//Generic method
	public <E> void printData(E data) {
		System.out.println(data);
	}
}
