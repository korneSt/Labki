import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

/**
 * Napisz program losujacy 1000 znakow i zapisz je do pliku, a nastepnie odczytaj pliku i wypisz na ekran.
 * Utworz dwie rozne pary procedur zapisujaco/odczytujacych, raz korzystajac z pakietu java.io a drugi raz z pakietu java.nio.
 * Porownaj szybkosc zapisu i odczytu, wynik wypisz na ekranie.
 */
public class Zad4 {
    private static long start;
    private static long stop;

    public static void main(String[] args) {
        Random rand = new Random();
        char[] tab = new char[1000];

        for(int i=0; i<tab.length; i++) {
            tab[i] = (char) (rand.nextInt(26) + 'a');
        }

        String s = new String(tab);

        try{
            System.out.println("Zapis IO (w milisekundach): " +  zapisIO(s) + "\n");
            System.out.println("Zapis NIO (w milisekundach): " +  zapisNIO(tab) + "\n");
            System.out.println("Odczyt IO (w milisekundach): " +  odczytIO() + "\n");
            System.out.println("Odczyt NIO (w milisekundach): " +  odczytNIO() + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public static long zapisIO(String s) throws FileNotFoundException {

        System.out.println("---Zapis z pakietu java.io---");

        start = System.currentTimeMillis();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))){
            writer.write(s, 0, s.length());
            writer.close();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        stop = System.currentTimeMillis();
        return stop-start;
    }

    public static long zapisNIO(char[] s) throws IOException {

        System.out.println("---Zapis z pakietu java.nio---");

        start = System.currentTimeMillis();

        RandomAccessFile aFile = new RandomAccessFile("test1.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(2048);
        for (char ch : s) {
            buf.put((byte) ch);
        }

        buf.flip();

        int bytesWritten = inChannel.write(buf); //zapisuje do pliku z bufora
        aFile.close();
        buf.clear();

        stop = System.currentTimeMillis();
        return stop-start;

    }

    public static long odczytIO() throws FileNotFoundException {

        System.out.println("---Odczyt z pakietu java.io---");

        start = System.currentTimeMillis();

        try (BufferedReader reader
                     = new BufferedReader(new FileReader("test.txt"))) {
            int line;
            while ((line = reader.read()) != -1) {
                System.out.print((char) line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        stop = System.currentTimeMillis();


        System.out.println("\n");

        return stop-start;
    }

    public static long odczytNIO() throws IOException {

        System.out.println("---Odczyt z pakietu java.nio---");

        start = System.currentTimeMillis();

        RandomAccessFile aFile = new RandomAccessFile("test1.txt", "rw");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(2048);

        int byteRead = inChannel.read(buf);
        buf.flip();
        while(buf.hasRemaining()){
            System.out.print((char) buf.get());
        }
        aFile.close();

        stop = System.currentTimeMillis();

        System.out.println("\n");
        return stop-start;
    }
}
