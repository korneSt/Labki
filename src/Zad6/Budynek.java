package Zad6;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Budynek extends Lokalizacja {

    private final int numer;
    private List <Pietro> pietra;

    Budynek(int numer) {
        this.numer = numer;
        id = new Identyfikator(numer);
        pietra = new ArrayList<>();
    }


    public String opis() {
        String opispietra="";

        for(Pietro x : pietra)
            opispietra+=x.opis()+" ";

        return "\nBudynek: " + numer + " " + id + "\n " + opispietra;
    }

    void addPietro(Pietro pietro) {
        pietro.getID().setNrBudynku(id.getNrBudynku());
        pietra.add(pietro);
    }

    public List getPietro() {
        return pietra;
    }


    @Override
    public String toString() {
        return "Budynek " + numer + " ";
    }
}
