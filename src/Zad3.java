import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Napisz program losujacy liczbe z zakresu 0-100. Nastepnie program pyta sie uzytkownika, co to za liczba.
 * Jezeli uzytkownik nie zgadl, dowiaduje sie czy wylosowana liczba jest wieksza czy mniejsza od podanej.
 * Jezeli zgadl, dowiaduje sie ile wykonal prob i jest pytany o ochote do dalszej gry.
 */
public class Zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int a=-1, ile=0;
        char c='t';

        System.out.println("Zgadnij liczbe\n");

        //(max - min) + 1) + min;
        do {
            ile=0;
            int n = rand.nextInt(101);
            System.out.println("Podaj liczbe\n");
            //System.out.print(n + "\n");
            while (a != n) {
                a = scanner.nextInt();
                if (a > n) {
                    System.out.println("Za duzo");
                    ile++;
                } else if (a < n) {
                    System.out.println("Za malo");
                    ile++;
                } else {
                    System.out.println("Zgadles w " + ile + " probach\n Jeszcze raz? (tak-t, nie-n)\n");
                    c = scanner.next().charAt(0);
                }
            }
        }while (c == 't');
    }
}
