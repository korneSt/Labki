import java.util.Formatter;

/**
 * Created by Kornel Stepnik.
 */

public class Zad1 {

    public static void main(String[] args){
        int a,b,c;

        try{
            a = (int) Float.parseFloat(args[0]);
            b = (int) Float.parseFloat(args[1]);
            c = (int) Float.parseFloat(args[2]);

        } catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Blad: "+ e);
            return;
        }

        if (a != 0) {
            oblicz(a, b, c);
        } else {
            System.out.println("Funkcja liniowa");
        }
    }

    static void oblicz(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta == 0){
            wyswietl(b * (-1) / (2 * a));
        }
        else if (delta >0){
           wyswietl((b*(-1) + Math.sqrt(delta))/(2*a));
            wyswietl((b*(-1) - Math.sqrt(delta))/(2*a));
        }
        else {
           System.out.println("Brak miejsc zerowych");
        }
    }

    static void wyswietl(double wynik) {
        Formatter f = new Formatter();
        f.format("Miejsce zerowe: %.2f", wynik);
        System.out.println(f);
    }
}
