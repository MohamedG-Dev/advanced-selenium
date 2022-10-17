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

public class ReadingAllNodesName {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File(System.getProperty("user.dir") + "\\xmlFiles\\employeedata.xml");
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document xmlDoc = docBuilder.parse(file);
		Element rootElement = xmlDoc.getDocumentElement();
		System.out
				.println("----------------------------" + rootElement.getNodeName() + "-----------------------------");
		if (rootElement.hasChildNodes()) {
			NodeList nodeList = rootElement.getChildNodes();
			int rootChildCount = nodeList.getLength();
			for (int i = 0; i < rootChildCount; i++) {
				if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
					System.out.println("---------" + nodeList.item(i).getNodeName() + "---------");
					if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
						NodeList childElementNodeList = nodeList.item(i).getChildNodes();
						int childElementNodesLength = childElementNodeList.getLength();
						for (int j = 0; j < childElementNodesLength; j++) {
							if (childElementNodeList.item(j).hasChildNodes()) {
								String nodeName = childElementNodeList.item(j).getNodeName();
								String nodeTextValue = childElementNodeList.item(j).getTextContent();
								System.out.println(nodeName + " = " + nodeTextValue);
							}
						}
					}
				}
			}

		}

	}

}
