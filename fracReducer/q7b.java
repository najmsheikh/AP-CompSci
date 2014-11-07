import java.util.Scanner;

class fracReducer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int gcf,numer,denom,big,small,remainder,numer2,denom2;
		
		System.out.println("Please enter the numerator");
		numer = sc.nextInt();
		System.out.println("Please enter the denominator");
		denom = sc.nextInt();
		
		big = Math.max(numer, denom);
		small = Math.min(numer, denom);

		remainder = big % small;

		while (remainder != 0 && remainder != 1){
			big = small;
			small = remainder;
			remainder = big % small;
		}

		if (remainder == 0){
			numer2 = numer / small;
			denom2 = denom / small;
			System.out.println("The GCF is " + small);
			System.out.println("The fraction simplified is " + numer2 +"/"+ denom2);
		}
		else if (remainder == 1){
			System.out.println("The fraction simplified is " + numer +"/"+ denom);
		}	
	}
}