package Zad6;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kornel on 2015-05-21.
 */
public class RootLayoutController {

    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView imageView3;
    @FXML
    private HBox buydnekHbox;

    Image img = new Image("Zad6/building1.png");
    private MainApp mainApp;

    List<ImageView> budynkiObraz = new ArrayList<>();
    ObservableList<ImageView> observaleListGrafiki = FXCollections.observableList(budynkiObraz);



    @FXML
    private void initialize() {
        // mainApp.budynki.get(0).opis();

        /**
         * Sets the stage of this dialog.
         *
         * @param dialogStage
         */
    }



    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    public void handleNew(ActionEvent actionEvent) {
        //mainApp.budynki.add(new Budynek(1));
        //budynkiObraz.get(2).setImage(mainApp.budynki.get(0).img);
        mainApp.showNewBuildingDialog();
        ObservableList<Budynek> observableListBudynek = FXCollections.observableList(mainApp.getBuildData());
        observableListBudynek.addListener((ListChangeListener) change -> {
            System.out.println("Detected a change! ");
            imageView1.setImage(mainApp.getBuildData().get(0).img);
        });


    }

    public void handleMouseClick(Event event) {

        mainApp.showBuildingEditDialog();
    }
}
