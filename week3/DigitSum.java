package week3;

import java.util.Random;

public class DigitSum {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generate random number from 0 to 10000 inclusive
        int number = rand.nextInt(10001);
        
        int temp = number;
        int sum = 0;
        
        while (temp > 0) {
            sum += temp % 10;   // Extract last digit
            temp /= 10;         // Discard last digit
        }
        
        System.out.println("Generated Number: " + number);
        System.out.println("Sum of Digits: " + sum);
    }
}
