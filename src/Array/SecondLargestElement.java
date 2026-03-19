package Array;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("Enter The Number: ");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int Largest = num[0];
		int SecondLargest = num [0];
		
		// FirstLargest
		for(int i=1;i<num.length;i++) {
			if(num[i] > Largest) {
				Largest = num[i];
			}
		}
		
		// Second Largest 
		for(int i=0;i<num.length;i++) {
			if(num[i] > SecondLargest && num[i] < Largest) {
				SecondLargest = num[i];
			}
		}
		
		System.out.println("Largest Element: " +Largest);
		System.out.println("SecondLargest Element: " +SecondLargest);
		sc.close();
	}

}
