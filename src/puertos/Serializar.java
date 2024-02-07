package puertos;

import java.io.*;

//Clase que implementa Serializable para permitir la serialización
class Persona implements Serializable {
 private static final long serialVersionUID = 1L; 
 private String nombre;
 private int edad;

 public Persona(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 public String getNombre() {
     return nombre;
 }

 public int getEdad() {
     return edad;
 }
}

public class Serializar {
 public static void main(String[] args) {
     Persona persona = new Persona("Juan", 25);

     // Serialización: Escribir objeto a un archivo
     try (FileOutputStream fileOut = new FileOutputStream("persona.ser");
          ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
         out.writeObject(persona);
         System.out.println("Objeto Persona serializado correctamente.");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialización: Leer objeto desde el archivo
     try (FileInputStream fileIn = new FileInputStream("persona.ser");
          ObjectInputStream in = new ObjectInputStream(fileIn)) {
         Persona personaDeserializada = (Persona) in.readObject();
         System.out.println("Objeto Persona deserializado correctamente.");
         System.out.println("Nombre: " + personaDeserializada.getNombre());
         System.out.println("Edad: " + personaDeserializada.getEdad());
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}

