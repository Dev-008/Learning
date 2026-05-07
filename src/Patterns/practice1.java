package Patterns;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size: ");
		int size = sc.nextInt();
		
		//Square
		/*for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.print(" #");
			}
			System.out.println();
		}*/
		
		// Triangle
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		sc.close();
	}

}
