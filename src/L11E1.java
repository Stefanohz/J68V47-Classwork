import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L11E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Generate times table and write to file

        generateTimesTable(number);

        System.out.println("Times table for " + number + " has been written to the file.");
    }

    private static void generateTimesTable(int number) {
        String fileName = "times_table_" + number + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write the times table to the file
            for (int i = 1; i <= 12; i++) {
                int result = i * number;
                String line = i + " x " + number + " = " + result;
                writer.write(line);
                writer.newLine(); // Move to the next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
