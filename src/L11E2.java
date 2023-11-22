import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public  class L11E2 {
        public static void main(String[] args) {
            // Nombre del archivo a leer (debes asegurarte de que coincida con el nombre generado por tu programa anterior)
            String fileName = "times_table_8.txt";

            // Intentar leer el archivo
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                // Usar un bucle do-while para leer líneas hasta que readLine() retorne null
                String line;
                do {
                    line = reader.readLine();
                    if (line != null) {
                        // Imprimir cada línea en la consola
                        System.out.println(line);
                    }
                } while (line != null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
