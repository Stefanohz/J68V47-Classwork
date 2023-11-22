import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class L11E3 {
    public static void main(String[] args) {
        // Nombre del archivo a leer (ajusta esto según tu caso)
        String fileName = "numbers.txt";

        // Intenta leer el archivo y sumar los números
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int sum = 0;
            String line;

            // Lee cada línea del archivo
            while ((line = reader.readLine()) != null) {
                // Intenta convertir la línea a un número entero
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException e) {
                    // Maneja el caso en que la línea no sea un número entero válido
                    System.out.println("Warning: Ignored non-integer line: " + line);
                }
            }

            // Imprime la suma en la consola
            System.out.println("Sum of numbers in the file: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

