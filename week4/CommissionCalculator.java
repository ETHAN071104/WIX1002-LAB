package week4;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter sales volume: ");
        double sales = keyboard.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid input: Sales volume cannot be negative.");
        } else {
            double rate;

            if (sales <= 100) {
                rate = 0.05;
            } else if (sales <= 500) {
                rate = 0.075;
            } else if (sales <= 1000) {
                rate = 0.10;
            } else {
                rate = 0.125;
            }

            double commission = sales * rate;
            System.out.printf("Total Commission: %.2f\n", commission);
        }

        keyboard.close();
    }
}