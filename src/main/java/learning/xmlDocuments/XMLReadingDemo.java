package learning.xmlDocuments;

import java.util.Hashtable;
import java.util.List;

public class XMLReadingDemo {

	public static void main(String[] args) {
		String xmlFilePath = System.getProperty("user.dir") + "\\xmlFiles\\testdata.xml";
		XMLReader xmlReader = new XMLReader(xmlFilePath);
		List<Hashtable<String, String>> listData = xmlReader.getDataAsList("LoginTest");
		for (int i = 0; i < listData.size(); i++) {
			Hashtable<String, String> table = listData.get(i);
			System.out.println("Username is " + table.get("Username"));
			System.out.println("Browser is " + table.get("Browser"));
			System.out.println("-----");
		}
		System.out.println(listData.get(1).get("Browser"));
	}

}
