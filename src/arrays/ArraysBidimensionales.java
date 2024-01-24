package arrays;

public class ArraysBidimensionales {
	public static void main(String[] args) {
		String nombresYApellidos[][] =
				{{"Jorge","Bar"},{"Fer","Kal"}};
		String nombreYEdad[][] = new String[2][2];
		
		nombreYEdad[0][0] = "Luis";
		nombreYEdad[0][1] = "25";
		
		nombreYEdad[1][0] = "Alberto";
		nombreYEdad[1][1] = "12";
		
		for (int i = 0; i < nombreYEdad.length; i++) {
			for (int j = 0; j < nombreYEdad[i].length; j++) {
				System.out.print(nombreYEdad[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
