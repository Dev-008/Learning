package Intermediate;
import java.util.Scanner;
public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int original = num;
		int pali = 0;
		
		// Logic
		while(num != 0) {
		int digit = num % 10;
		pali = (pali * 10) + digit;
		num = num / 10;
		}
		if(pali == original) {
			System.out.println("The Given Number Is Palindrome: " + pali);
		}else {
			System.out.println("The Given Number Is Not A Plaindrome: " + pali);
		}
		sc.close();
	}

}
