package Training;
import java.util.Scanner;
public class TheaterSeatingfib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Seats No: ");
		int seat = sc.nextInt(); 
		int fact = 1;

        for(int i = 1; i <= seat; i++) {
            fact = fact * i;
            System.out.print(fact+" ");
        }
        System.out.println();
        System.out.println("The Theater Seating Arrangement is: "+fact);
        sc.close();
	}

}
