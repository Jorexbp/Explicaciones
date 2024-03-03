package procesos;

import java.io.IOException;
import java.util.Scanner;

public class ProcessBuilderEjemplo {
	public static void main(String[] args) {
		String s = "cmd.exe /c cd C:/Users/JorgeBP && dir";
		try {
			s = "notepad C:/Users/JorgeBP/"
					+ "Desktop/Ejemplo/DocumentosSuperSecretos";
			Process p = new ProcessBuilder(s.split("\\s")).start();

			Scanner sc = new Scanner(p.getInputStream());
			String e = "";
			
			while (sc.hasNext()) {
				e += sc.next()+" ";
			}

			e +="\n";
			e = e.replace("<DIR>", "\n<DIR>");
			
			System.out.println(e);
			
			p.waitFor();
		
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}
}
