package week4;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter a point with two coordinates (x y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (distance <= radius) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle");
        }

        input.close();
    }
}
