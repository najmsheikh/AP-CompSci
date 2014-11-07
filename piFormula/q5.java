// -Najm Sheikh
// -10/7/14
// -1) Create a program that calculates the value PI to a specified number of terms by the user.  Pay close attention to the alternating operations.  Hint: Use a for loop.

import java.util.Scanner;

class piFormula{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double pi = 0;
		int deno, denoCount;

		System.out.println("What number do you want to stop the denominator at?");
		denoCount = sc.nextInt();

		for(deno=3;deno<denoCount;deno = deno+2){
			// pi = 1-((1/deno)+(1/deno+2));
			if(deno<denoCount){
				deno = deno * -1;
				
			}
	}
	System.out.println(pi);
	}
}
