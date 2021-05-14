package com.techelevator;
import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print( "Please enter the bill amount: ");
		String value = input.nextLine();
		double billAmount = Double.parseDouble(value);


		System.out.print("Please enter tendered amount: ");
		value = input.nextLine();
		double tenderedAmount = Double.parseDouble(value);


		double change = tenderedAmount - billAmount;
		System.out.print("Your change will be " + change);



	}

}
