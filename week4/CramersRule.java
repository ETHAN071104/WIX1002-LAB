package week4;

import java.util.Scanner;

public class CramersRule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double d = keyboard.nextDouble();
        double e = keyboard.nextDouble();
        double f = keyboard.nextDouble();

        double determinant = (a * d) - (b * c);

        if (determinant == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            System.out.println("x is " + x + " and y is " + y);
        }

        keyboard.close();
    }
}
