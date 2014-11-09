package a9;
import java.util.Scanner;
import java.io.*;

class guessGame {
    @SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        File scores = new File("Scores.txt");
//        File scores2 = new File("Scores1.txt");
        BufferedReader rd = new BufferedReader(new FileReader(scores));
        BufferedWriter rt = new BufferedWriter(new FileWriter(scores,true));
        int secret = 4, ct = 0, guess = 0;
        String name="";
      
//        secret = (int) (Math.random() * 100 + 1);
        long startTime = System.currentTimeMillis();
        while (!(ct >= 5 || guess == secret)) {
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            ct++;

            if (guess < secret) {
                System.out.println("This is a smaller number!");
            } else {
                if (guess > secret) {
                    System.out.println("This is a bigger number!");
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long time = (endTime - startTime) / 1000;
        if (ct == 5 && !(guess == secret)) {
            System.out.println("Game Over!");
        }

        if (guess == secret) {
            System.out.println("You won!");
            System.out.println("It took you " + time + " secs and " + ct + " try(s) to finish!");
            if(rd.readLine() == null){
            	System.out.println("What is your name?");
            	rd.close();
            	name = sc.next();
            	rt.write(name + " " + time);
            	rt.close();
            }else{
            	rt.newLine();
            	System.out.println("What is your name?");
                rd.close();
                name = sc.next();
                rt.write(name + " " + time);
                rt.close();
            }
        }
    }
}
