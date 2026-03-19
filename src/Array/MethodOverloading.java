package Array;
import java.util.Scanner;
public class MethodOverloading {
	static int add(int a,int b) {
		return a+b;
		/*int sum = a+b;
		System.out.println("Sum Of Int(A+B) Is: "+sum);*/
	}
	static int add(int a,int b,int c) {
		return a+b+c;
		/*int sum = a+b+c;
		System.out.println("Sum Of Int(A+B+C) Is: "+sum);*/
	}
	static double add(double da, double db) {
		return da+db;
		/*double sum = a+b;
		System.out.println("Sum Of Double(A+B) Is: "+sum);*/
	}
	public static void main(String[] args) {
		// Integer Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Value: ");
		int a = sc.nextInt();
		System.out.println("Enter B Value: ");
		int b = sc.nextInt();
		System.out.println("Enter C Value: ");
		int c = sc.nextInt();
		
		// Double Input
		System.out.println("Enter The A Double Value: ");
		double da = sc.nextDouble();
		System.out.println("Enter The A Double Value: ");
		double db = sc.nextDouble();
		
		// Output
		System.out.println("Sum Of Int(A+B) Is: "+add(a,b));
		System.out.println("Sum Of Int(A+B+C) Is: "+add(a,b,c));
		System.out.println("Sum Of Double(A+B) Is: "+add(da,db));
		sc.close();
	}

}
