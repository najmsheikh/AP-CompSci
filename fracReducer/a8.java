// -Najm Sheikh
// -10/31/14
// -Create a program that allows the user to enter a fraction in the form of numerator / denominator.  Reduce the fraction and display.  

import java.util.Scanner;

class fracReducer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String frac,newFrac;
		Integer factor,numer,denom,pos;

		System.out.println("Please enter the fraction:");
		frac = sc.nextLine();
		if((frac.indexOf("/")) >= 0){
			pos = frac.indexOf("/");
			numer = Integer.parseInt(frac.substring(0,pos));
			denom = Integer.parseInt(frac.substring(pos+1));
			factor = Math.min(numer,denom);

			while(!(numer%factor == 0 && denom%factor == 0)){
				factor--;
			}
			int deno2 = denom/factor;
			int nume2 = numer/factor;
			newFrac = (nume2) + "/" + (deno2);
			if(deno2 == 1){
				System.out.println("Your fraction simplified is " + nume2);
			}else{
				System.out.println("Your fraction simplified is " + newFrac);
			}
		}else{
			System.out.println("Improper fraction entered! Please try again.");
		}
	}
}