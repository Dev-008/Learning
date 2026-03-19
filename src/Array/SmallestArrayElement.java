package Array;
import java.util.Scanner;
public class SmallestArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Smallest Element
	       int[] arr = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for(int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int min = arr[0];
	        for(int i = 1; i < arr.length; i++) {
	            if(arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Smallest element = " + min);
	        sc.close();
	}

}
