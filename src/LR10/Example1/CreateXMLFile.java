package LR10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            Element manga1 = doc.createElement("manga");
            rootElement.appendChild(manga1);

            Element title1 = doc.createElement("title");
            title1.appendChild((doc.createTextNode("Синяя тюрьма: Блю Лок")));
            manga1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("KANESHIRO Muneyuki"));
            manga1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("2018"));
            manga1.appendChild(year1);

            Element manga2 = doc.createElement("manga");
            rootElement.appendChild(manga2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Пожиратель книг"));
            manga2.appendChild(title2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Crew Eastwood"));
            manga2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("2021"));
            manga2.appendChild(year2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File ("src/LR10/Example1/example.xml"));
            transformer.transform(source,result);

            System.out.println("XML-файл создан.");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
