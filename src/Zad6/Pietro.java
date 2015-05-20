package Zad6;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Pietro extends Lokalizacja {


    private String opis;
    private String nazwa;
    List<Pokoj> pokoje = new ArrayList<>();


    public Pietro(int a, int b) {
        this.id.setNrBudynek(a);
        this.id.setNrPietro(b);
        this.id.setNrPokoj(0);
    }


    void addPokoj(int a) {
        pokoje.add(new Pokoj(this.id.getNrBudynek(), this.id.getNrPietro(), a));
    }

    public void opis() {
        System.out.print("\tPietro: "+this.id.getNrPietro()+" \n");
        for(Pokoj x : pokoje)
            x.opis();
    }

    public Pokoj pok(int a) {
        return this.pokoje.get(a);
    }


}
