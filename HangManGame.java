import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretWord = "java";
        int maxTries = 6;
        int tries = 0;
        StringBuilder guessedWord = new StringBuilder("____");

        System.out.println("Welcome to Hangman!");

        while (tries < maxTries) {
            System.out.println("Word: " + guessedWord);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            if (secretWord.contains(String.valueOf(guess))) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
            } else {
                System.out.println("Incorrect guess. Try again.");
                tries++;
            }

            if (guessedWord.toString().equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word: " + secretWord);
                break;
            }
        }

        if (tries >= maxTries) {
            System.out.println("Sorry, you're out of tries. The word was: " + secretWord);
        }
    }
}
