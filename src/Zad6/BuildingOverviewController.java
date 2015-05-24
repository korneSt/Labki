package Zad6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


/**
 * Created by Kornel on 2015-05-21.
 */
public class BuildingOverviewController implements Initializable{

   // public HBox budynekHBox;
    private MainApp mainApp;

    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView imageView3;
    @FXML
    private HBox budynekHBox;

    Image image = new Image("Zad6/building.png");

    List<ImageView> buildingsImageList  = new ArrayList<>();
    Image img = new Image("Zad6/building1.png");


    List<ImageView> budynkiObraz = new ArrayList<>();
    ObservableList<ImageView> observaleListGrafiki = FXCollections.observableList(budynkiObraz);



    @FXML
    private void initialize() {
        //for (Budynek p : mainApp.getBuildData()) {
            //buildingsImageList.add(new ImageView("Zad6/building.png"));
        //for (ImageView i : buildingsImageList)
           // buydnekHbox.getChildren().addAll(new ImageView("Zad6/building.png"));
        //}
       // imageView1.setImage(image);
    }



    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }


    public void handleMouseClick(Event event) {

        mainApp.showBuildingEditDialog();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //System.out.println(mainApp.buildingData.get(0));
       // for (Budynek p : mainApp.getBuildData()) {
           // buildingsImageList.add(new ImageView("Zad6/building.png"));
            //for (ImageView i : buildingsImageList)
            // buydnekHbox.getChildren().addAll(new ImageView("Zad6/building.png"));
            //}
        ImageView image = new ImageView("Zad6/building.png");
        budynekHBox.getChildren().addAll(image);
        image.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mainApp.showBuildingEditDialog();
            }
        });
            //imageView1.setImage(image);
    }
}
