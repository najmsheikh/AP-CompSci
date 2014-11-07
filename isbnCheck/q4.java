import java.util.Scanner;

class isbnCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String userInput,d1,d2,d3,d4,d5,d6,d7,d8,d9;
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,d10;


		System.out.println("Please enter the first 9 digits of the ISBN");
		userInput = sc.nextLine();
		d1 = userInput.substring(0,1);
		a1 = Integer.parseInt(d1);
		d2 = userInput.substring(1,2);
		a2 = Integer.parseInt(d2);
		d3 = userInput.substring(2,3);
		a3 = Integer.parseInt(d3);
		d4 = userInput.substring(3,4);
		a4 = Integer.parseInt(d4);
		d5 = userInput.substring(4,5);
		a5 = Integer.parseInt(d5);
		d6 = userInput.substring(5,6);
		a6 = Integer.parseInt(d6);
		d7 = userInput.substring(6,7);
		a7 = Integer.parseInt(d7);
		d8 = userInput.substring(7,8);
		a8 = Integer.parseInt(d8);
		d9 = userInput.substring(8,9);
		a9 = Integer.parseInt(d9);
		d10 = (a1*1+a2*2+a3*3+a4*4+a5*5+a6*6+a7*7+a8*8+a9*9)%11;

		if(d10 == 10){
			System.out.println("ISBN:" + a1+a2+a3+a4+a5+a6+a7+a8+a9+"X");
		}else{
			System.out.println("ISBN:" + a1+a2+a3+a4+a5+a6+a7+a8+a9+d10);
		}
		


	}
}