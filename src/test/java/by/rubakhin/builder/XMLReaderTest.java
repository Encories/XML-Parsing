package by.rubakhin.builder;

import by.rubakhin.entity.Candy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class XMLReaderTest {

    XMLReader xmlReader = new XMLReader();
    String filename = "file/candies.xml";

    @Test
    public void testGetListOfCandiesByCertainParserDOM() throws Exception {
        List<Candy> candyList = xmlReader.getListOfCandiesByCertainParser(1, filename);
        Assert.assertNotEquals(candyList, null);
    }

    @Test
    public void testGetListOfCandiesByCertainParserSAX() throws Exception {
        List<Candy> candyList = xmlReader.getListOfCandiesByCertainParser(2, filename);
        Assert.assertNotEquals(candyList, null);
    }

    @Test
    public void testGetListOfCandiesByCertainParserSTAX() throws Exception {
        List<Candy> candyList = xmlReader.getListOfCandiesByCertainParser(3, filename);
        Assert.assertNotEquals(candyList, null);
    }

    @Test
    public void testGetListOfCandiesByCertainUnMarshal() throws Exception {
        List<Candy> candyList = xmlReader.getListOfCandiesByCertainParser(4, filename);
        Assert.assertNotEquals(candyList, null);
    }
}
