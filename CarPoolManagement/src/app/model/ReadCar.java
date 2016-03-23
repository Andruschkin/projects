package app.model;
package blubbi;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class ReadCar{
 
	public static void readCar (String[] args) {
	      try {
	         File inputFile = new File("C:/Users/Basti/Desktop/Car.xml");

	         SAXBuilder saxBuilder = new SAXBuilder();
	         Document document = saxBuilder.build(inputFile);

	         System.out.println("Root element :" + document.getRootElement().getName());

	         Element classElement = document.getRootElement();

	         List<Element> fuhrparklist = classElement.getChildren("Pkw");
	         System.out.println("----------------------------");

	         for (int temp = 0; temp < fuhrparklist.size(); temp++) {    
	            Element supercarElement = fuhrparklist.get(temp);
	            System.out.println("\nCurrent Element :" + supercarElement.getName());
	            Attribute attribute =  supercarElement.getAttribute("ID");
	            
	            System.out.println("ID : " + attribute.getValue() );
	            System.out.println("Marke :      "+ supercarElement.getChild("Marke").getText());
	            System.out.println("Modell:      "+ supercarElement.getChild("Modell").getText());
	            System.out.println("Farbe:       "+ supercarElement.getChild("Farbe").getText());
	           // System.out.println("Cabrio:      "+ supercarElement.getChild("Cabrio").getText());	   
	            System.out.println("Ausstattung: "+ supercarElement.getChild("Ausstattung").getText());
	                   
	         }
	         
	      }catch(JDOMException e){
	         e.printStackTrace();
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }
	   }

}