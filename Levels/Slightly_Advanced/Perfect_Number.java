package Slightly_Advanced;
import java.util.Scanner;
public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		
		// Logic
		for(int i = 1; i < num; i++) {
			if(num % i==0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("The Sum Of Factor is: " + sum);
		if(sum == original) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not A perfect Number");
		}
		sc.close();
	}

}
