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
	            Element rootElement = doc.createElement("Fuhrpark");
	            doc.appendChild(rootElement);
	            
	     // Fahrzeuge dem RootElement anhängen       
	            rootElement.appendChild(getFuhrpark(doc, "1", "BMW","4er", "DarkBlackMetallic", "M-Paket"));
	            rootElement.appendChild(getFuhrpark(doc, "2", "Mercedes","CLA", "DarkBlackMetallic", "M-Paket"));
	            rootElement.appendChild(getFuhrpark(doc, "3", "Audi","A7", "DarkBlackMetallic", "M-Paket"));
	            rootElement.appendChild(getFuhrpark(doc, "4", "Volkswagen","Golf R", "DarkBlackMetallic", "M-Paket"));
	            rootElement.appendChild(getFuhrpark(doc, "5", "Porsche","911 Turbo S", "DarkBlackMetallic", "M-Paket"));
	 
	     // als XML schreiben)
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource source = new DOMSource(doc);
	            StreamResult result = new StreamResult(new File("C:/Users/Basti/Desktop/Car.xml")); 
	            transformer.transform(source, result);
	 
	        } 
		 catch (ParserConfigurationException pce) {
	            pce.printStackTrace();
	        } 
		 catch (TransformerException tfe) {
	            tfe.printStackTrace();
	        }

	}

	private static Node getFuhrpark(Document doc, String ID, String Marke, String Modell, String Farbe, String Ausstattung)
	{
		Element Pkw = doc.createElement("Pkw");
		Pkw.setAttribute("ID", ID); 
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "Marke", Marke));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "Modell", Modell));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "Farbe", Farbe));
		Pkw.appendChild(getFuhrparkElements(doc, Pkw, "Ausstattung", Ausstattung));
				
		return Pkw;

	}

	private static Node getFuhrparkElements( Document doc, Element element, String name, String value)
	{
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		
		return node; 
	}
}