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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:\n");

        try {
            text = scanner.nextLine();
            do {
                System.out.println("Podaj dwie liczby: \n");
                a = scanner.nextInt();
                b = scanner.nextInt();
            } while(a>text.length() || b<a || b > text.length());

        } catch (InputMismatchException e) {
            System.out.println("Blad: " + e);
            System.exit(0);
        }

        System.out.println(text.substring(a,b));

    }
}
