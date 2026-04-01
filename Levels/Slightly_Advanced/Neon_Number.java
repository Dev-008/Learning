package Slightly_Advanced;
import java.util.Scanner;
public class Neon_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int original = num;
		int digit = 0;
		int sum = 0;
		
		// Logic
		int square = num * num ;
		System.out.println(square);
		while(square != 0) {
			digit = square%10;
			sum += digit;
			square /= 10;
		}
		if(sum == original) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not A Neon Number");
		}
		sc.close();
	}

}
