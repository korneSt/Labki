package inne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Czlowiek> ludzie = new ArrayList<Czlowiek>();
        ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
        ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
        ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
        ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
        ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
        ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
        ludzie.add(new Czlowiek('K', "Ania", "Daszek"));

        System.out.println("Nieposortowanie: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }

        Collections.sort(ludzie);

        System.out.println("\nPosortowane: ");
        for(Czlowiek czlowiek : ludzie) {
            System.out.println(czlowiek);
        }
    }

}