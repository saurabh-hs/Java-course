package com.app;

//Define the Printable interface
interface Printable {
	//Abstract method print
	void print();
}

//Class Book that implements Printable
class Book implements Printable {
	//Fields for Book class
	private String title;
	private String author;
	
	//Constructor for Book class
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//Implementation of print method
	@Override
	public void print() {
		System.out.println("Book Title: "+title);
		System.out.println("Author: "+author);
	}
}

//Main class to demonstrate interface inheritance and polymorphism
public class InterfaceInheritanceAndPolymorphism {

	public static void main(String[] args) {
		//Create a object of Book class
		Book book = new Book("Java","John");
		
		//Demonstrate polymorphism
		Printable printable = book;
		
		//Call the print method
		printable.print();
	}

}
