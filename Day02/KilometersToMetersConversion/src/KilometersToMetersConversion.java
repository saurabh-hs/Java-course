
//Write a program to convert kilometer to meter

import java.util.Scanner;

public class KilometersToMetersConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter value in kilometers : ");
		float kilometer = sc.nextFloat();
		
		float meter = kilometer * 1000;
		
		System.out.println("The value of "+kilometer+" kg in meter is : "+meter);
		
		sc.close();
	}

}
