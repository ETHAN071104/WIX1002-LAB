package week3;

import java.util.Random;

public class RandomNumberSumAvg{
	public static void main(String[] args){
	
	Random g = new Random();
	
	int num1 = g.nextInt(41) + 10;
	int num2 = g.nextInt(41) + 10;
	int num3 = g.nextInt(41) + 10;
	
	int sum = (num1 + num2 + num3);
	double avg = sum / 3;

    System.out.println("Generated number:" + num1 + "," + num2 + "," + num3);
	System.out.println("The sum of the three number: " + sum);
	System.out.printf("The average of the three number: %.2f" , avg);
	}
}
