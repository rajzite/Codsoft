import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxRange = 100; 
        int secretNumber = random.nextInt(maxRange) + 1; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and " + maxRange + ". Try to guess it!");

        int guess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}