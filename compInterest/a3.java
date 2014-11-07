// -Najm Sheikh
// -10/6/14/
// -One of the services banks typically provide to prospective customers is the ability 
// show the customer how their investment will grow over a set numbers of years at a specific interest rate.  

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

class compInterest{
	public static void main(String [] args)throws IOException{
		File file = new File("Interests.txt");
		BufferedWriter output = new BufferedWriter(new FileWriter(file));
		double a=0,p=0,r=0,t=0,n=0,e=0;
		Scanner sc = new Scanner(System.in);
		DecimalFormat sigfig = new DecimalFormat();
		sigfig.setMaximumFractionDigits(2);

		System.out.println("What is the principal?");
		p = sc.nextDouble();
		System.out.println("What is the annual nominal interest rate?");
		r = sc.nextDouble();
		System.out.println("How many times is the interest compounded annually?");
		n = sc.nextDouble();
		System.out.println("For how many years will you borrow the money?");
		t = sc.nextDouble();

	
		for(int x = 0; x <= t; x = x + 1){
			a = p * Math.pow((n*t),(1 + (r/n)));
		}
		e = a - p;
		
		output.write("Your final balance after " + t + " years of investment is $" + sigfig.format(a));
		output.newLine();
		output.write("The amount of money gained is $" + sigfig.format(e));
		output.close();
	
		
	}
}
	
	
	