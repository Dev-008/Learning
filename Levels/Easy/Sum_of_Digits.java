package Easy;
import java.util.Scanner;
public class Sum_of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Digit: ");
		int num = sc.nextInt();
		int dum = num;
		int sum = 0;
		while(num != 0) {
			int digit = 0;
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("The Sum Of The Number "+dum+" is: " + sum);
		sc.close();
	}

}
