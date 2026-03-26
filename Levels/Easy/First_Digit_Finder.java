package Easy;
import java.util.Scanner;

public class First_Digit_Finder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		while(num > 10) {
			num = num / 10;
		}
		System.out.println("First Digit is: " + num);
		sc.close();

	}

}
