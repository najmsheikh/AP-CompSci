/*
-Najm Sheikh
-09/27/14
-Create a program that calculates the total resistance in a circuit. Allow the user to enter the type of circuit, and the ohm of 3 resistors in the circuit. Total resistance is calculate differently between series and parallel circuits as shown. Display an appropriate message showing all the information entered and calculated.
*/

import java.util.Scanner;

class totalResistance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r1 = 0,r2 = 0, r3 = 0, totalres = 0;
		String circtype;

		System.out.println("What type of circuit is it?");
		circtype = sc.nextLine();
		System.out.println("How many ohms is resistor 1?");
		r1 = sc.nextDouble();
		System.out.println("How many ohms is resistor 2?");
		r2 = sc.nextDouble();
		System.out.println("How many ohms is resistor 3?");
		r3 = sc.nextDouble();

		if(circtype.equalsIgnoreCase("Series")){
			totalres = r1 + r2 + r3;
		}else{
			if(circtype.equalsIgnoreCase("Parallel")){
				totalres = 1/(1/r1 + 1/r2 + 1/r3);
			}
		}

		System.out.println("The total resistance in this " + circtype + " type circuit is " + totalres + " ohms.");
	}
}