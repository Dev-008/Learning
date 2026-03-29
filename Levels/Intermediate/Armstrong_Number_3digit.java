package Intermediate;
import java.util.Scanner;
public class Armstrong_Number_3digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		
		//Logic
		while(num != 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num /= 10;
		}
		if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
		sc.close();
	}

}
