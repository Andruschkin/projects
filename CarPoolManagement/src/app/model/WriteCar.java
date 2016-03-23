package app.model;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class WriteCar {

	public static void write(String[] args) {

		 try {
	            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	            Document doc = docBuilder.newDocument();

	      // RootElement erzeugen
	            Element rootElement = doc.createElement("Carpool");
	            doc.appendChild(rootElement);

	     // Fahrzeuge dem RootElement anhängen
	            rootElement.appendChild(getFuhrpark(doc, "1", "BMW","fghjklöä", "Kombi", "5", "Petrol", "Manual", "Grün", "Y", "N" ));

	     // als XML schreiben)
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource source = new DOMSource(doc);
	            StreamResult result = new StreamResult(new File("/CarPoolManagement/Car.xml"));
	            transformer.transform(source, result);

	        }
		 catch (ParserConfigurationException pce) {
	            pce.printStackTrace();
	        }
		 catch (TransformerException tfe) {
	            tfe.printStackTrace();
	        }

	}

	private static Node getFuhrpark(Document doc, String ID, String carLabel, String licensePlate, String vehicleType,String seats, String fuelType, String transmission, String pollutionBadge, String trailerHitch, String navigationSystem)
	{
		Element Pkw = doc.createElement("Car");
		Pkw.setAttribute("ID", ID);
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "carLabel", carLabel));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "licensePlate", licensePlate));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "vehicleType", vehicleType));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "seats" , seats));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "fuelType", fuelType));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "transmission", transmission));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "pollutionBadge", pollutionBadge));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "trailerHitch", trailerHitch));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "navigationSystem", navigationSystem));

		return Pkw;
	}

	private static Node getFuhrparkElements( Document doc, Element element, String name, String value)
	{
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}
}