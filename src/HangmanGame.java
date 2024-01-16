import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HangmanGame {
    private static final List<String> gameHistory = new ArrayList<>();
    private static final String WORDS_FILE_PATH = "words.txt";
    private static final String HISTORY_FILE_PATH = "game_history.txt";

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display the main menu
            System.out.println("1. Start Game");
            System.out.println("2. View Game History");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Process the user's choice
            switch (choice) {
                case 1 -> playGame(scanner);
                case 2 -> viewGameHistory(scanner);  // Pass the scanner to viewGameHistory
                case 3 -> {
                    System.out.println("Exiting the game. Goodbye!");
                    saveGameHistoryToFile();  // Save game history before exiting
                }
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice != 3);
    }

    private static void playGame(Scanner scanner) {
        String selectedWord = getRandomWordFromFile();
        char[] guessedWord = new char[selectedWord.length()];
        Arrays.fill(guessedWord, '_');

        int attempts = 7;
        List<Character> guessedLetters = new ArrayList<>();

        // Main game loop
        while (attempts > 0) {
            displayHangman(attempts);
            System.out.println("Current Word: " + String.valueOf(guessedWord));
            System.out.println("Guessed Letters: " + guessedLetters);
            System.out.println("Attempts Left: " + attempts);
            System.out.print("Enter a letter: ");

            char guessedLetter = scanner.nextLine().toLowerCase().charAt(0);

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("You've already guessed that letter. Try again!");
                continue;
            }

            guessedLetters.add(guessedLetter);

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
                saveGameHistoryToFile();
                return;
            }
        }

        displayHangman(attempts);
        System.out.println("Sorry, you ran out of attempts. The correct word was: " + selectedWord);
        gameHistory.add("Loss - Word: " + selectedWord);
        saveGameHistoryToFile();
    }

    private static String getRandomWordFromFile() {
        List<String> words = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(WORDS_FILE_PATH))) {
            // Read words from the file and add them to the list
            while (fileScanner.hasNext()) {
                words.add(fileScanner.next().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading words from file.");
            e.printStackTrace();
        }
        // Return a randomly selected word from the list
        return words.get((int) (Math.random() * words.size()));
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

        // Display the Hangman image based on the remaining attempts
        System.out.println(hangmanImages[7 - attempts]);
    }

    private static void viewGameHistory(Scanner scanner) {
        System.out.println("Game History:");

        if (gameHistory.isEmpty()) {
            System.out.println("No game history available.");
        } else {
            for (String entry : gameHistory) {
                System.out.println(entry);
            }
        }

        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    private static void saveGameHistoryToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE_PATH))) {
            for (String entry : gameHistory) {
                writer.println(entry);
            }
            System.out.println("Game history saved to file");
        } catch (IOException e) {
            System.out.println("Error saving game history to file.");
            e.printStackTrace();
        }
    }
}
