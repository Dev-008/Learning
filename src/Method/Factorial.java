package Method;
import java.util.Scanner;
public class Factorial {
	static void findfactorial(int num) {
		int factorial=1;
		for(int i=1; i<=num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial Of The "+ num +" is: "+ factorial);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num = sc.nextInt();
		findfactorial(num);
		sc.close();
	}

}
