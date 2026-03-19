package Array;
import java.util.Scanner;
public class EvenArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int minion[] = new int[10];
		for(int i=0;i<minion.length;i++) {
			minion[i]=sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<minion.length;i++) {
			if(minion[i] % 2==0) {
				count++;
			}
		}
		//System.out.println();
		System.out.println("The Total Count of Even Number is: " + count);
		sc.close();

	}

}
