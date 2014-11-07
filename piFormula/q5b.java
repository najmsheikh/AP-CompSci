import java.util.Scanner;

class piFormulaB{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double pi = 0;
		int denoCount;
		double deno = 1;

		System.out.println("How many terms?");
		denoCount = sc.nextInt();
		while(pi != 3.14159){
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
}