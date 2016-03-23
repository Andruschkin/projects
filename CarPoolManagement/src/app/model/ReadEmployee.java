package app.model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ReadEmployee {

	public static void readEmployee (String[] args) {
	      try {
	         File inputFile = new File("C:/Users/Basti/Desktop/Mitarbeiter.xml");

	         SAXBuilder saxBuilder = new SAXBuilder();
	         Document document = saxBuilder.build(inputFile);

	         System.out.println("Root element :" + document.getRootElement().getName());

	         Element classElement = document.getRootElement();

	         List<Element> fuhrparklist = classElement.getChildren("Mitarbeiter");
	         System.out.println("----------------------------");

	         for (int temp = 0; temp < fuhrparklist.size(); temp++) {    
	            Element supercarElement = fuhrparklist.get(temp);
	            System.out.println("\nCurrent Element :" + supercarElement.getName());
	            Attribute attribute =  supercarElement.getAttribute("ID");
	            
	            System.out.println("ID :                 " + attribute.getValue() );
	            System.out.println("Nachname :           "+ supercarElement.getChild("Nachname").getText());
	            System.out.println("Vorname:             "+ supercarElement.getChild("Vorname").getText());
	            System.out.println("Mitarbeiternummer:   "+ supercarElement.getChild("Mitarbeiternummer").getText());
	           // System.out.println("Cabrio:      "+ supercarElement.getChild("Cabrio").getText());	   
	            System.out.println("Fuehrerscheinnummer: "+ supercarElement.getChild("Fuehrerscheinnummer").getText());
	                   
	         }
	         
	      }catch(JDOMException e){
	         e.printStackTrace();
	      }catch(IOException ioe){
	         ioe.printStackTrace();
	      }
	   }

}

