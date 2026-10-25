package week3;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter temperature in fahrenheit : ");
		double fahrenheit = keyboard.nextDouble();
		
		double celsius = (fahrenheit - 32) /1.8;
		
		System.out.printf("Temperature in Celsius : %.2f deg C\n", celsius);
		
		keyboard.close();
	}
}
