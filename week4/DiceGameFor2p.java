package week4;

import java.util.Scanner;
import java.util.Random;

public class DiceGameFor2p{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("===Welcome to simple 2 player dice game===");
		System.out.println("--> press any key to start the game <---");
		keyboard.nextLine();
		
		int max = 6;
		int min = 1;
//---------------player1 logic-------------------
		int random11 = rand.nextInt(max - min + 1 ) + min ;
		int random12 = rand.nextInt(max - min + 1 ) + min ;
		
		System.out.println();
		System.out.println("Player 1 :");
		System.out.println("First dice is " + random11 + "; Second dice is " + random12);
		int result1 = random11 + random12;
		System.out.println("The final mark of player 2 is " + result1);

//---------------player2 logic-------------------
		int random21 = rand.nextInt(max - min + 1 ) + min ;
		int random22 = rand.nextInt(max - min + 1 ) + min ;
		
		System.out.println();
		System.out.println("Player 2 :");
		System.out.println("First dice is " + random21 + "; Second dice is " + random22);
		int result2 = random21 + random22;
		System.out.println("The final mark of player 2 is " + result2);
		System.out.println();
		
//--------------Winner System-------------------
		if (result1 > result2)
			System.out.println("Player 1 is winner!");
			
		if (result1 < result2)
			System.out.println("Player 2 is winner!");
			
		if (result1 == result2)
			System.out.println("It's a draw!");
			
		keyboard.close();
	}
}
