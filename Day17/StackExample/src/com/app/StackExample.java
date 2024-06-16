package com.app;

import java.util.Stack;

/*
 * Implement a simple text editor using Stack. Provide methods to add text, delete text and get element from stack operation. 
 */

public class StackExample {

	public static void main(String[] args) {
		//Create object of stack class
		Stack<String> textEditor = new Stack<>();
		
		//addText method to add text from text editor
		addText(textEditor, "Leo is a boy");
		addText(textEditor, "Alicy is a person");
		addText(textEditor, "Ram is a indian boy");
		addText(textEditor, "Apple is a fruit");
		
		//get the element and then delete text from text editor
		while(!textEditor.isEmpty()) {
			System.out.println("Deleted Text is: "+getElement(textEditor));
			//method to delete stack elements
			deleteText(textEditor);
		}
		
	}
	
	//Method to add text into textEditor
	public static void addText(Stack<String> textEditor, String text) {
		textEditor.add(text);
	}
	
	//method to delete text from textEditor
	public static void deleteText(Stack<String> textEditor) {
		textEditor.pop();
	}
	
	//method to get element from textEditor
	public static String getElement(Stack<String> textEditor) {
		return (String) textEditor.peek();
	}

}
