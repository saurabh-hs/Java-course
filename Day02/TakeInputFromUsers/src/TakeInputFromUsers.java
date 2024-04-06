
import java.util.Scanner;

public class TakeInputFromUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Take inputs from user");
		
//		System.out.println("Enter first number : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Enter second number : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("Addition of two numbers is : "+(num1+num2));
		
//		System.out.println("Enter first float number : ");
//		float f1 = sc.nextFloat();
//		
//		System.out.println("Enter second float number : ");
//		float f2 = sc.nextFloat();
//		
//		System.out.println("Addition of numbers : "+(f1+f2));
		
//		System.out.println("Enter first double number : ");
//		double d1 = sc.nextDouble();
//		
//		System.out.println("Enter second double number : ");
//		double d2 = sc.nextDouble();
//		
//		System.out.println("Sum : "+(d1+d2));
		
		System.out.println("Enter first string : ");
		String c1 = sc.next();
		
		System.out.println("Enter second string : ");
		String c2 = sc.next();
		
		System.out.println(c1+" "+c2);
		
		sc.close();
	}

}
