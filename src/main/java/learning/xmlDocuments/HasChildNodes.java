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

public class HasChildNodes {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File(System.getProperty("user.dir")+"\\xmlFiles\\employeedata.xml");
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmlDoc = docBuilder.parse(file);
		Element rootElement = xmlDoc.getDocumentElement();
		if (rootElement.hasChildNodes()) {
			NodeList nodeList = rootElement.getChildNodes();
			System.out.println("The number of children under root node are: " + nodeList.getLength());
		}

	}

}
