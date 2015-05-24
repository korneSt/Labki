package Zad6;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Budynek extends Lokalizacja {

    private String nazwa;
    private List <Pietro> pietra = new ArrayList<>();
    Image img = new Image("Zad6/building.png");

    Budynek(int b) {
        this.id.setNrBudynek(b);
        this.id.setNrPietro(0);
        this.id.setNrPokoj(0);
    }

    public void opis() {
        System.out.print("\nBudynek: " + this.id.getNrBudynek() + " \n");
        for(Pietro x : pietra)
            x.opis();
    }

    public String opisString() {
        String opispietra="";
       // System.out.print("\tPietro: "+this.id.getNrPietro()+" \n");
        for(Pietro x : pietra)
            opispietra+=x.opisString()+" ";
        return "\nBudynek: " + this.id.getNrBudynek() + " \n" + opispietra;
    }

    public Pietro pie(int a) {
        return this.pietra.get(a);
    }


    public List<Pietro> getPietro() {
        return pietra;
    }


    void addPietro(int nr) {
        Pietro p = new Pietro(this.id.getNrBudynek(), nr);
        pietra.add(p);
    }
}
