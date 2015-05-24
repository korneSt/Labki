package inne;

import javax.sound.midi.*;
import java.util.Scanner;

/**
 * Created by Kornel on 2015-05-23.
 */
public class Sound {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj instrument (0 - 127)");
            int instrument = scanner.nextInt();

            System.out.println("Podaj nute (0 - 127)");
            int nuta = scanner.nextInt();

            Sound sound = new Sound();
            sound.graj(instrument, nuta);
        }
    }

    private void graj(int instrument, int nuta) {
        try{
            Sequencer sekwenser = MidiSystem.getSequencer();
            sekwenser.open();

            Sequence sekw = new Sequence(Sequence.PPQ, 4);

            Track sciezka = sekw.createTrack();

            MidiEvent zdarzenie = null;

            ShortMessage pierwszy = new ShortMessage();
            //(typ komunikatu, kanal, nuta, szybkosc)
            pierwszy.setMessage(192, 1, instrument, 0); //144 - pocztaek nuty, 128 - note OFF, 192 - zmiana infstrumentu
            MidiEvent zmienInstrument = new MidiEvent(pierwszy, 1);
            sciezka.add(zmienInstrument);

            ShortMessage a = new ShortMessage();
            //(typ komunikatu, kanal, nuta, szybkosc)
            a.setMessage(144, 1, nuta, 100); //144 - pocztaek nuty, 128 - note OFF
            MidiEvent nutaP = new MidiEvent(a, 1);
            sciezka.add(nutaP);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent nutaK = new MidiEvent(b, 16);
            sciezka.add(nutaK);

            sekwenser.setSequence(sekw);
            sekwenser.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
