package Zad6;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Pietro extends Lokalizacja {

    private final int numer;
    List<Pokoj> pokoje;

    public Pietro(int numer) {
        this.numer = numer;
        id = new Identyfikator(0, numer, 0);
        pokoje = new ArrayList<>();
    }

    public void addPokoj(Pokoj pokoj) {
        pokoj.getID().setNrPietra(id.getNrPietra());
        pokoj.getID().setNrBudynku(id.getNrBudynku());

        pokoje.add(pokoj);
    }

    public List getPokoj() {
        return pokoje;
    }

    public String opis() {
        String opisPokoj = "";

        for (Pokoj x : pokoje)
            opisPokoj += x.opis() + " ";

        return "\tPietro: " + numer + " " + id + " \n" + opisPokoj;
    }
}
