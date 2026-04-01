package Slightly_Advanced;
import java.util.Scanner;
public class Swap_First_and_Last_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number Ranger: ");
//		int limit = sc.nextInt();
		System.out.println("Enter the Value: ");
		int value = sc.nextInt();
		int first=0;
		int second=0;							
		
//		if(value>99) {
//			last = value%10;
//			//System.out.println(last);
		if(0<value&& value<99) {
			int lat = value%10;
			first = value/10;
			System.out.println(lat+" "+first);
		}
		else if(0<value && value<999) {
			int swap = value%10;
			int cen=value%100;
			int mode=cen/10;
			second = value/100;
			System.out.println(swap+" "+mode+" "+second);
		}
		else {
			System.out.println("Enter below 3 digit");
		}
//		if(value>99) {
//			temp = value/10;
//			center = temp%100;
//			//System.out.println(center);
//			
//		}
//		System.out.println(last+"" +center  +""+first);
		}
		

	}


