package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Enter start amount please. ");
		double startAmount = in.nextDouble();
		System.out.print("Please enter win chance :) ");
		double winChance = in.nextDouble();
		System.out.print("Please enter win limit ;P ");
		double winLimit = in.nextDouble();
		double winOrNot;
		boolean winGame;

		while (startAmount > 0 && startAmount < 10){
			winOrNot = Math.random();
			winGame = (winChance > winOrNot);
			System.out.println("Win or Not value: " + winOrNot);
			if (winGame) {
			startAmount++; 
			System.out.println(startAmount);

		}
			else
			{	
				startAmount--;
				System.out.println(startAmount);

			}
		}
		
		if (startAmount == 0) {
			System.out.println("Ruin... ");
		}
		else {
			System.out.println("Success!!! ");
		}
		
	}

}
