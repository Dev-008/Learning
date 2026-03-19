package Method;
import java.util.Scanner;
public class Evenorodd {
	static void logic(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number/Value: ");
		int num = sc.nextInt();
		 logic(num);
		 sc.close();
	}

}
