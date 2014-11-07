import java.util.Scanner;

class fracReducer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int gcf,numer,denom;
		
		System.out.println("Please enter the numerator");
		numer = sc.nextInt();
		System.out.println("Please enter the denominator");
		denom = sc.nextInt();
		if(numer != denom){
			while(numer != denom){
				if(numer > denom){
					numer -= denom;
				}else{
					denom -= numer;

					System.out.println(denom);
				}	
			}
			gcf = numer;
			denom = (gcf / denom);

			System.out.println("The fraction simplified is " + numer + "/" + denom);
		}else{
			System.out.println("The fraction simplified is 1");
		}
	}
}