package Zad6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Pokoj extends Lokalizacja {

    private String nazwa;
    private int nrPok=0;
    Pokoj () {
        this.nrPok++;
    }

    Pokoj(String nazwa) {
        this.nazwa = nazwa;
    }

    public void opis() {
        System.out.println(nrPok + " " + nazwa);

    }
    void setPokoj(String nazwa) {
        this.nazwa = nazwa;
    }

    void addPokoj(String nazwa) {
        this.nazwa = nazwa;
    }
}
