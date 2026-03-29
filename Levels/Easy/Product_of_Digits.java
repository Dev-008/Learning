package Easy;
import java.util.Scanner;
public class Product_of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int product = 1;
		// logic
		while(num != 0){
			int digit = 1;
			digit = num % 10;
			product = product * digit;
			num = num / 10;
		}
		System.out.println("The Product Of The Number is: "+product);
		sc.close();
	}

}
