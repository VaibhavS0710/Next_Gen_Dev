import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int roundsWon = 0;
        int totalAttempts = 0;

        while (true) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("---Random Number Game---");
            System.out.println("---Guess the number between 1-100---");
            System.out.println("---You have 5 attempts---");

            while (attempts < 5) {
                System.out.print("Guess the number: ");
                int val = scanner.nextInt();
                attempts++;

                if (numberToGuess > val) {
                    System.out.println("Too low");
                } else if (numberToGuess < val) {
                    System.out.println("Too high");
                } else if (numberToGuess == val) {
                    System.out.println("Guess is correct!!");
                    score += 10 - attempts;
                    roundsWon++;
                    totalAttempts += attempts;
                    break;
                }
            }

            if (attempts == 5) {
                System.out.println("You've reached the maximum number of attempts. The correct answer was " + numberToGuess);
            }

            System.out.println("Type 1 to play again and type 2 to exit: ");
            int option = scanner.nextInt();
            if (option == 2) {
                System.out.println("Your final score is " + score + " based on " + roundsWon + " rounds won and " + totalAttempts + " attempts.");
                System.out.println("Thank you for playing!!");
                break;
            }
        }
    }
}