package algoritmos;

public class BubbleSort {
	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			
				for (int j = 0; j < n - i - 1; j++) {
					if (arr[j] > arr[j + 1]) { 
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
		}
		return arr;
		}
	
	public static void mostrarArray(int[] arrayNumeros) {
		System.out.print("[ ");
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.print(arrayNumeros[i]+" ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int arrayNums[] = {8,7,1,2,5};
		mostrarArray(arrayNums);
		mostrarArray(bubbleSort(arrayNums));
	}
}
