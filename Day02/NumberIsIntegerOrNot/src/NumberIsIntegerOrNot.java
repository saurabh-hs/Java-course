
//Write a program to detect whether a number entered by the user is integer or not

import java.util.Scanner;

public class NumberIsIntegerOrNot {
	
	public static boolean isNumber(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) < 48 || str.charAt(i) > 57)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a input : ");
		String str = sc.next();
		
		if(isNumber(str))
			System.out.println("You enter Integer input");
		else
			System.out.println("You enter non Integer input");
		
		sc.close();

	}

}
