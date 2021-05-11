package homework_11.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class AnimalParser {
    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootElement = doc.createElement("animal");
            doc.appendChild(rootElement);

            Element cat1 = doc.createElement("cat");
            rootElement.appendChild(cat1);

            Element name1 = doc.createElement("name");
            name1.setTextContent("Marsel");
            cat1.appendChild(name1);
            Element age1 = doc.createElement("age");
            age1.setTextContent("7");
            cat1.appendChild(age1);
            Element breed1 = doc.createElement("breed");
            breed1.setTextContent("Sphynx");
            cat1.appendChild(breed1);
            Element weight1 = doc.createElement("weight");
            weight1.setTextContent("6");
            cat1.appendChild(weight1);

            Element cat2 = doc.createElement("cat");
            rootElement.appendChild(cat2);

            Element name2 = doc.createElement("name");
            name2.setTextContent("Myrzik");
            cat2.appendChild(name2);
            Element age2 = doc.createElement("age");
            age2.setTextContent("5");
            cat2.appendChild(age2);
            Element breed2 = doc.createElement("breed");
            breed2.setTextContent("Oriental");
            cat2.appendChild(breed2);
            Element weight2 = doc.createElement("weight");
            weight2.setTextContent("4");
            cat2.appendChild(weight2);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer tr = tf.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult streamResult = new StreamResult("D:\\JAVA\\java_professional\\src\\main\\java\\homework_11\\task3\\AnimalParser.xml");
            tr.transform(source, streamResult);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
