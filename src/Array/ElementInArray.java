package Array;
import java.util.Scanner;
public class ElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// print elements in array
				System.out.println("Enter 5 Element: ");
				int dev[] = new int[5];
				for(int i = 0;i<dev.length;i++) {
					dev[i]=sc.nextInt();
				}
				System.out.println("The Elements Are:");
				for(int i = 0;i<dev.length;i++) {
					System.out.println(dev[i]);
				}
				sc.close();
	}

}
