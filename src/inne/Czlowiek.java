package inne;

public class Czlowiek implements Comparable {

    private char plec;
    private String imie;
    private String nazwisko;

    public Czlowiek(char plec, String imie, String nazwisko) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return nazwisko + " " + imie+" (" + plec +")" ;
    }

    @Override
    public int compareTo(Object o) {
        Czlowiek c = (Czlowiek) o;
        int porownaneNazwiska = nazwisko.compareTo(c.nazwisko);

        if(porownaneNazwiska == 0) {
            return imie.compareTo(c.imie);
        }
        else {
            return porownaneNazwiska;
        }
    }
}