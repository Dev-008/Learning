package Method;
import java.util.Scanner;
public class Sumofarray {
	static int findsum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter The Array Values: ");
		for(int i=0; i < arr.length; i++ ) {
			arr[i]=sc.nextInt();
		}
		int result = findsum(arr);
		System.out.println("The Sum Of The Array Is: "+ result);
		sc.close();
	}
}