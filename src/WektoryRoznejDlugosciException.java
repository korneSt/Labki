import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Wyjatek WektoryRoznejDlugosciException, za pomoca ktorego mozna podac
 * a nastepnie odczytac dlugosci tych wektorow. Jezeli sa rownej dlugosci, wynik dodawania zapisywany jest do pliku.
 * Jezeli nie sa rownej dlugosci, uzytkownik jest proszony o ponowne wprowadzenie tych wektoro
 */
public class WektoryRoznejDlugosciException extends Exception {

    public WektoryRoznejDlugosciException(String message) {
        super(message);
    }

    public WektoryRoznejDlugosciException(String message, int capacity) {
        System.err.println(message + " " + capacity);
    }

    public WektoryRoznejDlugosciException() {
        System.out.println("Podaj 2 wektory\n");

        Scanner scanner = new Scanner(System.in);
        String word1, word2;

        word1 = scanner.nextLine();
        word2 = scanner.nextLine();

        System.out.println("Dlgosc wektora pierwszego: " + word1.length());
        System.out.println("Dlugosc wektora drugiego: " + word2.length());

        String x = null;
        try {
            x = String.valueOf(Zad5.dodajWektory(word1, word2));
        } catch (WektoryRoznejDlugosciException e) {
            word1 = scanner.nextLine();
            word2 = scanner.nextLine();
        }
        try {
            Zad4JavaIO.zapis(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
