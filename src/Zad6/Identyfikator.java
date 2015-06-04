package Zad6;

/**
 * Created by Kornel on 2015-05-02.
 *
 */
public class Identyfikator implements Comparable<Identyfikator>{

    private int nrBudynku;
    private int nrPietra;
    private int nrPokoju;


    public Identyfikator(int nrBudynku, int nrPietra, int nrPokoju) {
        this.nrBudynku = nrBudynku;
        this.nrPietra = nrPietra;
        this.nrPokoju = nrPokoju;
    }

    public Identyfikator(int nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public int getNrBudynku() {
        return nrBudynku;
    }

    public void setNrBudynku(int nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public int getNrPietra() {
        return nrPietra;
    }

    public void setNrPietra(int nrPietra) {
        this.nrPietra = nrPietra;
    }

    public int getNrPokoju() {
        return nrPokoju;
    }

    public void setNrPokoju(int nrPokoju) {
        this.nrPokoju = nrPokoju;
    }


    @Override
    public String toString() {

        return "Identyfikator [nrBudynku=" + nrBudynku + ", nrPietra=" + nrPietra + ", nrPokoju=" + nrPokoju + "]";
    }

    @Override
    public int compareTo(Identyfikator o) {
        if (this.nrBudynku<o.nrBudynku) {
            return -1;
        }
        if (this.nrBudynku>o.nrBudynku) {
            return 1;
        }
        if (this.nrPietra>o.nrPietra) {
            return 1;
        }
        if (this.nrPietra<o.nrPietra) {
            return -1;
        }
        if (this.nrPokoju>o.nrPokoju) {
            return 1;
        }
        if (this.nrPokoju<o.nrPokoju) {
            return -1;
        }
        return 0;
    }
}

