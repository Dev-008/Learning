package Array;
import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Sum Of Array
				int sum=0;
				int[] arr = new int[5];
				System.out.println("Enter The Array Values: ");
				for(int i=0; i < arr.length; i++ ) {
					arr[i]=sc.nextInt();
				}
				//sum = arr[0]+arr[5]
				for(int i=0;i<arr.length;i++) {
					sum+=arr[i];
				}
				System.out.println("The Total Sum is: "+sum);
				sc.close();
	}
}