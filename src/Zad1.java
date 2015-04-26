import java.math.BigDecimal;
/**
 * Created by Kornel on 2015-04-11.
 */
public class Zad1 {

    public static void main(String[] args){
        int a=1,b=1,c=1;
        double wynik,wynik1, delta;


//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);

        try{
            a = (int) Float.parseFloat(args[0]);
            b = (int) Float.parseFloat(args[1]);
            c = (int) Float.parseFloat(args[2]);

        }catch(NumberFormatException e){
            System.out.println("Blead: "+ e);
            System.exit(0);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Blad: " + e);
            System.exit(0);
        }
        //Scanner scanner = new Scanner(System.in);

        double wyOst, wyOst1;

        delta = Math.pow(b, 2) - 4*a*c;
        if (delta == 0){
            wynik = (b*(-1)/(2*a));
            wyOst=new BigDecimal(wynik).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println("Miejsce zerowe funkcji to: " +
                    String.valueOf(wyOst));
        }
        else if (delta >0){
            wynik = (b*(-1) + Math.sqrt(delta))/(2*a);
            wynik1 = (b*(-1) - Math.sqrt(delta))/(2*a);
            wyOst=new BigDecimal(wynik ).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
            wyOst1=new BigDecimal(wynik1).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println("Miejsca zerowe funkcji to: " +
                    String.valueOf(wyOst) +
                    ", " + String.valueOf(wyOst1));
        }
        else {
            System.out.println("Funkcja nie ma miejsc zerowych");
        }
    }
}
