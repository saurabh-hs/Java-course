
//Write a program which tells users to enter name and give text message with user entered name
//eg. "Hello <name>, have a great day"

import java.util.Scanner;

public class GiveNameTextFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter name : ");
		String inputFromUser = sc.nextLine();
		
		System.out.println("Hello "+inputFromUser+", have a great day!!!");
		
		sc.close();

	}

}
