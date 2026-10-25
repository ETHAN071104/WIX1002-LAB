package week3;

import java.util.Scanner;

public class EnergyToHeatWater{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter the amount of water in gram: ");
	double watergrams = keyboard.nextDouble();
	
	System.out.print("Enter the initial temperature in Fahrenheit");
	double initialF = keyboard.nextDouble();
	
	System.out.print("Enter the final temperature in Fahrenheit");
	double finalF = keyboard.nextDouble();
	
	double M = watergrams/1000;
	
	double initialC = (finalF - 32) / 1.8;
	
	double finalC = (initialF - 32) / 1.8;
	
	double Q = M * (finalC - initialC) * 4184;
	
	System.out.printf("The energy needed is %e\n" , Q);
	
	keyboard.close();
	}
}


