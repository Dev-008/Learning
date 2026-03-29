package Intermediate;
import java.util.Scanner;
public class Largest_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int largest = 0;
		
		// Logic
		while(num != 0) {
			int digit = num % 10;
			if(digit > largest) {
				largest = digit;
			}
			num /= 10;
		}
		System.out.println(largest);
		sc.close();
	}

}
