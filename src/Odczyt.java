import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odczyt{
    public static void main(String[] args){
        int tab[] = {1,2,3,4,5};
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Kt�ry element tablicy chcesz zobaczy�: ");
        boolean czyPoprawne = false;

        while(!czyPoprawne) {
            try {
                index = Integer.parseInt(odczyt.readLine());
            } catch (NumberFormatException n) { System.out.println("Niepoprawne dane! " +
                    "\n Kt�ry element tablicy chcesz zobaczy�: ");
            } catch (IOException e) { System.out.println("B��d odczytu danych");
            }

            czyPoprawne = index == -1? false : true;
        }

        try {
            System.out.println(tab[index-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }
    }
}