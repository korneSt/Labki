package Zad6;

/**
 * Napisz abstrakcyjna klase Lokalizacja a nastepnie dziedziczace z niej klasy Budynek, Pietro, Pokoj.
 * Klasa lokalizacja ma abstrakcyjna metode opis, ktora opisuje dana Lokalizacje i wwszystkie jej podLokalizacje.
 * Zaproponuj takie pola i metody klas Budynek, Pietro, Pokoj by zapewnialy one mozliwosc utworzenia trojstopniowej
 * struktury hierarchicznej (Budynek -> Pietra (przypisane do budynku) -> Pokoje (przypisane do pietra)).
 * Kazdy obiekt klasy Lokalizacja powinien posiadac pole klasy Identyfikator. Klasa Identyfikator posiada 3 pola
 * (numer budynku, numer pietra, numer pokoju) i implementuje interfejs Comparable.
 * Zapewnij by w trakcie tworzenia hierarchicznej struktury zapewnione bylo automatyczne tworzenie identyfikatorow.
 * W oparciu o klase Identyfikator napisz metody sprawdzajace relacje pomiedzy dwoma dowolnymi lokalizacjami.
 */

public abstract class Lokalizacja {

    public abstract void opis();
    Identyfikator id = new Identyfikator();
}
