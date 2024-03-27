package algoritmos;
public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int mid = izquierda + (derecha - izquierda) / 2;

            // Si la clave está en la mitad
            if (arr[mid] == key)
                return mid;

            // Si la clave es mayor, ignoramos la mitad izquierda
            if (arr[mid] < key)
                izquierda = mid + 1;
            // Si la clave es menor, ignoramos la mitad derecha
            else
                derecha = mid - 1;
        }

        // Si la clave no está presente
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 1;
        int result = binarySearch(arr, key);
        if (result != -1)
            System.out.println("Elemento encontrado en el índice " + result);
        else
            System.out.println("Elemento no encontrado en el arreglo");
    }
}
