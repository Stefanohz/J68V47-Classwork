import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hangman {
    private static final List<String> gameHistory = new ArrayList<>();
    private static final String[] WORD_LIST = {"java", "hangman", "programming", "computer", "code"};

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Start Game");
            System.out.println("2. View Game History");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1 -> playGame(scanner);
                case 2 -> viewGameHistory();
                case 3 -> System.out.println("Exiting the game. Goodbye!");
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice != 3);
    }

    private static void playGame(Scanner scanner) {
        System.out.println("Starting the game...");
        String selectedWord = WORD_LIST[(int) (Math.random() * WORD_LIST.length)];
        char[] guessedWord = new char[selectedWord.length()];
        Arrays.fill(guessedWord, '_');

        int attempts = 7;
        StringBuilder guessedLetters = new StringBuilder();

        while (attempts > 0) {
            displayHangman(attempts);
            System.out.println("Current Word: " + String.valueOf(guessedWord));
            System.out.println("Guessed Letters: " + guessedLetters);
            System.out.println("Attempts Left: " + attempts);
            System.out.print("Enter a letter: ");

            if (scanner.hasNext()) {
                char guessedLetter = scanner.next().charAt(0);

                if (guessedLetters.indexOf(String.valueOf(guessedLetter)) != -1) {
                    System.out.println("You've already guessed that letter. Try again!");
                    continue;
                }

                guessedLetters.append(guessedLetter);

                boolean correctGuess = false;
                for (int i = 0; i < selectedWord.length(); i++) {
                    if (selectedWord.charAt(i) == guessedLetter) {
                        guessedWord[i] = guessedLetter;
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    System.out.println("Incorrect guess. Try again!");
                    attempts--;
                }

                if (Arrays.equals(guessedWord, selectedWord.toCharArray())) {
                    System.out.println("Congratulations! You guessed the word: " + selectedWord);
                    gameHistory.add("Win - Word: " + selectedWord);
                    playAgain(scanner);
                    return;
                }
            } else {
                System.out.println("Invalid input. Please try again.");
                scanner.next(); // Clear the scanner buffer
            }
        }

        displayHangman(attempts);
        System.out.println("Sorry, you ran out of attempts. The correct word was: " + selectedWord);
        gameHistory.add("Loss - Word: " + selectedWord);
        playAgain(scanner);
    }

    private static void displayHangman(int attempts) {
        String[] hangmanImages = {
                "  _____\n |     \n |     \n |     \n |     \n_|_____\n",
                "  _____\n |     |\n |     \n |     \n |     \n_|_____\n",
                "  _____\n |     |\n |     O\n |     \n |     \n_|_____\n",
                "  _____\n |     |\n |     O\n |     |\n |     \n_|_____\n",
                "  _____\n |     |\n |     O\n |    /|\n |     \n_|_____\n",
                "  _____\n |     |\n |     O\n |    /|\\\n |     \n_|_____\n",
                "  _____\n |     |\n |     O\n |    /|\\\n |    / \n_|_____\n",
                "  _____\n |     |\n |     O\n |    /|\\\n |    / \\\n_|_____\n",
        };

        System.out.println(hangmanImages[7 - attempts]);
    }

    private static void viewGameHistory() {
        System.out.println("Game History:");

        if (gameHistory.isEmpty()) {
            System.out.println("No game history available.");
        } else {
            for (String entry : gameHistory) {
                System.out.println(entry);
            }
        }
    }

    private static void playAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (1. Yes / 2. No): ");
        int playAgainChoice = scanner.nextInt();
        if (playAgainChoice == 1) {
            playGame(scanner);
        } else {
            System.out.println("Returning to the main menu.");
        }
    }
}

