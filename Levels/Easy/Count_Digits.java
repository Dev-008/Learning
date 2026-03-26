package Easy;
import java.util.Scanner;
public class Count_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Digit: ");
		int num = sc.nextInt();
		int count = 0;
		while(num != 0) {
			count ++;
			num = num / 10;
		}
		System.out.println("The Total Count Of the digit is: " + count);
		sc.close(); 
	}

}
