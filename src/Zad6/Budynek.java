package Zad6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Budynek extends Lokalizacja {

    Identyfikator i = new Identyfikator();

    private String nazwa;
    int ilePietro=0;
    List <Pietro> pietra = new ArrayList<>();
    Pietro p;
    Pokoj pok;
    Budynek() {}

    Budynek(String nazwa) {
        this.nazwa = nazwa;
    }

    public void opis() {
        System.out.println("Nazwa budynku: " + nazwa);
        System.out.println("Pietra w budynku: ");
        for(Pietro p : pietra) {
           p.opis();
        }
    }
    void setBudynek(String nazwa) {
        this.nazwa = nazwa;
    }

    void setID() {

    }
    public List<Pietro> getPietro() {
        return pietra;
    }


    void addPietro(String nazwa) {
        p = new Pietro(nazwa);
        pietra.add(p);
    }

    void addsPokoj(String pietro) {
        pok = new Pokoj();
        for(Pietro p : pietra) {
            if(p.getOpis().equals(pietro)) p.addPokojToList(pok);
        }
    }

    void pokojeNaPietrze(String pietro) {
        for(Pietro p : pietra) {
            if(p.getOpis().equals(pietro)) p.opisPietro();
        }
    }

}
