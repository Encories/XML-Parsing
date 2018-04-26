package by.rubakhin.builder.implementation;

import by.rubakhin.builder.XMLParserBuilder;
import by.rubakhin.entity.Candy;
import org.jdom2.Document;


import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class UnMarshalBuilder implements XMLParserBuilder {

    @Override
    public Document getDocument(String filename){
        try {
            JAXBContext jc = JAXBContext.newInstance(Candy.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader(filename);
            Candy candies = (Candy) u.unmarshal(reader);


        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
