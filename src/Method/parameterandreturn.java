package Method;
import java.util.Scanner;
public class parameterandreturn {
	
	static int square(int n) {
		return n * n;
	}
	
	static int cube(int n) {
		return n * n * n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value: ");
		int n = sc.nextInt();
		
		// for square
		int result = square(n);
		System.out.println("The Square Of The Value Is: "+result);
		
		// for cube
		int result2 = cube(n);
		System.out.println("The Cube Of The Number Is: "+result2);
		sc.close();
	}

}
