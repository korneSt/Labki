import java.util.Random;
import java.util.Scanner;

/**
 * Napisz program losujacy liczbe z zakresu 0-100. Nastepnie program pyta sie uzytkownika, co to za liczba.
 * Jezeli uzytkownik nie zgadl, dowiaduje sie czy wylosowana liczba jest wieksza czy mniejsza od podanej.
 * Jezeli zgadl, dowiaduje sie ile wykonal prob i jest pytany o ochote do dalszej gry.
 */

public class Zad3 {

    private int liczba;
    private int ileProb;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Zad3 gra = new Zad3();
        gra.rozpocznij();
    }

    private void rozpocznij() {

        Random rand = new Random();
        char c;

        System.out.println("Jaka to liczba?\n");

        do {
            System.out.println("Zgaduj liczby: \n");
            ileProb=0;
            liczba = -1;
            int wylosowana = rand.nextInt(101);

            if( zgaduj(wylosowana) ) {
                System.out.println("Zgadles w " + ileProb + " probach");
                System.out.println("Grasz jeszcze raz? ( t -tak, n - nie)");
            }

            c = scanner.next().charAt(0);
        } while (c == 't');
    }

    boolean zgaduj(int wylosowana) {

        while (liczba != wylosowana) {

            liczba = podajLiczbe();

            if (liczba > wylosowana) {
                System.out.println("za duzo");
            } else if (liczba < wylosowana) {
                System.out.println("za malo");
            }
        }
        return true;
    }

    int podajLiczbe()  {

        Integer l = scanner.nextInt();

        ileProb++;
        return l;
    }
}
