package Zad6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Pokoj extends Lokalizacja {

    private String nazwa;

    Pokoj(int a, int b, int c) {
        this.id.setNrBudynek(a);
        this.id.setNrPietro(b);
        this.id.setNrPokoj(c);
    }

    Pokoj(String nazwa) {
        this.nazwa = nazwa;
    }

    public void opis() {
        System.out.print("\t\tPokoj: "+this.id.getNrPokoj()+" \n");
    }

    public String opisString() {
        return "\t\tPokoj: "+this.id.getNrPokoj()+" \n";
    }
    void setPokoj(String nazwa) {
        this.nazwa = nazwa;
    }

    void addPokoj(String nazwa) {
        this.nazwa = nazwa;
    }
}
