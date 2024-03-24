package estructurasDatos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EjemploXML {

    public static void main(String[] args) {
        escribirXML();

         leerXML();
    }

    public static void escribirXML() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // Elemento raíz
            Element rootElement = doc.createElement("libros");
            doc.appendChild(rootElement);

            // Elemento libro
            Element libro = doc.createElement("libro");
            rootElement.appendChild(libro);

            // Al libro le meto un atributo
            libro.setAttribute("id", "1");

            // Estos son hijos de libro
            Element titulo = doc.createElement("titulo");
            titulo.appendChild(doc.createTextNode("El Señor de los Anillos"));
            libro.appendChild(titulo);

            Element autor = doc.createElement("autor");
            autor.appendChild(doc.createTextNode("J.R.R. Tolkien"));
            libro.appendChild(autor);

            // Aqui es donde escribo el XML 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("libros.xml"));
            transformer.transform(source, result);
            System.out.println("Archivo XML creado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerXML() {
        try {
            File file = new File("libros.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            doc.getDocumentElement().normalize();

            System.out.println("Elemento raíz: " + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("libro");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) node;
                    System.out.println("ID del libro: " + elemento.getAttribute("id"));
                    System.out.println("Título: " + elemento.getElementsByTagName("titulo").item(0).getTextContent());
                    System.out.println("Autor: " + elemento.getElementsByTagName("autor").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
