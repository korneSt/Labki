package Zad6;

/**
 * Created by Kornel on 2015-05-31.
 */
public class TestLokalizacja {

    public static void main(String[] args) {

        Budynek a = new Budynek(1);

        Pietro pietro1 = new Pietro(1);
        Pietro pietro2 = new Pietro(2);
        Pietro pietro3 = new Pietro(3);
        Pietro pietro4 = new Pietro(4);

        a.addPietro(pietro1);
        a.addPietro(pietro2);
        a.addPietro(pietro3);
        a.addPietro(pietro4);

        pietro1.addPokoj(new Pokoj(1));
        pietro1.addPokoj(new Pokoj(2));
        pietro1.addPokoj(new Pokoj(3));


        Budynek b = new Budynek(2);

        Pietro p1 = new Pietro(2);
        Pietro p2 = new Pietro(4);
        Pietro p3 = new Pietro(6);
        Pietro p4 = new Pietro(7);

        b.addPietro(p1);
        b.addPietro(p2);
        b.addPietro(p3);
        b.addPietro(p4);

        p1.addPokoj(new Pokoj(1));
        p2.addPokoj(new Pokoj(2));
        p2.addPokoj(new Pokoj(3));
        p3.addPokoj(new Pokoj(4));
        p3.addPokoj(new Pokoj(5));
        p3.addPokoj(new Pokoj(6));

        System.out.println(a.opis());
        System.out.println(b.opis());

        Pietro p = (Pietro) a.getPietro().get(0);
        Pietro p11 = (Pietro) b.getPietro().get(0);
        System.out.println( p.getID().compareTo(p11.getID()));
    }
}
