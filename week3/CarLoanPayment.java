package week3;

import java.util.Scanner ;

public class CarLoanPayment {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Price of the car : ");
		double P = keyboard.nextDouble();
		
		System.out.print("Down Payment(D) : ");
		double D = keyboard.nextDouble();
		
		System.out.print("Enter interest rate in % (R): ");
    double R = keyboard.nextDouble();

	  System.out.print("Enter loan duration in years (Y): ");
    double Y = keyboard.nextDouble();
    
    double M = (P - D) * (1 + R * Y/100) / (Y * 12) ;

        System.out.printf("Monthly Payment: %.2f\n", M);

        keyboard.close() ;
        
	}
}