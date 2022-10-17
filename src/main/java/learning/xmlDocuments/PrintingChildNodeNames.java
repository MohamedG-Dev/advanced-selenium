package learning.xmlDocuments;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PrintingChildNodeNames {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File(System.getProperty("user.dir") + "\\xmlFiles\\employeedata.xml");
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmlDoc = docBuilder.parse(file);
		Element rootElement = xmlDoc.getDocumentElement();
		NodeList nodeList = rootElement.getChildNodes();
		int childNodeLength = nodeList.getLength();
		for (int i = 0; i < childNodeLength; i++) {
			if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
				System.out.println(nodeList.item(i).getNodeName());
			}
		}

	}

}
