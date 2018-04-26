package by.rubakhin.builder.implementation;

import by.rubakhin.builder.XMLParserBuilder;
import org.jdom2.Document;
import org.jdom2.input.DOMBuilder;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParserBuilder implements XMLParserBuilder {

    @Override
    public Document getDocument(String filename) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;
        documentBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = documentBuilder.parse(new File(filename));
        DOMBuilder domBuilder = new DOMBuilder();

        return domBuilder.build(doc);
    }
}
