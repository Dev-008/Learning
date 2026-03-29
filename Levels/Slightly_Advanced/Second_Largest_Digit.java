package Slightly_Advanced;
import java.util.Scanner;
public class Second_Largest_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers: ");
		int num = sc.nextInt();
		
		int largest = 0, secondlargest = 0;
		
		// Logic
		while(num != 0) {
			int digit = num % 10;
			
			if(digit > largest) {
				secondlargest = largest;
				largest = digit;
			}else if (digit > secondlargest && digit != largest) {
                secondlargest = digit;
			}
			num = num / 10;
		}
		System.out.println("Largest Digit is: " + largest);
		System.out.println(
	            secondlargest == -1 
	            ? "No second largest digit" 
	            : "Second Largest Digit: " + secondlargest
	        );
		sc.close();
	}

}
