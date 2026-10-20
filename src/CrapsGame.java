import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner keyboard = new Scanner(System.in);
        boolean gameOver = false;

        String playAgain;

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int totalRoll = die1 + die2;

            System.out.println("\nDie 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + totalRoll);

            if (totalRoll == 2 || totalRoll == 3 || totalRoll == 12) {
                System.out.println("You crapped out. You lose!");

            } else if (totalRoll == 7 || totalRoll == 11) {
                System.out.println("You win!");

            } else {
                int point = totalRoll;
                 gameOver = true;

                System.out.println("The point is " + point);

                while (!gameOver) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    totalRoll = die1 + die2;

                    System.out.println("\nDie 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Total: " + totalRoll);

                    if (totalRoll == point) {
                        System.out.println("You made the point. You win!");
                        gameOver = true;

                    } else if (totalRoll == 7) {
                        System.out.println("You rolled a seven. You lose!");
                        gameOver = true;

                    } else {
                        System.out.println("Trying for point " + point);
                        gameOver = true;
                    }
                }
            }

            System.out.print("\nWould you like to play again? [Y/N]: ");
            playAgain = keyboard.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing!");
        keyboard.close();
    }
}