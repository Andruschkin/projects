import java.util.ArrayList;
import java.util.List;

public class NewCar extends Car{
	public int i = 0;
	
	List<Car> cars = new ArrayList<Car>();

	Car car;

	
	public void CreateNewCar (ID, carLabel, licensePlate, vehicleType, seats, fuelType, transmission, pollutionBadge, trailerHitch, navigationSystem)
	{    

        // Hochzählen der Anzahl von Fahrzeugen
        i++;
					
		// Zuordnung der Inhalte von den Textfeldern zu den Attributen
        ID 					= i;
        carLabel 			= TextFieldLabel.getText();
        licensePlate 		= TextFieldLicensePlate.getText();
        vehicleType 		= SpinnerVehicleTypeNewVehicle.getText();
        seats 				= TextFieldSeats.getText();
        fuelType			= SpinnerFuelNewVehicle.getText();
        transmission		= SpinnerTransmissionNewVehicle.getText();
        pollutionBadge		= SpinnerPollutionBadgeNewVehicle.getText();
        
        if (CheckBoxTrailorHitchNewVehicle.IsSelected()){					// Wurde Checkbox ausgewählt wird Anhängerkupplung auf Y (Yes) gesetzt
        	trailerHitch = "Y";
        }
        else{																// Ansonsten wird Anhängerkupplung auf N (No) gesetzt
        	trailerHitch = "N";
        }
        
        if (CheckBoxNaviNewVehicle()){										// Wurde Checkbox ausgewählt wird Navi auf Y (Yes) gesetzt
        	navigationSystem = "Y";
        }
        else{																// Wurde Checkbox ausgewählt wird Navi auf N (No) gesetzt
        	navigationSystem = "N";
        }
          
        // Erstellung eines neuen Fahrzeugs
        Car car = new Car(carLabel, licensePlate, vehicleType, seats, fuelType, transmission, pollutionBadge, trailerHitch, navigationSystem);
        
        // Hinzufügen des Fahrzeugs zur Array-Liste
        Car.cars.add(car);
	}
}
	

