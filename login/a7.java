import java.util.Scanner;
import java.io.*;

class loginCheck{
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		File file = new File("Accounts.txt");
		BufferedReader rd = new BufferedReader(new FileReader(file));
		String user,pass,login,code;
		Boolean passCorrect = false;
		Integer count = 0;
		
		System.out.println("What is your 4-letter username?");
		login = sc.nextLine();
		System.out.println("What is your 4-digit password?");
		code = sc.nextLine();

		while(rd.readLine() != null){
			String line = rd.readLine();
			user = line.substring(0,4);
			pass = line.substring(4,8);
			if(user.equals(login) && (pass.equals(code))){
				System.out.println("This works yo!");
			}else{
				System.out.println("This don work :(");
				count += 1;
			}
		}	
		// if(count == 3){
		// 	System.out.println("You dun effed up");
		// }
	}
}