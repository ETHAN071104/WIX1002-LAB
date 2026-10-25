package week4;

import java.util.Random;

public class IntToWord{
	public static void main(String[] args){
		Random rand = new Random();
	
		int max = 5 ;
		int min = 0 ;
		int num = rand.nextInt((max - min +1) + min);
	
		System.out.println("The random integer is :" + num);

		switch (num){
			case 0:
				System.out.print(num + " is zero");
				break;
			case 1:
				System.out.print(num + " is one");
				break;
			case 2:
				System.out.print(num + " is two");
				break;
			case 3:
				System.out.print(num + " is three");
				break;
			case 4:
				System.out.print(num + " is four");
				break;
			case 5:
				System.out.print(num + " is five");
				break;
			default:
				System.out.print("We face some error, pls try later");
				break;
		}	
	}
}
