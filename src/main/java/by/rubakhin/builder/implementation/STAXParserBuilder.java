package by.rubakhin.builder.implementation;

import by.rubakhin.builder.XMLParserBuilder;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.StAXEventBuilder;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.IOException;

public class STAXParserBuilder implements XMLParserBuilder {
    @Override
    public Document getDocument(String filename) throws  IOException, JDOMException, XMLStreamException {
        StAXEventBuilder staxBuilder = new StAXEventBuilder();
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(
                new FileInputStream(filename));
        return staxBuilder.build(xmlEventReader);
    }
}

