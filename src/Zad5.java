import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        String word1, word2;

        word1 = scanner.nextLine();
        word2 = scanner.nextLine();

        if(isNumeric(word1) && isNumeric(word2)) {
            try {
                System.out.println(dodajWektory(word1, word2));
            } catch (WektoryRoznejDlugosciException e) {}
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int dodajWektory(String w1, String w2) throws WektoryRoznejDlugosciException {
        int x=0, z=0;
        try{
            x = Integer.parseInt(w1);
            z = Integer.parseInt(w2);
        } catch (NumberFormatException e) {
           e.printStackTrace();
        }
        if (w1.length() == w2.length()) {
            return x+z;
        } else {
            throw new WektoryRoznejDlugosciException();
        }
    }
}
