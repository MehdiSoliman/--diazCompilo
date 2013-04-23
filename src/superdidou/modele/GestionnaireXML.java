/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superdidou.modele;
/**
 *
 * @author Malek
 */
import java.io.File;
import java.io.IOException;
import java.text.Format;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.SAXException;


public class GestionnaireXML {
    
    public void recupeQuestion(Chapitre iChapitre,Niveau iNiveau) throws ParserConfigurationException, SAXException, IOException{
        
        
        File fXmlFile = new File("/Users/Malek/lstQuestion.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = (Document) dBuilder.parse(fXmlFile);
        
        
 
    }
    
}
