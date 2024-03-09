package excel;

import java.io.File;
import jxl.*;

	public class LecturaExcel {
		public void leerExcel(String ruta) {
			try {
				Workbook libro = Workbook.getWorkbook(new File(ruta));
				Sheet hoja = libro.getSheet("articulos");
				// Si quisiera podría haber puesto el nombre de la hoja

			for (int fila = 0; fila < hoja.getRows(); fila++) {
					for (int columna = 0; columna <
							hoja.getColumns(); columna++) {
						
						Cell celda = hoja.getCell(columna, fila);
						String valor = celda.getContents();
						
					System.out.println(
								"El valor de la celda (" 
										+ fila + "," + columna +
												") es " + valor);
					}
				}

				libro.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			new LecturaExcel()
				.leerExcel("C:/Users/JorgeBp/Documents/Ejemplo.xls");
		}
	
}
