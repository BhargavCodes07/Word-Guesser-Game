import java.util.Scanner;

public class WordGuesserGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String secretWord = "solo";
        int attempts = 5;

        System.out.println("Welcome to the Word Guesser Game!");

        while (attempts > 0) {
            System.out.println("You have " + attempts +
                               " attempts remaining to guess the secret word: _ _ _ _");

            String answer = scan.nextLine();

            if (answer.equals(secretWord)) {
                System.out.println("Congrats! You guessed the word.");
                break;
            } else {
                attempts--;
                System.out.println("Try again.");
            }
        }

        if (attempts == 0) {
            System.out.println("Game Over! The secret word was: " + secretWord);
        }

        scan.close();
    }
}

  

