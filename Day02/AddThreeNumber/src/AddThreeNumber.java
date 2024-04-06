import java.util.Scanner;

public class AddThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter first number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter first number : ");
		int num3 = sc.nextInt();
		
		System.out.println("Total = "+(num1+num2+num3));
		
		sc.close();
	}

}
