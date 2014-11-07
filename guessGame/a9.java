// -Najm Sheikh
// -11/5/14
// -Create a ....

import java.util.Scanner;

class guessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret, ct = 0, guess = 0;
        secret = (int) (Math.random() * 100 + 1);
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
        }
    }
}