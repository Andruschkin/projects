package application;
	
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Car;
import model.Employee;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initrootLayout();

        showOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initrootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/rootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Overview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
		launch(args);
		
		String firstname = einlesenText("Vorname");
		String lastname = einlesenText("Nachname");
		int personalnumber = einlesenZahl("Personalnummer");
		int licencenumber = einlesenZahl("Führerscheinnummer");
		
		String vehicleType = einlesenText("VT");
		int seats = einlesenZahl("Anzahl Sitze");
		String fuelType = einlesenText("FT");
		String transmission = einlesenText("transm");
		String pollutionBadge = einlesenText("PB");
		String trailerHitch = einlesenText("TH"); 
		String navigationSystem = einlesenText("NS");

		//Aufruf des Konstruktors
		Employee meinFahrzeug= new Employee(firstname, lastname, personalnumber, licencenumber);
		//Fahrzeug meinFahrzeug= new Fahrzeug(5, "rot", 220, 5, 5);
		Employee deinFahrzeug= new Employee ("Hans", "Dieter", 180452 , 15236970);
		
		Car meinKumpel = new Car(vehicleType, seats, fuelType, transmission, pollutionBadge, trailerHitch, navigationSystem);
		Car deinKumpel = new Car("Limo", 4, "Benzin", "Manual", "Grün", "Ja", "Ja");
		
		//Ausgabe
		System.out.println("Vorname lautet " + meinFahrzeug.get_firstname());	
		System.out.println("nachname " + meinFahrzeug.get_lastname());	
		System.out.println("personalnr. " + meinFahrzeug.get_personalnumber());	
		System.out.println("Füherscheinnr. " + meinFahrzeug.get_licencenumber());
		
		System.out.println("fahrzeugtyp " + meinKumpel.get_vehicleType());
		System.out.println("sitze " + meinKumpel.get_seats());
		System.out.println("Kraftstoff " + meinKumpel.get_fuelType());
		System.out.println("Getriebe " + meinKumpel.get_transmission());
		System.out.println("Plakette " + meinKumpel.get_pollutionBadge());
		System.out.println("Anhänger " + meinKumpel.get_trailerHitch());
		System.out.println("Navi " + meinKumpel.get_navigationSystem());
	
		meinFahrzeug.set_firstname("Kollegah"); //Änderung des y Position Wertes  zu Testzwecken- für den "echten! Betrieb nicht sinnvoll!!!
		
		meinKumpel.set_transmission("Automatik");
		
		System.out.println("firstname " + meinFahrzeug.get_firstname()); //Ausgabe y Wert
		System.out.println("Getriebe " + meinKumpel.get_transmission());
	}
	
	public static String einlesenText(String eingabewert) {
		String inData;
	    Scanner scan = new Scanner( System.in );

	    System.out.println(eingabewert);
	    inData = scan.nextLine();
	    return inData;
	  }
	
	public static int einlesenZahl(String eingabewert) {
		String inData;
	    Scanner scan = new Scanner( System.in );

	    System.out.println(eingabewert);
	    inData = scan.nextLine();
	    return Integer.parseInt(inData);
	  }
}