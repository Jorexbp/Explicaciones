package pdf;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class CrearPDF {
	public static void main(String[] args) {
		try {
			generar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void generar() throws Exception {

		PDDocument docu = new PDDocument(); // Crea pdf
		PDPage pagina1 = new PDPage(); // Crea página en blanco
		docu.addPage(pagina1); // Agrega la página
		PDPage page = docu.getPage(0); // Obtiene página 1

		PDDocumentInformation pdd = docu.getDocumentInformation();

		pdd.setAuthor("Jorge");
		pdd.setTitle("PDF Personalizado");
		pdd.setCreator("JOBP");
		pdd.setSubject("PDF de personalización");

		Calendar date = new GregorianCalendar();

		date.set(2018, 5, 7);
		pdd.setCreationDate(date);
		date.set(2018, 6, 5);

		pdd.setModificationDate(date);
		pdd.setKeywords("Java, personalizado");
		pdd.setProducer("JOBP");

		File file = new File("src/multimedia/th-657437520.jpg");

		PDImageXObject pdimagen = PDImageXObject.createFromFileByExtension(file, docu);

		String cabe1 = "My binary teacher";
		String cabe2 = "C/Venus, 123 - 123 Madrid";
		String enlace = "https://Jorexbp.github.io";
		String texto = "Este es el primer párrafo de contenido";
		String texto2 = "Este es el segundo párrafo de contenido y ambos estan tabulados";
		String pie = "He creado este pie personalizado :)";

		PDPageContentStream contenido = new PDPageContentStream(docu, page);

		contenido.beginText(); // Inicio BLOQUE 1 de texto

		contenido.setLeading(10.5f); // Interlineado
		contenido.newLineAtOffset(25, 775);
		// Nueva línea: x:inicio (El 0 a la izq), y:fin (El 0 abajo)

		contenido.showText(cabe1 + " ");
		contenido.setCharacterSpacing(0.5f);// Espacio entre caracteres
		contenido.showText(enlace);
		contenido.newLine(); // Línea en blanco
		contenido.showText(cabe2);
		contenido.newLine();

		Date fecha = new Date();

		SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy");

		contenido.showText(df.format(fecha));
		contenido.endText(); // Fin BLOQUE 1 de texto
		contenido.drawImage(pdimagen, 50, 300); // Inserta la imagen

		contenido.beginText(); // Inicio BLOQUE 2 de texto
		contenido.newLineAtOffset(100, 700);

		contenido.showText(texto);
		contenido.endText(); // Fin BLOQUE 2 de texto

		contenido.beginText(); // Inicio BLOQUE 2 de texto
		contenido.newLineAtOffset(100, 200);
		contenido.showText(texto2);
		contenido.endText();

		contenido.beginText(); // Inicio BLOQUE 3 de texto
		contenido.newLineAtOffset(170, 20);
		contenido.showText(pie);
		contenido.endText(); // Fin BLOQUE 3 de texto

		contenido.setNonStrokingColor(new Color(102, 0, 0)); // Color puro
		contenido.addRect(0, 720, 612, 2); // x,y,anchura,altura
		contenido.fill(); // Con relleno, si no sale blanco

		contenido.setNonStrokingColor(new Color(102, 0, 0)); // Color puro
		contenido.addRect(0, 30, 612, 1); // x,y,anchura,altura
		contenido.fill(); // Con relleno, si no sale blanco
		contenido.close();

		File archivo = new File("C:/Users/JorgeBP/Desktop/JAVA_Generado.pdf");

		docu.save(archivo); // Guarda el pdf en archivo

		docu.close();

		Desktop.getDesktop().open(archivo);
	}

}
