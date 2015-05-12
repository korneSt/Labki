import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad4JavaNIO {

    public static void odczyt() throws IOException {

        System.out.println("\n---Odczyt z pakietu java.nio---");

        Path file = Paths.get("test1.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader bufferedReader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


    public static void zapis(String s) {

        System.out.println("---Zapis z pakietu java.nio---");

        Path file = Paths.get("test1.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write(s, 0, s.length());
            writer.close();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
