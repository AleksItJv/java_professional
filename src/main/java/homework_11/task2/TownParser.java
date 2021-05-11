package homework_11.task2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.stream.StreamResult;

public class TownParser {
    public static void main(String[] args) {

        XMLOutputFactory fac = XMLOutputFactory.newInstance();
        StreamResult res = new StreamResult("D:\\JAVA\\java_professional\\src\\main\\java\\homework_11\\task2\\test.xml");
        try {
            XMLStreamWriter writer = fac.createXMLStreamWriter(res);

            writer.writeStartDocument("1.0");
            writer.writeStartElement("country");

            writer.writeStartElement("city");
            writer.writeAttribute("size", "big");

            writer.writeStartElement("name");
            writer.writeCharacters("Kyev");
            writer.writeEndElement();

            writer.writeStartElement("street");
            writer.writeCharacters("Gorky str");
            writer.writeEndElement();

            writer.writeStartElement("house");
            writer.writeCharacters("30");
            writer.writeEndElement();
            writer.writeEndElement();

            writer.writeStartElement("city");
            writer.writeAttribute("size", "big");

            writer.writeStartElement("name");
            writer.writeCharacters("Odessa");
            writer.writeEndElement();

            writer.writeStartElement("street");
            writer.writeCharacters("Deribasovska str");
            writer.writeEndElement();

            writer.writeStartElement("house");
            writer.writeCharacters("66");
            writer.writeEndElement();
            writer.writeEndElement();

            writer.writeStartElement("city");
            writer.writeAttribute("size", "small");

            writer.writeStartElement("name");
            writer.writeCharacters("Kherson");
            writer.writeComment("south");
            writer.writeEndElement();

            writer.writeStartElement("street");
            writer.writeCharacters("Nekrasova str");
            writer.writeEndElement();

            writer.writeStartElement("house");
            writer.writeCharacters("13");
            writer.writeEndElement();

            writer.writeEndDocument();

        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
