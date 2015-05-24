package Zad6;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



/**
 *
 *
 * Created by Kornel on 2015-04-06.
 */
public class NewBuildingController {

    private MainApp mainApp;
    @FXML
    private TextArea buildinTestArea;

    @FXML
    private TextField budynekTextField;
    @FXML
    private TextField pietroTextField;
    @FXML
    private TextField pokojTextField;

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
        //buildinTestArea.setText("");
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
        getValue();
        dialogStage.close();
    }

    private void getValue() {
        Budynek temp = new Budynek(Integer.parseInt(budynekTextField.getText()));

        //if (pietroTextField.getText() != "") {
            temp.addPietro(Integer.parseInt(pietroTextField.getText()));
        //}
       // if (pokojTextField.getText() != "") {
            temp.pie(0).addPokoj(Integer.parseInt(pokojTextField.getText()));
        //}
        mainApp.getBuildData().add(temp);
        System.out.println(mainApp.getBuildData().get(0).opisString());
    }

    /**
     * Called when user clicks cancel.
     */
    @FXML
    private void handleCancel(){
        dialogStage.close();
    }

    /**
     * Validates the user input in the text fields.
     *
     * @return true if input is valid
     */

}
















