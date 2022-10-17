package learning.xmlDocuments;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class ReadRootNodeName {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File xmlFile = new File(System.getProperty("user.dir") + "\\xmlFiles\\employeedata.xml");
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmlDoc = docBuilder.parse(xmlFile);
		String rootName = xmlDoc.getDocumentElement().getNodeName();
		System.out.println(rootName);
		short nodeNumber = xmlDoc.getDocumentElement().getNodeType();
		System.out.println("Number representing the " + rootName + " element node is: " + nodeNumber);
		if (nodeNumber == Node.ELEMENT_NODE) {
			System.out.println("Root element is an ELEMENT NODE");
		} else if (nodeNumber == Node.DOCUMENT_NODE) {
			System.out.println("Root element is a DOCUMENT NODE");
		} else if (nodeNumber == Node.ATTRIBUTE_NODE) {
			System.out.println("Root element is an ATTRIBUTE NODE");
		} else if (nodeNumber == Node.TEXT_NODE) {
			System.out.println("Root element is a TEXT NODE");
		} else if (nodeNumber == Node.COMMENT_NODE) {
			System.out.println("Root element is a COMMENT NODE");
		}
	}

}
