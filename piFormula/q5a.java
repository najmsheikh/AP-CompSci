// -Najm Sheikh
// -10/8/14
// -Create a program that calculates the value PI to a specified number of terms by the user.  Pay close attention to the alternating operations.  Hint: Use a for loop.


import java.util.Scanner;

class piFormula{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double pi = 0;
		int denoCount;
		double deno = 1;

		System.out.println("How many terms?");
		denoCount = sc.nextInt();
		for (int x = 0; x <= denoCount; x++) {
 
         if (x % 2 == 0) {
            pi = pi + (1 / deno);
         } else {
            pi = pi - (1 / deno);
         }
         deno = deno + 2;
      }
      pi = pi * 4;
      System.out.println(pi);
   }
}