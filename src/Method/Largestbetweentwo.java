package Method;
import java.util.Scanner;
public class Largestbetweentwo {
	static void checknum(int a, int b) {
		if(a>b) {
			System.out.println("A is Bigger");
		}
		else {
			System.out.println("B is Bigger");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Value: ");
		int a = sc.nextInt();
		System.out.println("Enter B Value: ");
		int b = sc.nextInt();
		checknum(a,b);
		sc.close();
	}

}
