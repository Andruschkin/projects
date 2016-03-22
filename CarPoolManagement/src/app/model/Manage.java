package app.model;

import java.util.Scanner;

public class Manage {

	public static void manage() {

//		class BSTNode<E extends Comparable<E>> {
//			private E element = null;
//			private BSTNode<E> left = null;
//			private BSTNode<E> right = null;
//
//			BSTNode() {
//			}
//
//			public BSTNode(E element, BSTNode<E> left, BSTNode<E> right) {
//				this.element = element;
//				this.left = left;
//				this.right = right;
//			}
//			// ... Zugriffsmethoden etc.
//		}
//		// class BSTNode
//		BSTNode<E> root;

//			// Hinzufügen eines neuen Mitarbeiters
//			String firstname = einlesenText("Vorname");
//			String lastname = einlesenText("Nachname");
//			int personalnumber = einlesenZahl("Personalnummer");
//			int licencenumber = einlesenZahl("Führerscheinnummer");
//
//			// Hinzufügen eines neuen Autos
//			String carLabel = einlesenText("Bezeichnung");
//			String licensePlate = einlesenText("Kennzeichen");
//			String vehicleType = einlesenText("Fahrzeugart");
//			int seats = einlesenZahl("Anzahl Sitze");
//			String fuelType = einlesenText("Kraftstoffart");
//			String transmission = einlesenText("Getriebe");
//			String pollutionBadge = einlesenText("Umweltplakette");
//			String trailerHitch = einlesenText("Anhängerkupplung");
//			String navigationSystem = einlesenText("Navigationssystem");

			// Beispiel Employee a = new Employee(firstname, lastname, personalnumber, licencenumber);
			// Erzeugen eines Mitarbeiters
			Employee boss = new Employee("Andreas", "Klamm", 12, 34);

			// Beispiel Car nullnullnull = new Car(carLabel, licensePlate, vehicleType, seats, fuelType, transmission, pollutionBadge, trailerHitch, navigationSystem);
			//Hinzufügen von Standardautos
			Car car001 = new Car("BMW 3er 320d", "GF CT 001", "Limousine", 5, "Diesel", "Manual", "Schwarz", "Nein", "Ja");
			Car car002 = new Car("BMW 5er 520d", "GF CT 002", "Touring", 5, "Diesel", "Manual", "Schwarz", "Ja", "Ja");
			Car car003 = new Car("BMW 3er 316i", "GF CT 003", "Limousine", 5, "Benzin", "Manual", "Schwarz", "Nein", "Ja");

			// Ausgabe des Arbeiters in der Konsole
			System.out.println("Vorname "+boss.get_firstname());
			System.out.println("Nachname "+boss.get_lastname());
			System.out.println("Personalnummer "+boss.get_personalnumber());
			System.out.println("Füherscheinnummer "+boss.get_licencenumber() + "\n");

			// Ausgabe von Autos
			System.out.println("Bezeichnung "+car001.get_carLabel());
			System.out.println("Kennzeichen "+car001.get_licensePlate());
			System.out.println("Fahrzeugtyp "+car001.get_vehicleType());
			System.out.println("Anzahl Sitze "+car001.get_seats());
			System.out.println("Kraftstoff "+car001.get_fuelType());
			System.out.println("Getriebe "+car001.get_transmission());
			System.out.println("Umweltplakette "+car001.get_pollutionBadge());
			System.out.println("Anhängerkupplung "+car001.get_trailerHitch());
			System.out.println("Navigationssystem "+car001.get_navigationSystem() + "\n");

			System.out.println("Bezeichnung "+car002.get_carLabel());
			System.out.println("Kennzeichen "+car002.get_licensePlate());
			System.out.println("Fahrzeugtyp "+car002.get_vehicleType());
			System.out.println("Anzahl Sitze "+car002.get_seats());
			System.out.println("Kraftstoff "+car002.get_fuelType());
			System.out.println("Getriebe "+car002.get_transmission());
			System.out.println("Umweltplakette "+car002.get_pollutionBadge());
			System.out.println("Anhängerkupplung "+car002.get_trailerHitch());
			System.out.println("Navigationssystem "+car002.get_navigationSystem() + "\n");

			System.out.println("Bezeichnung "+car003.get_carLabel());
			System.out.println("Kennzeichen "+car003.get_licensePlate());
			System.out.println("Fahrzeugtyp "+car003.get_vehicleType());
			System.out.println("Anzahl Sitze "+car003.get_seats());
			System.out.println("Kraftstoff "+car003.get_fuelType());
			System.out.println("Getriebe "+car003.get_transmission());
			System.out.println("Umweltplakette "+car003.get_pollutionBadge());
			System.out.println("Anhängerkupplung "+car003.get_trailerHitch());
			System.out.println("Navigationssystem "+car003.get_navigationSystem() + "\n");

//			meinFahrzeug.set_firstname("Andreas");
		// Nachträgliches ändern von Attributen
//			meinKumpel.set_transmission("Automatik");

		}

			// Funktion zum einlesen von Strings
			public static String einlesenText(String eingabewert) {
				String inData;
				Scanner scan = new Scanner(System.in);

				System.out.println(eingabewert);
				inData = scan.nextLine();
				return inData;
			}

			// Funktion zum einlesen von Zahlen
			public static int einlesenZahl(String eingabewert) {
				String inData;
				Scanner scan = new Scanner(System.in);

				System.out.println(eingabewert);
				inData = scan.nextLine();
				return Integer.parseInt(inData);
			}

		}
