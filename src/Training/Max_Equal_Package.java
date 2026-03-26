package Training;
import java.util.Scanner;
public class Max_Equal_Package {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Value: ");
		int A = sc.nextInt();
		System.out.println("Enter B Value: ");
		int B = sc.nextInt();
		
		while(B != 0) {
			int Temp = B;
			B = A % B;
			A = Temp;
		}
		System.out.println("The Maximum Equal Package is: " + A);
		sc.close();
		
	}

}
