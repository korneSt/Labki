package Zad6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel on 2015-05-07.
 */
public class MainApp extends Application{

    private Stage primaryStage;
    private BorderPane rootLayout;
    List<Budynek> buildingDataList = new ArrayList<>();
     ObservableList<Budynek> buildingData = FXCollections.observableArrayList(buildingDataList);

    public MainApp() {
       buildingData.add(new Budynek(1));
        //buildingData.add(new Budynek(2));
    }

    public static void main(String[] args) {
        launch(args);

    }


    //zwraca dane z listy osob
    public ObservableList<Budynek> getBuildData() {
        return buildingData;
    }

    void startTest() {
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

    @Override
    public void start(Stage primaryStage) throws Exception {
        buildingDataList.add(new Budynek(1));
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Osiedle");

        initLayout();

        showBuildingOverview();
    }

    private void initLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);

            primaryStage.setScene(scene);
            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showBuildingOverview() {
        try {
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("BuildingOverview.fxml"));
            AnchorPane buildingOverView = loader.load();
            rootLayout.setCenter(buildingOverView);

            BuildingOverviewController controller = loader.getController();
            controller.setMainApp(this);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean showBuildingEditDialog(){
        try{
            //Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("BuildingEditDialog.fxml"));
            AnchorPane page = loader.load();

            //Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edytuj osobe");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            //Set the person into the controller.
            BuildingEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            //controller.setPerson(person);
            controller.setMainApp(this);
            //Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean showNewBuildingDialog(){
        try{
            //Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("NewBuildingDialog.fxml"));
            AnchorPane page = loader.load();

            //Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Dodaj Budynek");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            //Set the person into the controller.
            NewBuildingController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            //controller.setPerson(person);
            controller.setMainApp(this);
            //Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
