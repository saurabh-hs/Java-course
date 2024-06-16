package com.app;

public class StringBasic {

	public static void main(String[] args) {
		// There are two types to create String
//		String name = "Saurabh";
		//String newName = new String("Saurabh");
		
//		String name1 = "Saurabh";
		
//		if(name == name1) {
//			System.out.println("Both string are same");
//		}else {
//			System.out.println("Not same");
//		}
//		
//		if(name == newName) {
//			System.out.println("Same");
//		}else {
//			System.out.println("Not same");
//		}
		
//		if(name.equals(newName)) {
//			System.out.println("Both String are same");
//		}else {
//			System.out.println("String are not same");
//		}
		
		String pwd = "S@ur AB h31";
		
		System.out.println(pwd.toUpperCase());
		
		System.out.println(pwd.toLowerCase());
		
		System.out.println(pwd.trim());
		
		String words[] = pwd.split("@");
		
		for(String word : words) {
			System.out.println(word);
		}
		
		String newString = pwd.substring(4, 9);
		System.out.println(newString);
		
		char[] letters = pwd.toCharArray();
		
		for(char letter : letters) {
			System.out.println(letter);
		}

	}

}
