package Array;
import java.util.Scanner;
public class ReverseNumber {
	static int reverse(int num) {
		int dum = 0;
		while(num!=0) {
			int dig = num % 10;
			dum = dum * 10 + dig;
			num =num/10;
		}
		return dum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int reversed = reverse(num);
		System.out.println("Reversed Number is: "+reversed);
		sc.close();
	}

}

/*int num1 = num/10;
int num2 = num%10;
System.out.println(num1);
System.out.println(num2);*/
