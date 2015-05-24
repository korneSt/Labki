package inne;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;

/**
 * Created by Kornel on 2015-05-23.
 */
public class ProstaAnimacja extends Application{
    int x = 10;
    int y = 10;
    Group root = new Group();
    public static void main(String[] args) {

        launch(args);
    }

    private void rysuj() {

        for(int i=0; i<100; i++) {
            x++;
            y++;
            Circle circle = new Circle(x, y, 10, Color.GREEN);

            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.web("white", 0.16));
            circle.setStrokeWidth(4);
            try {
                Thread.sleep(10);
            }catch (Exception e) {}

            root.getChildren().add(circle);
        }


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int x=20;
        int y=20;

        Scene scene = new Scene(root, 800, 600, Color.WHITE);
        primaryStage.setScene(scene);

        Circle circle = new Circle(50, 50, 50, Color.GREEN);

        circle.setStrokeType(StrokeType.OUTSIDE);
        circle.setStroke(Color.web("white", 0.16));
        circle.setStrokeWidth(4);
        root.getChildren().addAll(circle);

        Timeline timeline = new Timeline();
            timeline.getKeyFrames().addAll(
                    new KeyFrame(Duration.ZERO, // set start position at 0
                            new KeyValue(circle.translateXProperty(), 10),
                            new KeyValue(circle.translateYProperty(), 10)
                    ),
                    new KeyFrame(new Duration(4000), // set end position at 40s
                            new KeyValue(circle.translateXProperty(), 150),
                            new KeyValue(circle.translateYProperty(), 150)
                    )
            );

// play 40s of animation
        timeline.play();


        //ProstaAnimacja animacja = new ProstaAnimacja();
        //animacja.rysuj();
        primaryStage.show();
    }

    class MojPanelRysunkowy  {

    }
}
