package com.sk;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class GfgXmlExtractor {
	public static void main(String argv[])
	{
		try {
			// creating a constructor of file class and
			// parsing an XML file
			
			File file = new File(
				"E:\\Java Advance\\JavaApplicationWithCommandLineOptions\\CommondLineOptions\\richui.egldd");
			
			// Defines a factory API that enables
			// applications to obtain a parser that produces
			// DOM object trees from XML documents.
			DocumentBuilderFactory dbf
				= DocumentBuilderFactory.newInstance();
			
			// we are creating an object of builder to parse
			// the xml file.
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);

			/*here normalize method Puts all Text nodes in
			the full depth of the sub-tree underneath this
			Node, including attribute nodes, into a "normal"
			form where only structure separates
			Text nodes, i.e., there are neither adjacent
			Text nodes nor empty Text nodes. */
			doc.getDocumentElement().normalize();
			System.out.println(
				"Root element: "
				+ doc.getDocumentElement().getNodeName());
			
			// Here nodeList contains all the nodes with
			// name geek.
			NodeList nodeList
				= doc.getElementsByTagName("geek");
			
			// Iterate through all the nodes in NodeList
			// using for loop.
			for (int i = 0; i < nodeList.getLength(); ++i) {
				Node node = nodeList.item(i);
				System.out.println("\nNode Name :"
								+ node.getNodeName());
				if (node.getNodeType()
					== Node.ELEMENT_NODE) {
					Element tElement = (Element)node;
					System.out.println(
						"User id: "
						+ tElement
							.getElementsByTagName("id")
							.item(0)
							.getTextContent());
					System.out.println(
						"User Name: "
						+ tElement
							.getElementsByTagName(
								"username")
							.item(0)
							.getTextContent());
					System.out.println(
						"Enrolled Course: "
						+ tElement
							.getElementsByTagName(
								"EnrolledCourse")
							.item(0)
							.getTextContent());
					System.out.println(
						"Mode: "
						+ tElement
							.getElementsByTagName("mode")
							.item(0)
							.getTextContent());
					System.out.println(
						"Duration: "
						+ tElement
							.getElementsByTagName(
								"duration")
							.item(0)
							.getTextContent());
				}
			}
		}
		
		// This exception block catches all the exception
		// raised.
		// For example if we try to access a element by a
		// TagName that is not there in the XML etc.
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
