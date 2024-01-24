package arrays;

import java.util.Iterator;

public class ArraysInicio {
	public static void main(String[] args) {
		String alumnos[] = { "Jorge", "Luis", "Ana" }; // 0-2
		String profes[] = new String[2]; // 0-1
		profes[0] = "Carlos";
		profes[1] = "Cati";

//		for (int i = 0; i < alumnos.length; i++) {
//			System.out.println(alumnos[i]);
//		}
//		
//		for (int i = 0; i < profes.length; i++) {
//			System.out.println(profes[i]);
//		}
		
		for (String valorProfe : profes) {
			System.out.println(valorProfe);
		}
		
		for (String valorAlu : alumnos) {
			System.out.println(valorAlu);
		}

	




	

	}
}
