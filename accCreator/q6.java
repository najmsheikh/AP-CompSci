// -Najm Sheikh
// -10/12/14
// -Create a program that creates user accounts and passwords for all users contained in User.txt.  Output results to a file, Accounts.txt.  For each user per line in User.txt, a 9-digit ID number is immediately followed by their last name.  User accounts are created by taking the first four letters of a user's last name and attaching the last four last four digits of the ID number.  Generate random 4-digit passwords and attached after the user account so that it is included in the output, Account.txt

import java.io.*;

class accCreator{
	public static void main(String[] args)throws IOException{;
		File file = new File("User.txt");
		File file2 = new File("Accounts.txt");
		BufferedReader rd = new BufferedReader(new FileReader(file));
		BufferedWriter rt = new BufferedWriter(new FileWriter(file2));
		String user,id,name;
		int pass,lines = 0;

		while(rd.readLine() != null){
			user = rd.readLine();
			id = user.substring(5,9);
			if(user.length() > 13){
				name = user.substring(9,13);
			}else{
				name = user.substring(9);
			}
			pass = (int)(Math.random() * 9000) + 1000;

			rt.write(name+id + "," + pass);
			rt.newLine();		
		}
		rd.close();
		rt.close();
	}
}