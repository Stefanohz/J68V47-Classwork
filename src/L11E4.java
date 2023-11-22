import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class L11E4 {
    public static void main(String[] args) {
        // Ask the user for the names of the files
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first file: ");
        String fileName1 = scanner.nextLine();

        System.out.print("Enter the name of the second file: ");
        String fileName2 = scanner.nextLine();

        // Compare the contents of the files
        boolean areIdentical = compareFiles(fileName1, fileName2);

        // Output the result to the console
        if (areIdentical) {
            System.out.println("The files are identical.");
        } else {
            System.out.println("The files are not identical.");
        }
    }

    // Compare the contents of two text files
    private static boolean compareFiles(String fileName1, String fileName2) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {

            String line1, line2;

            // Read and compare line by line
            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                // Compare lines taking content into account, not just reference
                if (!Objects.equals(line1, line2)) {
                    return false; // The lines are not identical
                }
            }

            // Check if both files have the same number of lines
            return reader1.readLine() == null && reader2.readLine() == null;

        } catch (IOException e) {
            e.printStackTrace();
            return false; // Handle possible file reading errors
        }
    }
}