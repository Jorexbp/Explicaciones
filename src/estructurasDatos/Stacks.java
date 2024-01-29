package estructurasDatos;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		// LIFO
		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		

		System.out.println("Stack: " + stack);

		int topElement = stack.peek();
		System.out.println("Primer elemento"
						+ " del Stack: " + topElement);

		int poppedElement = stack.pop();
		System.out.println("Elemento eliminado"
						+ " del Stack: " + poppedElement);

		System.out.println("Stack después de"
						+ " la eliminación: " + stack);
		
		stack.clear();
		System.out.println("Stack: " + stack);

	}
}
