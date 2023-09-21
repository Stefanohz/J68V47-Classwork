import java.util.Scanner;

public class L4E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer1 = "lisbon";
        String answer2 = "paris";
        String answer3 = "tokyo";

        System.out.println("Q1. What is the capital of Portugal?");
        String userAnswer1 = scanner.nextLine().toLowerCase();
        boolean isCorrect1 = userAnswer1.equals(answer1);

        System.out.println("Q2. What is the capital of France?");
        String userAnswer2 = scanner.nextLine().toLowerCase();
        boolean isCorrect2 = userAnswer2.equals(answer2);

        System.out.println("Q3. What is the capital of Japan?");
        String userAnswer3 = scanner.nextLine().toLowerCase();
        boolean isCorrect3 = userAnswer3.equals(answer3);

        System.out.println("Results:");
        if (isCorrect1) {
            System.out.println("Q1. What is the capital of Spain? Correct");
        } else {
            System.out.println("Q1. What is the capital of Spain? Sorry, The correct answer is Madrid.");
        }

        if (isCorrect2) {
            System.out.println("Q2. What is the capital of France? Correct");
        } else {
            System.out.println("Q2. What is the capital of France? Sorry, The correct answer is Paris.");
        }

        if (isCorrect3) {
            System.out.println("Q3. What is the capital of Japan? Correct");
        } else {
            System.out.println("Q3. What is the capital of Japan? Sorry, The correct answer is Tokyo.");
        }
        if (!isCorrect1 && !isCorrect2 && !isCorrect3){
            System.out.println("Try again");
        }
        scanner.close();
    }
}



