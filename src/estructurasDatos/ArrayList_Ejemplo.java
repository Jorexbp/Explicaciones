package estructurasDatos;

import java.util.ArrayList;

public class ArrayList_Ejemplo {
	public static void main(String[] args) {

		// Los arraysLists son arrays los cuales
		// crecen entre 1.5 o 2 veces en tamaño al
		// array original creado al añadir elementos nuevos
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Jorge"); // 0
		arrayList.add("Alberto");// 1
		arrayList.add("Fernando");// 2
		arrayList.add("Daniel");// 3

//		System.out.println(arrayList.indexOf("Alberto"));
//		System.out.println(arrayList.size());
//
//		arrayList.remove(0); // removelast(), removeFirst()
//
//		for (String nombre : arrayList) {
//			System.out.println(nombre);
//		}
//			
//		System.out.println(arrayList.contains("Daniel"));
		
		arrayList.clear();
		
		System.out.println(arrayList.size());

		
	}
}
