package issAssignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class XMLdemo {

    private static final Logger logger = LogManager.getLogger(XMLdemo.class.getName());

    public static void main(String[] args) {
        // 1. Create an XML document
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        Document doc = null;

        try {
            docBuilder = docFactory.newDocumentBuilder();
            doc = docBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("person");
            doc.appendChild(rootElement);

            // name element
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode("Vatsal Gadaria"));
            rootElement.appendChild(name);

            // age element
            Element age = doc.createElement("age");
            age.appendChild(doc.createTextNode("22"));
            rootElement.appendChild(age);

            // nationality element
            Element nationality = doc.createElement("nationality");
            nationality.appendChild(doc.createTextNode("Indian"));
            rootElement.appendChild(nationality);

            // hobbies element
            Element hobbies = doc.createElement("hobbies");
            rootElement.appendChild(hobbies);

            // hobby elements
            Element hobby1 = doc.createElement("hobby");
            hobby1.appendChild(doc.createTextNode("Hobby 1"));
            hobbies.appendChild(hobby1);

            Element hobby2 = doc.createElement("hobby");
            hobby2.appendChild(doc.createTextNode("Hobby 2"));
            hobbies.appendChild(hobby2);

            Element hobby3 = doc.createElement("hobby");
            hobby3.appendChild(doc.createTextNode("Hobby 3"));
            hobbies.appendChild(hobby3);

            logger.info("Created XML Document");

        } catch (ParserConfigurationException e) {
            logger.error("Error creating XML document: " + e.getMessage());
            e.printStackTrace();
        }

        // 2. Convert the XML document to a string
        if (doc != null) {
            try {
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                StringWriter writer = new StringWriter();
                transformer.transform(new DOMSource(doc), new StreamResult(writer));
                String xmlString = writer.getBuffer().toString();
                logger.info("XML String:\n" + xmlString);
            } catch (TransformerException e) {
                logger.error("Error converting XML document to string: " + e.getMessage());
                e.printStackTrace();
            }
        }

        // 3. Parse an XML string to create an XML document
        String xmlStringToParse = "<person><name>Virat Kohli</name><age>35</age><hobbies><hobby>Cricket</hobby><hobby>Gym</hobby><hobby>Food</hobby></hobbies></person>";
        try {
            DocumentBuilder builder = docFactory.newDocumentBuilder();
            Document parsedDoc = builder.parse(new ByteArrayInputStream(xmlStringToParse.getBytes()));
            logger.info("Parsed XML Document:\n" + documentToString(parsedDoc));
        } catch (ParserConfigurationException | IOException | SAXException  e) {
            logger.error("Error parsing XML string: " + e.getMessage());
            e.printStackTrace();
        }

        // 4. Read an XML file and parse it
        File file = new File("sample.xml");
        if (!file.exists()) {
            logger.error("File sample.xml does not exist.");
            return;
        }

        try {
            DocumentBuilder builder = docFactory.newDocumentBuilder();
            Document docFromFile = builder.parse(file);
            logger.info("XML Document from File:\n" + documentToString(docFromFile));
        } catch (ParserConfigurationException | IOException | SAXException  e) {
            logger.error("Error reading the file src/sample.xml: " + e.getMessage());
            e.printStackTrace();
        }

        // 5. Write an XML document to a file
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("output.xml"));
            transformer.transform(source, result);
            logger.info("Successfully written XML Document to output.xml");
        } catch (TransformerException e) {
            logger.error("Error writing XML document to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String documentToString(Document doc) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            return writer.getBuffer().toString();
        } catch (TransformerException e) {
            logger.error("Error converting XML document to string: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
