package Training;
import java.util.Scanner;
public class smart_locker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Locker Code: ");
		int code = sc.nextInt();
		
		// dummy variable
		int original = code;
        int sum = 0;
        
        // logic
        while(code > 0) {
        	int digit = code % 10;
            sum += digit;
            code = code / 10;
        }

        // Check condition
        if(original % sum == 0) {
            System.out.println("Valid Code");
        } else {
            System.out.println("Invalid Code");
        }
        sc.close();
	}

}
