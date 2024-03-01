package arrays;

import java.util.*;

public class EjemploIterator {
    public static void main(String[] args) {
    
    	List<String> nombres = new ArrayList<>();
        nombres.add("Juan ");
        nombres.add("María ");
        nombres.add("Pedro ");
        nombres.add("Luisa ");

        Iterator<String> iterator = nombres.iterator();


       System.out.print("Con hasNext: ");
        while (iterator.hasNext()) {
        	 if (iterator.next().equals("Juan")) {
                 iterator.remove(); 
                 continue;
             }
            String nombre = iterator.next();
            
           
            System.out.print(nombre);
        }
           
        System.out.print("\nCon Lambda: ");
        Iterator<String> iteratorLambda = nombres.iterator();
        iteratorLambda.forEachRemaining(System.out::print);
        
    }
}
