package app.view;

import app.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class OverviewController {
	
	@FXML
    private TextField TextFieldLabel;
	
	@FXML
    private TextField TextFieldLicensePlate;
	
	@FXML
    private Spinner SpinnerVehicleTypeNewVehicle;
	
	@FXML
    private TextField TextFieldSeats;
	
	@FXML
    private Spinner SpinnerFuelNewVehicle;
	
	@FXML
    private Spinner SpinnerTransmissionNewVehicle;
	
	@FXML
    private Spinner SpinnerPollutionBadgeNewVehicle;
	
	@FXML
    private CheckBox CheckBoxTrailorHitchNewVehicle;
	
	@FXML
    private CheckBox CheckBoxNaviNewVehicle;
	
	@FXML
    private Button ButtonSaveNewVehicle;

    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public OverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        //personTable.setItems(mainApp.getPersonData());
    }
    
    /**
     * Called when the user clicks on the ButtonSaveNewVehicle button.
     */
    @FXML
    private void handleSaveNewVehicle() {
    	String Label = "", LicensePlate = "";
    	int Seats = 0;
    	
        Label = TextFieldLabel.getText();
        LicensePlate = TextFieldLicensePlate.getText();
        Seats = Integer.parseInt(TextFieldSeats.getText());
        
    }
}
