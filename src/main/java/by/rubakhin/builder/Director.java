package by.rubakhin.builder;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Director {
    private XMLParserBuilder xmlParserBuilder;

    public void setXMLParserBuilder(XMLParserBuilder xmlParserBuilder) {
        this.xmlParserBuilder = xmlParserBuilder;
    }

    public org.jdom2.Document getDocument(String filename) throws JDOMException, ParserConfigurationException,
            XMLStreamException, SAXException, IOException {
        return xmlParserBuilder.getDocument(filename);
    }
}

