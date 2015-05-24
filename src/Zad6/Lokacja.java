package Zad6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-21.
 */
public class Lokacja {

    List<Lokacja> lokacja = new ArrayList<>();

    Lokacja() {
        Budynek budynek1 = new Budynek(1);
        budynek1.addPietro(1);
        budynek1.addPietro(3);
        budynek1.pie(0).addPokoj(3);
        budynek1.pie(0).addPokoj(5);

        //budynek1.getPietro().

        budynek1.opis();
        Budynek budynek2 = new Budynek(2);
        budynek2.addPietro(1);
        budynek2.addPietro(3);
        budynek2.pie(0).addPokoj(3);
        budynek2.pie(0).addPokoj(5);

        budynek2.opis();

    }
}
