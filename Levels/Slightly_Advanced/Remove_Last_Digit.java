package Slightly_Advanced;
import java.util.Scanner;
public class Remove_Last_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit: ");
		int digit = sc.nextInt();
		
		if(digit>9) {
			int last = digit/10;
			System.out.println(last);
		}
		else {
			System.out.println("Not Valid Number");
		}

	}

}
