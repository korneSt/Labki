import java.io.*;

/**
 * Napisz program proszacy o podanie 2 wektorow. Koniec wektora oznacza sie za pomoca wcisniecia klawisza enter.
 * Jezeli podany ciag nie jest liczba, jest ignorowany. Nastepnie nalezy sprobowac dodac wektory, jezeli sa rownej dlugosci.
 * Jezeli nie, sa, rzucany jest wlasny wyjatek WektoryRoznejDlugosciException, za pomoca ktorego mozna podac
 * a nastepnie odczytac dlugosci tych wektorow. Jezeli sa rownej dlugosci, wynik dodawania zapisywany jest do pliku.
 * Jezeli nie sa rownej dlugosci, uzytkownik jest proszony o ponowne wprowadzenie tych wektoro
 */

public class Zad5 {

    public static void main(String[] args){
        System.out.println("Podaj 2 wektory:\n");
        String w1, w2;
        boolean czyOK = false;

        while (!czyOK) {
            try {
                czyOK = true;
                w1 = podajWektor();
                w2 = podajWektor();

                dodajWektory(w1, w2);
            } catch (WektoryRoznejDlugosciException e) {
                System.out.println("\nPodaj wektory ponownie\n");
                czyOK = false;
            }
        }
    }

    public static long dodajWektory(String w1, String w2) throws WektoryRoznejDlugosciException{

        int wynik = Integer.parseInt(w1) + Integer.parseInt(w2);

        if(sprawdzDlugosc(w1, w2)) {
            zapisz(String.valueOf(wynik));
            return wynik;
        } else {
            throw new WektoryRoznejDlugosciException(w1.length(), w2.length());
        }
    }

    public static String podajWektor() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean czyPoprawne = false;
        String wektor = null;

        while(!czyPoprawne) {

            try {
                wektor = String.valueOf(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException n) {
                System.out.println("Niepoprawne dane!");
            } catch (IOException e) {
                System.out.println("B³¹d odczytu danych");
            }

            czyPoprawne = wektor != null;
        }
        return wektor;
    }

    public static void zapisz(String s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))){
            writer.write(String.valueOf(s));
            System.out.print("Wynik dodawania zapisano w pliku");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static boolean sprawdzDlugosc(String w1, String w2) {
        return (w1.length() == w2.length());
    }

    public static class WektoryRoznejDlugosciException extends Exception {

        public WektoryRoznejDlugosciException(int length, int length1) {
            System.out.format("Dlugosc pierwszego wektora: %d\nDlugosc drugiego wektora: %d\n", length,length1);
        }
    }

}
