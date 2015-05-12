package Zad6;

/**
 * Created by Kornel on 2015-05-02.
 */
public class Identyfikator implements Comparable{
    Integer nrBudynek=0, nrPietro=0, nrPokoj=0;

    void setNrBudynek(Object o) {
        nrBudynek++;
    }

    void setNrPietro(int i) {
        this.nrPietro+=i;
    }

    void setNrPokoj() {
       this.nrPokoj++;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
