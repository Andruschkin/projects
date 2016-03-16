package application.model;

import application.Main;

public class Employee extends Main {
	
	private String firstname;
	private String lastname;
	public  int personalnumber;	
	private int licencenumber;

	public Employee(String firstname, String lastname, int pn, int ln){ //Konstruktor
		
		this.firstname=firstname;
		this.lastname = lastname;
		this.personalnumber=pn;
		this.licencenumber=ln;
	}
	
	public void set_firstname(String firstname){
		this.firstname=firstname;
	}
	public String get_firstname(){
		return this.firstname;
	}
	public void set_lastname(String lastname){
		this.lastname=lastname;
	}
	public String get_lastname(){
		return this.lastname;
	}		
	public void set_personalnumber(int pn){
		this.personalnumber= pn;
	}
	public int get_personalnumber(){
		return this.personalnumber;	
	}
	public void set_licencenumber(int ln){
		this.licencenumber= ln;
	}
	public int get_licencenumber(){
		return this.licencenumber;
	}
}