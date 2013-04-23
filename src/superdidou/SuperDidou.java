/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superdidou;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.io.File;
import java.io.IOException;
//import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author Malek
 */
public class SuperDidou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, SAXException, IOException, IOException, IOException, ParserConfigurationException {
    
          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        //Use factory to get a new DocumentBuilder
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        //Parse the XML file, get DOM representation
        Document doc =  db.parse("src/lstQuestion.xml");
        Node lst = doc.getFirstChild();
        System.out.println(lst.getChildNodes());
        
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
 
	NodeList nList = doc.getElementsByTagName("Chapitre");
        
  /*      
        for(int i=0; i<nList.getLength();i++){
            Node iNode = nList.item(i).getFirstChild();
            NamedNodeMap map = nList.item(i).getAttributes();
            System.out.println(map.item(i).getNodeName());
            //System.out.println(Node.ELEMENT_NODE);
            if (iNode.getNodeType() == Node.ELEMENT_NODE) {
                Element iElement = (Element) iNode;
                System.out.println(iElement.getFirstChild().getNodeValue());
            }
            
            
            
            System.out.println(iNode.getNodeValue());
            
            
            
        }
 */
	System.out.println("----------------------------");
 
	for (int temp = 0; temp < nList.getLength(); temp++) {
 
		Node nNode = nList.item(temp);
 
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
 
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
			Element eElement = (Element) nNode;
                        System.out.println(eElement.getFirstChild().getNodeValue());
                }}
        
//        
//        Document document = null;
//            DOMParser parser = null;
//                try {
//                    parser = new DOMParser();
//                     //File fXmlFile = new File("/Users/Malek/lstQuestion.xml");
//                    parser.parse("src/lstQuestion.xml");
//                    document =  (Document) parser.getDocument();
//                    System.out.println(document.toString());
//                   } catch (Exception e) {
//             e.printStackTrace();
//        }
}
       

        
        
    
    
}
