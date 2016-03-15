package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
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