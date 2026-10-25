package week3;

import java.util.Scanner;

public class TimeConverter{
	public static void main(String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter the number of seconds: ");
	int totalSeconds = keyboard.nextInt();
        
	int hours = totalSeconds / 3600;
	int Secondsleft = totalSeconds % 3600;
	int minutes = Secondsleft / 60;
	int seconds = Secondsleft % 60;
	
    System.out.println();
	System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n",
	totalSeconds,hours,minutes,seconds);
	
	keyboard.close();
	
	}
}