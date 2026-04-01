package Training;
import java.util.Scanner;
public class Minion_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int temp = num;
		
		//Logic
		
		// Count Of Digit
		int count = 0;
		while(temp != 0) {
			temp /= 10;
			count++;
		}
		System.out.println("Count is: " + count);
		
		// Power
		int power = 1;
        for(int i = 1;i <= count - 1; i++) {
        	power = power * 10;
        }
        System.out.println("Power is: " + power);
        
		// First
		int firstdigit = num;
        while (firstdigit >= 10) { // keep dividing by 10 until only first digit remains
            firstdigit /= 10;
        }
        System.out.println("First Digit: " + firstdigit);
        
        // Middle
        int middle = (num % power / 10);
        System.out.println("Middle Digit: " + middle);
        
        // Last
		int lastdigit = num % 10;  // 123 % 10 = 3 
		System.out.println("Last Digit: " + lastdigit);
		
		// condition
		if(lastdigit == 0) {
			System.out.print("Swapped Values: "+lastdigit+middle+firstdigit);
		}
		
		/*// Swap Digit
		int swap = power * lastdigit + middle * 10 + firstdigit;
		System.out.println("Swapped Value: " + swap);*/
		sc.close();
	}
}
