package Slightly_Advanced;
import java.util.Scanner;
public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		int fact = 1;
		// Logic
		
		while(num != 0) {
			int digit = num % 10; // 145 % 10 = 5            
			for(int i = 1; i <= digit; i++) {   // digit = 5
				fact = fact * i;   
			}
			
			sum = fact + sum;
			fact = 1;
			num /= 10;
		}
		
		System.out.println("Calculated Strong Number Is: " + sum);
		
		if(original == sum) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not A Strong Number");
		}
		sc.close();
	}

}
