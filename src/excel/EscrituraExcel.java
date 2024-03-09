package excel;

import java.io.File;

import javax.swing.JOptionPane;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class EscrituraExcel {
	public void escribirExcel(String ruta, String hoja, int fila, int colu, int valor) {
			try {
				Workbook libro = Workbook.getWorkbook(new File(ruta));
				WritableWorkbook librow = Workbook.createWorkbook(new File(ruta), libro);
				libro.close();
				WritableSheet hoja1 = librow.getSheet(hoja);
				jxl.write.Number salida_celda = new jxl.write.Number(colu - 1, fila - 1, valor);
				// jxl.write.Label, jxl.write.DateTime
			
				hoja1.addCell(salida_celda);
				librow.write();
				librow.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		public static void main(String[] args) {
			new EscrituraExcel().escribirExcel("C:/Users/JorgeBp/Documents/Ejemplo.xls", "articulos",
					Integer.parseInt(
							JOptionPane.showInputDialog(null, "Introduzca el no de Fila de la celda a escribir (Ej.2)")),
					Integer.parseInt(
							JOptionPane.showInputDialog(null, "Introduzca el no de Columna de la celda a escribir(Ej. 2)")),
					Integer.parseInt(
							JOptionPane.showInputDialog(null, "Introduzca el valor de la celda a escribir (Ej. 25)"))
	
			);
	
			
		}
}

