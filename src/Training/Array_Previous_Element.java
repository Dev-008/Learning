package Training;
import java.util.Scanner;

public class Array_Previous_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// User Input Size Of Array
		System.out.println("Enter The Size Of Array: ");
		int num = sc.nextInt();
		
		// User Input in Array
		int[] arr = new int[num];
		System.out.println("Enter The Array Elements: ");
		for(int i=0; i<num; i++ ) {
			arr[i]=sc.nextInt();
		}
		
		// Logic
		int count=0;
		for(int i=0; i<num-1; i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}
		
		// Output 
		System.out.println("The Total Count Is: " + count);
		sc.close();
		
		// To Check The Array Values
		/*System.out.println("The Array Values Are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	}

}
