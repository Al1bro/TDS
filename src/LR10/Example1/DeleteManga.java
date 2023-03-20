package LR10.Example1;

import org.w3c.dom.Document;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DeleteManga {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/LR10/Example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: "+doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("manga");

            Node node = nodeList.item(0);
            Element mangaElement = (Element) node;
            mangaElement.getElementsByTagName("title").item(0);
            Node parentNode = mangaElement.getParentNode();
            parentNode.removeChild(mangaElement);

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

            System.out.println("Удалили первую мангу в списке");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
