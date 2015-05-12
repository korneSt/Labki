package Zad6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Pietro extends Lokalizacja {

    Identyfikator i = new Identyfikator();
    Integer nrPietra=0;

    private String opis;
    private String nazwa;
    List<Pokoj> pokoje = new ArrayList<>();

    Pietro(String opis){
        this.opis = opis;
        nrPietra++;
        i.setNrPietro(nrPietra);
        //nrPietra = i.nrPietro;
    }

    String getOpis() {
        return opis + nrPietra;
    }

    Pietro(){}

    public void opis() {
        System.out.println(getOpis());
        for(Pokoj pok : pokoje) {
            pok.opis();
        }

    }
    void setPietro(String nazwa) {
        this.nazwa = nazwa;
    }


    void addPokojToList(Object o){
    pokoje.add((Pokoj) o);
    }

    void opisPietro() {
        for(Pokoj pok : pokoje) {
            pok.opis();
        }
    }


}
