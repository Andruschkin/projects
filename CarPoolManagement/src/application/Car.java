package application;
import java.util.Scanner;
public class Car {
	private static int zaehler;
	private String vehicleType;
	public int seats;
	private String fuelType;
	private String transmission;
	private String pollutionBadge;
	private boolean trailerHitch;
	private boolean navigationSystem;
	private int i;

	protected Car(String vehicleType, int seats, String fuelType, String transmission, String pollutionBadge, boolean trailerHitch, boolean navigationSystem) { // Konstruktor
		this.vehicleType = vehicleType;
		this.seats = seats;
		this.fuelType = fuelType;
		this.transmission = transmission;
		this.pollutionBadge = pollutionBadge;
		this.trailerHitch = trailerHitch;
		this.navigationSystem = navigationSystem;
	}
	
	public void set_vehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String get_vehicleType() {
		return this.vehicleType;
	}

	public void set_seats(int seats) {
		this.seats = seats;
	}

	public int get_seats() {
		return this.seats;
	}

	public void set_fuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String get_fuelType() {
		return this.fuelType;
	}

	public void set_transmission(String transmission) {
		this.transmission = transmission;
	}

	public String get_transmission() {
		return this.transmission;
	}

	public void set_pollutionBadge(String pollutionBadge) {
		this.pollutionBadge = pollutionBadge;
	}

	public String get_pollutionBadge() {
		return this.pollutionBadge;
	}

	public void set_trailerHitch(boolean trailerHitch) {
		this.trailerHitch = trailerHitch;
	}

	public boolean get_trailerHitch() {
		return this.trailerHitch;
	}
	
	public void set_navigationSystem(boolean navigationSystem) {
		this.navigationSystem = navigationSystem;
	}

	public boolean get_navigationSystem() {
		return this.navigationSystem;
	}
}
