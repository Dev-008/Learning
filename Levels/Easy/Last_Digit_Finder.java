package Easy;
import java.util.Scanner;
public class Last_Digit_Finder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Digit: ");
		int num = sc.nextInt();
		num = num % 10;
		System.out.println(num);
		sc.close();
	}

}
