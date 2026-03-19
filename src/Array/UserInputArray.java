package Array;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		// User Input in Array
		int[] arr = new int[5];
		System.out.println("Enter The Array Values: ");
		for(int i=0; i < arr.length; i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array Values Are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}