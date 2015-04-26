/**
 * Created by Kornel on 2015-04-26.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad4JavaNIO {

    public static void odczyt() throws IOException {

        System.out.println("\n---Odczyt z pakietu java.nio---");

        Path file = Paths.get("test.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public static void zapis(String s) {

        System.out.println("---Zapis z pakietu java.nio---");

        Path file = Paths.get("test.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}