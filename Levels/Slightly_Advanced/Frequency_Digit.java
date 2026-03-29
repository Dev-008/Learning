package Slightly_Advanced;
import java.util.Scanner;

public class Frequency_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();

        // Array to store frequency of digits 0–9
        int[] freq = new int[10];

        // Extract digits and count frequency
        while (num != 0) {
            int digit = num % 10;   // get last digit
            freq[digit]++;          // increment frequency
            num = num / 10;         // remove last digit
        }

        // Display results
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}