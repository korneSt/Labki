import java.io.*;

public class Zad4JavaIO {

    public static void odczyt() throws FileNotFoundException {

        System.out.println("---Odczyt z pakietu java.io---");

        try (BufferedReader reader
                     = new BufferedReader(new FileReader("test.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public static void zapis(String s) throws FileNotFoundException {

        System.out.println("---Zapis z pakietu java.io---");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))){
            writer.write(s, 0, s.length());
            writer.close();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}

