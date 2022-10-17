package learning.xmlDocuments;

import org.w3c.dom.Node;

public class NodesAndNumericalRepresentation {

	public static void main(String[] args) {
		System.out.println("Number representing document node is: "+Node.DOCUMENT_NODE);
		System.out.println("Number representing element node is: "+Node.ELEMENT_NODE);
		System.out.println("Number representing text node is: "+Node.TEXT_NODE);
		System.out.println("Number representing attribute node is: "+Node.ATTRIBUTE_NODE);
		System.out.println("Number representing comment node is: "+Node.COMMENT_NODE);
	}

}
