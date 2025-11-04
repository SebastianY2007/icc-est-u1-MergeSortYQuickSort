public class QuickSort {

    private View view = new View();

    public void sort(int[] numeros, boolean pasos) {
        System.out.println("\nQUICK SORT");
        System.out.println(" ARREGLO ORIGINAL ");
        view.printArray(numeros);

        quickSortRecursive(numeros, 0, numeros.length - 1, pasos);

        System.out.println("Resultado final:");
        view.printArray(numeros);
    }

    private void quickSortRecursive(int arr[], int low, int high, boolean pasos) {
        if (low < high) {
            int pi = partition(arr, low, high, pasos);
            quickSortRecursive(arr, low, pi - 1, pasos);
            quickSortRecursive(arr, pi + 1, high, pasos);
        }
    }

    private int partition(int arr[], int low, int high, boolean pasos) {
        int pivote = arr[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        int partitionIndex = i + 1;

        if (pasos) {
            System.out.println("Paso (Pivote " + pivote + "):");
            view.printArray(arr); 
        }

        return partitionIndex;
    }
}