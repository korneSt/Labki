package Zad6;

/**
 * Created by Kornel on 2015-05-02.
 *
 * Moim identyfikatorem by³ obiekt typu (int budynek, int piêtro, int pokój). Przyk³adowo dla 2 piêtra 1 budynku - (1,2,0).
 * Potem ³atwo siê porównywa³o, czy to porównywanie dotyczy³o czym jest dany obiekt, czy mo¿e np. lokalizacje dwóch pokoi.
 *
 */
public class Identyfikator implements Comparable<Identyfikator> {
    private Integer nrBudynek = 0, nrPietro = 0, nrPokoj = 0;

    Identyfikator(int nrB, int nrPi, int nrPo) {
        nrB = nrBudynek;
        nrPi = nrPietro;
        nrPo = nrPokoj;
    }

    Identyfikator() {
    }


    void setNrBudynek(int nr) {
        nrBudynek = nr;
    }

    void setNrPietro(int nr) {
        nrPietro = nr;
    }

    void setNrPokoj(int nr) {
        nrPokoj = nr;
    }

    int getNrBudynek() {
        return nrBudynek;
    }

    int getNrPokoj() {
        return nrPokoj;
    }

    int getNrPietro() {
        return nrPietro;
    }

    @Override
    public int compareTo(Identyfikator tempID) throws IndexOutOfBoundsException {

        if (nrBudynek.equals( tempID.nrBudynek))
            return 1;
        if (nrBudynek < tempID.nrBudynek)
            return -1;
        if (nrBudynek > tempID.nrBudynek)
            return -1;
        if (nrBudynek < tempID.nrPietro)
            return -1;
        if (nrBudynek > tempID.nrPietro)
            return -1;
        if (nrBudynek < tempID.nrPokoj)
            return -1;
        if (nrBudynek > tempID.nrPokoj)
            return -1;
        return 0;
    }
}
