
//Write a program to calculate percentage of marks enter by student in CBSE board

import java.util.Scanner;


public class CBSE_Percentage_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maths marks out of 100 : ");
		byte maths = sc.nextByte();
		
		System.out.println("Enter Science marks out of 100 : ");
		byte science = sc.nextByte();
		
		System.out.println("Enter English marks out of 100 : ");
		byte english = sc.nextByte();
		
		System.out.println("Enter History marks out of 100 : ");
		byte history = sc.nextByte();
		
		System.out.println("Enter Geometry marks out of 100 : ");
		byte geometry = sc.nextByte();
		
		float percentage = (maths+science+english+history+geometry)/5.0f;
		
		System.out.println("Percentage of Student is : "+percentage+"%");
		
		sc.close();
	}

}
