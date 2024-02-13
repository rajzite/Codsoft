import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class quiz {
    private static final int TIME_LIMIT_SECONDS = 60;
    private static final Scanner scanner = new Scanner(System.in);
    private static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You have " + TIME_LIMIT_SECONDS + " seconds to answer the questions.");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int seconds = 0;

            public void run() {
                seconds++;
                if (seconds == TIME_LIMIT_SECONDS) {
                    System.out.println("Time's up!");
                    showResult();
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 1000, 1000); // Start timer

        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) London");
        System.out.println("B) Paris");
        System.out.println("C) Rome");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("B")) {
            score++;
        }

        System.out.println("Question 2: What is the largest planet in our solar system?");
        System.out.println("A) Earth");
        System.out.println("B) Jupiter");
        System.out.println("C) Mars");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("B")) {
            score++;
        }

        showResult();
        timer.cancel(); // Stop timer
    }

    private static void showResult() {
        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score);
    }
}