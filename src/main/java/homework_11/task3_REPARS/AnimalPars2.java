package homework_11.task3_REPARS;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class AnimalPars2 {

    public static void main(String[] args) {
        String file = "D:\\JAVA\\java_professional\\src\\main\\java\\homework_11\\task3_REPARS\\AnimalPars.xml";
        try {
            SAXParserFactory saxfactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxfactory.newSAXParser();
            DefaultHandlerr def = new DefaultHandlerr();
            try {
                saxParser.parse(file, def);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}

class DefaultHandlerr extends DefaultHandler {
    boolean cursor = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("name")){
            cursor = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (cursor){
            System.out.println("Name = " + new String(ch, start, length));
            cursor = false;
        }
    }

}