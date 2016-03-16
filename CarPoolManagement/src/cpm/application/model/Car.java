package cpm.application.model;

import java.util.Scanner;

public class Car extends cpm.application.MainApp{
	
	private static int zaehler;
	private String vehicleType;
	public int seats;
	private String fuelType;
	private String transmission;
	private String pollutionBadge;
	private String trailerHitch;
	private String navigationSystem;

	public Car(String vehicleType, int seats, String fuelType, String transmission, String pollutionBadge, String trailerHitch2, String navigationSystem2) { // Konstruktor
		this.vehicleType = vehicleType;
		this.seats = seats;
		this.fuelType = fuelType;
		this.transmission = transmission;
		this.pollutionBadge = pollutionBadge;
		this.trailerHitch = trailerHitch2;
		this.navigationSystem = navigationSystem2;
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
