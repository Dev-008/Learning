package Intermediate;
import java.util.Scanner;
public class Sum_of_Even_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int sum = 0;
		//Logic
		while(num != 0) {
			int digit = num % 10;
			if(digit%2==0) {
				sum = sum + digit;
			}
			num /= 10;
		}
		System.out.println("The Sum Of The Even Digit is: " + sum);
		sc.close();
	}

}
