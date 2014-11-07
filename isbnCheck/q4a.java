// -Najm Sheikh
// -10/06/14
// -Write a program that prompts the user to enter the 10 digits of an ISBN.  Display whether the ISBN entered is valid. The ISBN will have to be entered as a string to allow the input of X as the last digit. 

import java.util.Scanner;

class isbnCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String userInput;
		int[] d = new int[11];
		
		System.out.println("Please enter the first 9 digits of the ISBN");
		userInput = sc.nextLine();

		if(userInput.length() < 9 || userInput.length() > 9){
			System.out.println("You entered an invalid amount of digits!");
		}else{
			for(int x=1;x<10;x++){
			
			d[x] = Integer.parseInt(userInput.substring(x-1,x));
			d[10] = (d[1]*1+d[2]*2+d[3]*3+d[4]*4+d[5]*5+d[6]*6+d[7]*7+d[8]*8+d[9]*9)%11;

		}
		
		if(d[10] == 10){
			System.out.println("ISBN:" + d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8]+d[9]+"X");
		}else{
			System.out.println("ISBN:" + d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8]+d[9]+d[10]);
		}
		}
	}

}