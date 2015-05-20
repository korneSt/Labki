package Zad6;

/**
 * Created by Kornel on 2015-05-07.
 */
public class TestLokalizacja {
    public static void main(String[] args) {

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
        try {
            System.out.println(budynek1.pie(1).id.compareTo(budynek2.pie(3).id));
        } catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.print("\nBrak takiego numeru\n");
        }
    }
}
