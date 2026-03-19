package Array;
import java.util.Scanner;
public class RevArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Reverse the array
		
		//int arr[] = {1,2,3,4};
		System.out.println("Enter Array Element: ");
		int arr[] = new int[4];
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i] + " ");
		}
		sc.close();


	}

}
