import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisz program, ktory pobiera dwie liczby oraz lancuch znakow z wiersza polecen
 * oraz wyswietla fragment podanego lancucha okreslony wprowadzonymi liczbami. Na przyklad:
 * java Substring Witaj 2 4
 * powinien wyswietlic:
 * taj
 */
public class Zad2 {

    public static void main(String[] args) {
        int a=0,b=0;
        String text="";

        try {
            text = args[0];
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
            if (a>text.length() || b<a || b > text.length()) {
               throw new IndexOutOfBoundsException();
           }
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Blad: " + e);
            System.exit(0);
        }

        System.out.println(text.substring(a,b+1));
    }
}
