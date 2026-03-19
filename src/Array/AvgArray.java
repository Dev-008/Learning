package Array;
import java.util.Scanner;
public class AvgArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// Average of Elements
			System.out.println("Enter 5 Element: ");
			int num[] = new int[5];
			for(int i=0;i<num.length;i++) {
				num[i]=sc.nextInt();
			}
			int sum = 0;
			for(int i : num) {
				sum += i;
			}
			double avg = (double)sum / num.length;
			System.out.println("The Average Value is: " +avg);
			sc.close();

	}

}
