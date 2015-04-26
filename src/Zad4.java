import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

/**
 * Napisz program losujacy 1000 znakow i zapisz je do pliku, a nastepnie odczytaj pliku i wypisz na ekran.
 * Utworz dwie rozne pary procedur zapisujaco/odczytujacych, raz korzystajac z pakietu java.io a drugi raz z pakietu java.nio.
 * Porownaj szybkosc zapisu i odczytu, wynik wypisz na ekranie.
 */
public class Zad4 {

    public static void main(String[] args) {

        long start, stop;
        Random rand = new Random();
        char[] tab = new char[10000];

        for(int i=0; i<10000; i++) {
            tab[i] = (char) (rand.nextInt(26) + 'a');
        }

        String s = new String(tab);

        start = System.currentTimeMillis();
        Zad4JavaNIO.zapis(s);
        stop = System.currentTimeMillis();
        System.out.println("Czas wykonania (w milisekundach): " + (stop - start) + "\n");

        try {
            start = System.currentTimeMillis();
            Zad4JavaIO.zapis(s);
            stop = System.currentTimeMillis();
            System.out.println("Czas wykonania (w milisekundach): " + (stop - start) + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            start = System.currentTimeMillis();
            Zad4JavaIO.odczyt();
            stop = System.currentTimeMillis();
            System.out.println("Czas wykonania (w milisekundach): "+(stop-start));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            start = System.currentTimeMillis();
            Zad4JavaNIO.odczyt();
            stop = System.currentTimeMillis();
            System.out.println("Czas wykonania (w milisekundach): "+(stop-start));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
