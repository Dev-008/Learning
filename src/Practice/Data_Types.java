package Practice;
import java.util.Scanner;

public class Data_Types {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Taking user input for different data types

	        System.out.print("Enter Age (int): ");
	        int age = sc.nextInt();

	        System.out.print("Enter Height (float): ");
	        float height = sc.nextFloat();

	        System.out.print("Enter Weight (double): ");
	        double weight = sc.nextDouble();

	        System.out.print("Enter Grade (char): ");
	        char grade = sc.next().charAt(0);

	        System.out.print("Are you a student? (true/false): ");
	        boolean isStudent = sc.nextBoolean();

	        System.out.print("Enter a byte value: ");
	        byte number = sc.nextByte();

	        System.out.print("Enter temperature (short): ");
	        short temperature = sc.nextShort();

	        System.out.print("Enter population (long): ");
	        long population = sc.nextLong();

	        // Printing the values
	        System.out.println("\n----- User Entered Data -----");
	        System.out.println("Age: " + age);
	        System.out.println("Height: " + height);
	        System.out.println("Weight: " + weight);
	        System.out.println("Grade: " + grade);
	        System.out.println("Is Student: " + isStudent);
	        System.out.println("Byte Number: " + number);
	        System.out.println("Temperature: " + temperature);
	        System.out.println("Population: " + population);

	        sc.close();
	    }
	}