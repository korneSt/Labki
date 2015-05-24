package MusicApp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MusicApp extends Application implements ControllerEventListener {
    static AnchorPane root = new AnchorPane();
    static Group rectangleGroup;
    static Scene scene;
    Stage primaryStage;

    public MusicApp() {
    }

    public static void main(String[] args) {
        System.out.println("main");
        launch(args);
    }

    public void play() {
        System.out.println("graj");

        try {
            Sequencer e = MidiSystem.getSequencer();
            e.open();
            int[] zdarzeniaObslugiwane = new int[]{127};
            e.addControllerEventListener(this, zdarzeniaObslugiwane);
            Sequence sequence = new Sequence(0.0F, 4);
            Track track = sequence.createTrack();
            boolean r = false;

            for(int i = 5; i < 61; i += 4) {
                int r1 = (int)(Math.random() * 50.0D + 1.0D);
                track.add(tworzZdarzenie(144, 1, r1, 100, i));
                track.add(tworzZdarzenie(176, 1, 127, 0, i));
                track.add(tworzZdarzenie(128, 1, r1, 100, i + 2));
            }

            e.setSequence(sequence);
            e.setTempoInBPM(220.0F);
            e.start();
        } catch (MidiUnavailableException var7) {
            var7.printStackTrace();
        } catch (InvalidMidiDataException var8) {
            var8.printStackTrace();
        }

    }

    public static MidiEvent tworzZdarzenie(int plc, int kanal, int jeden, int dwa, int takt) {
        ShortMessage a = new ShortMessage();
        MidiEvent zdarzenie = null;

        try {
            a.setMessage(plc, kanal, jeden, dwa);
            zdarzenie = new MidiEvent(a, (long)takt);
        } catch (InvalidMidiDataException var8) {
            var8.printStackTrace();
        }

        return zdarzenie;
    }

    public void start(Stage primaryStage) throws Exception {
        Platform.setImplicitExit(false);
        this.primaryStage = primaryStage;
        System.out.println("start");
        this.initLayout();
        this.play();
    }

    private void initLayout() {
        scene = new Scene(root, 800.0D, 600.0D);
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
    }

    public void controlChange(ShortMessage event) {
        Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5D);
        Platform.runLater(() -> {
            Rectangle r = new Rectangle(Math.random() * 600.0D, Math.random() * 600.0D, Math.random() * 400.0D, Math.random() * 200.0D);
            r.setFill(color);
            root.getChildren().addAll(new Node[]{r});
        });
    }
}
