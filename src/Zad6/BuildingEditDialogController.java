package Zad6;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 *
 *
 * Created by Kornel on 2015-04-06.
 */
public class BuildingEditDialogController implements Initializable{

    private MainApp mainApp;
    @FXML
    private TextArea buildingTestArea;

    private Stage dialogStage;
    private Budynek budynek;
    private boolean okClicked = false;
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // mainApp.budynki.get(0).opis();
        System.out.println(mainApp.getBuildData().get(1).opisString());
        buildingTestArea.setText(mainApp.getBuildData().get(0).opisString());
        /**
         * Sets the stage of this dialog.
         *
         * @param dialogStage
         */
    }
    public void setDialogStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }

    /**
     * Returns true if user clicked OK, false othervise
     */
    public boolean isOkClicked(){
        return okClicked;
    }

    /**
     * Called when user clicks ok
     */
    @FXML
    private void handleOk(){
            okClicked = true;
            dialogStage.close();
    }

    /**
     * Called when user clicks cancel.
     */
    @FXML
    private void handleCancel(){
        dialogStage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(mainApp.getBuildData().get(0).opisString());

    }

    /**
     * Validates the user input in the text fields.
     *
     * @return true if input is valid
     */

}
















