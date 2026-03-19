package Array;
import java.util.Scanner;
public class AreaCalculation {
	static int Square(int side) {
		return side * side;
	}
	static int Rectangle(int length, int breadth) {
		return length * breadth;
	}
	static double Circle(double radius) {
		double pi = 3.14;
		return pi * radius * radius;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Square
		System.out.println("Enter The Side Value: ");
		int side = sc.nextInt();
		System.out.println("The Area Of Square is: "+Square(side));
		// Rectangle
		System.out.println("Enter The Length Value: ");
		int length = sc.nextInt();
		System.out.println("Enter the Breadth Value: ");
		int breadth = sc.nextInt();
		System.out.println("The Area Of Rectangle is: "+Rectangle(length,breadth));
		// Circle
		System.out.println("Enter The Radius Value: ");
		double radius = sc.nextDouble();
		System.out.println("The Area Of Circle is: "+Circle(radius));
		
		// Output
		/*System.out.println("The Area Of Square is: "+Square(side));
		System.out.println("The Area Of Rectangle is: "+Rectangle(length,breadth));
		System.out.println("The Area Of Circle is: "+Circle(radius));*/
		sc.close();
	}

}
