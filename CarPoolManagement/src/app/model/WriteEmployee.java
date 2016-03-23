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

public class WriteEmployee {

	public static void writeEmployee(String[] args) {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();

			// RootElement erzeugen
			Element rootElement = doc.createElement("Mitarbeiterliste");
			doc.appendChild(rootElement);

			// Fahrzeuge dem RootElement anhängen
			rootElement.appendChild(getMitarbeiter(doc, "1", "Dettmer", "Norman", "1234", "4567"));
			rootElement.appendChild(getMitarbeiter(doc, "2", "Klamm", "Andreas", "9876", "4321"));
			rootElement.appendChild(getMitarbeiter(doc, "3", "Riedel", "Christopher", "5678", "8765"));
			rootElement.appendChild(getMitarbeiter(doc, "4", "Bausmann", "Jonas", "0123", "3210"));
			rootElement.appendChild(getMitarbeiter(doc, "5", "Gimkiewicz", "Sebastian", "9999", "8888"));

			// als XML schreiben)
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("/CarPoolManagement/Employee.xml"));
			transformer.transform(source, result);

		}
		catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}
		catch (TransformerException tfe) {
			tfe.printStackTrace();
		}

	}

	private static Node getMitarbeiter(Document doc, String ID, String Nachname, String Vorname, String Mitarbeiternummer,
			String Fuehrerscheinnummer) {
		Element Mitarbeiter = doc.createElement("Mitarbeiter");
		Mitarbeiter.setAttribute("ID", ID);
		Mitarbeiter.appendChild(getMitarbeiterElements(doc, Mitarbeiter, "Nachname", Nachname));
		Mitarbeiter.appendChild(getMitarbeiterElements(doc, Mitarbeiter, "Vorname", Vorname));
		Mitarbeiter.appendChild(getMitarbeiterElements(doc, Mitarbeiter, "Mitarbeiternummer", Mitarbeiternummer));
		Mitarbeiter.appendChild(getMitarbeiterElements(doc, Mitarbeiter, "Fuehrerscheinnummer", Fuehrerscheinnummer));

		return Mitarbeiter;

	}

	private static Node getMitarbeiterElements(Document doc, Element element, String name, String value) {
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}

}
