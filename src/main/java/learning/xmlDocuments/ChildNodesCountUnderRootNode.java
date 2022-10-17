package learning.xmlDocuments;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ChildNodesCountUnderRootNode {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// Representing the XML file
		File xmlFile = new File(System.getProperty("user.dir") + "\\xmlFiles\\employeedata.xml");
		// Steps to parse the XML file
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmlDoc = docBuilder.parse(xmlFile);
		// Retrieving the root element of the xml file
		Element rootElement = xmlDoc.getDocumentElement();
		NodeList childNodes = rootElement.getChildNodes();
		int childCountUnderRootElement = childNodes.getLength();
		System.out.println("Count of children nodes under root element is: " + childCountUnderRootElement);
	}

}
