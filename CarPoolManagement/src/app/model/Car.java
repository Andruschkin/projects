package app.model;

public class Car {

	private String carLabel;
	private String licensePlate;
	private String vehicleType;
	public int seats;
	private String fuelType;
	private String transmission;
	private String pollutionBadge;
	private String trailerHitch;
	private String navigationSystem;

	// Konstruktor
	public Car(String carLabel, String licensePlate, String vehicleType, int seats, String fuelType, String transmission, String pollutionBadge, String trailerHitch, String navigationSystem) {
		this.carLabel = carLabel;
		this.licensePlate = licensePlate;
		this.vehicleType = vehicleType;
		this.seats = seats;
		this.fuelType = fuelType;
		this.transmission = transmission;
		this.pollutionBadge = pollutionBadge;
		this.trailerHitch = trailerHitch;
		this.navigationSystem = navigationSystem;
	}

	public void set_carLabel(String carLabel) {
		this.carLabel = carLabel;
	}
	public String get_carLabel() {
		return this.carLabel;
	}
	public void set_licensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String get_licensePlate() {
		return this.licensePlate;
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
	public void set_trailerHitch(String trailerHitch) {
		this.trailerHitch = trailerHitch;
	}
	public String get_trailerHitch() {
		return this.trailerHitch;
	}
	public void set_navigationSystem(String navigationSystem) {
		this.navigationSystem = navigationSystem;
	}
	public String get_navigationSystem() {
		return this.navigationSystem;
	}
}