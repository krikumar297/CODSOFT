package NumberGuess;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int secretNumber = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Guess the number between 1 and 100: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!");
        System.out.println("Your total score is: " + score);
    }
}


