package week4;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = keyboard.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char logic = keyboard.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (logic) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                valid = false;
                break;
        }

        if (valid) {
            System.out.println("The result of " + num1 + " " + logic + " " + num2 + " is " + result);
        }

        keyboard.close();
    }
}