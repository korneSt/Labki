package Zad6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Pokoj extends Lokalizacja {

    private final int numer;

    public Pokoj(int numer) {
        this.numer = numer;
        id = new Identyfikator(0,0,numer);
    }

    public String opis() {
        return "\t\tPokoj: "+ numer + " " + id + " \n";
    }

}
