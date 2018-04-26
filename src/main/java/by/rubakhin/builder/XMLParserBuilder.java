package by.rubakhin.builder;


import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public interface XMLParserBuilder {

    org.jdom2.Document getDocument(String filename) throws ParserConfigurationException, IOException,
            SAXException, JDOMException, XMLStreamException;

}
