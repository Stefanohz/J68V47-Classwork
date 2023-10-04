import java.util.Scanner;
    public class L3E2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String answer1 = "lisbon";
            String answer2 = "paris";
            String answer3 = "tokyo";

            System.out.println("Q1. What is the capital of Portugal?");
            String userAnswer1 = scanner.nextLine().toLowerCase();
            boolean isCorrect1 = userAnswer1.contains(answer1);

            System.out.println("Q2. What is the capital of France?");
            String userAnswer2 = scanner.nextLine().toLowerCase();
            boolean isCorrect2 = userAnswer2.contains(answer2);

            System.out.println("Q3. What is the capital of Japan?");
            String userAnswer3 = scanner.nextLine().toLowerCase();
            boolean isCorrect3 = userAnswer3.contains(answer3);

            System.out.println("Results:");
            System.out.println("Q1. What is the capital of Portugal? " + userAnswer1 + " " + isCorrect1);
            System.out.println("Q2. What is the capital of France? " + userAnswer2 + " " + isCorrect2);
            System.out.println("Q3. What is the capital of Japan? " + userAnswer3 + " " + isCorrect3);

            scanner.close();
        }
    }

