package Array;
import java.util.Scanner;
public class CalculatorProgram {
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	static int sub(int num1, int num2) {
		return num1 - num2;
	}
	static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	static float div(float num1, float num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();
		
		// Operations Output
		System.out.println();
		System.out.println("Addition Of "+num1+" And " +num2+ " Is: " + add(num1,num2));
		System.out.println("Subraction Of "+num1+" And "+num2+" Is: " + sub(num1,num2));
		System.out.println("Multiplication Of "+num1+" And "+num2+" Is: " + multiply(num1,num2));
		System.out.println("Division Of "+num1+" And "+num2+ " Is: " + div(num1,num2));
		sc.close();
	}

}
