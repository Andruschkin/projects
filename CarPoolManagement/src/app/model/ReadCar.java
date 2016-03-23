package app.model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class Lesen{
 
	public static void lesen (String[] args) {
	      try {
	         File inputFile = new File("C:/Users/Basti/Desktop/Car.xml");

	         SAXBuilder saxBuilder = new SAXBuilder();
	         Document document = saxBuilder.build(inputFile);

	         System.out.println("Root element :" + document.getRootElement().getName());

	         Element classElement = document.getRootElement();

	         List<Element> fuhrparklist = classElement.getChildren("Car");
	         System.out.println("----------------------------");

	         for (int temp = 0; temp < fuhrparklist.size(); temp++) {    
	            Element supercarElement = fuhrparklist.get(temp);
	            System.out.println("\nCurrent Element :" + supercarElement.getName());
	            Attribute attribute =  supercarElement.getAttribute("ID");
	            
	            System.out.println("ID :                " + attribute.getValue() );
	            System.out.println("Marke :             "+ supercarElement.getChild("carLabel").getText());
	            System.out.println("Kennzeichen:        "+ supercarElement.getChild("licensePlate").getText());
	            System.out.println("Fahrzeugart:        "+ supercarElement.getChild("vehicleType").getText());
	            System.out.println("Anzahl Sitze:       "+ supercarElement.getChild("seats").getText());
	            System.out.println("Kraftstoffart:      "+ supercarElement.getChild("fuelType").getText());
	            System.out.println("Getriebe:           "+ supercarElement.getChild("transmission").getText());
	            System.out.println("Umweltplakette:     "+ supercarElement.getChild("pollutionBadge").getText());
	            System.out.println("Anhängerkupplung:   "+ supercarElement.getChild("trailerHitch").getText());
	            System.out.println("Navigationssystem:  "+ supercarElement.getChild("navigationSystem").getText());
	 	              
	         }
	         
	      }catch(JDOMException e){
	         e.printStackTrace();
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }
	   }

}