package Zad6;

/**
 * Created by Kornel on 2015-05-07.
 */
public class TestLokalizacja {
    public static void main(String[] args) {

        Budynek b1 = new Budynek("moj dom");
        Budynek b2 = new Budynek("wiezowiec");

        b1.addPietro("pierwsze");
        b1.addPietro("drugie");
        b1.opis();

        b2.addPietro("parter");
        b2.addPietro("poddasze");
        b2.addPietro("3");
        b1.addsPokoj("parter");
        b2.addsPokoj("parter");
        b2.addsPokoj("parter");
        b2.addsPokoj("poddasze");
        //b2.opis();

        b2.pokojeNaPietrze("parter");
    }
}
