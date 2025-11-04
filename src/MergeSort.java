public class MergeSort {

    private View view = new View();

    public void sort(int[] numeros, boolean pasos) {
        System.out.println("\nMERGE SORT");
        System.out.println("ARREGLO ORIGINAL");
        view.printArray(numeros);

        mergeSortRecursive(numeros, 0, numeros.length - 1, pasos);

        System.out.println("Resultado final:");
        view.printArray(numeros);
    }

    private void mergeSortRecursive(int arr[], int l, int r, boolean pasos) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSortRecursive(arr, l, m, pasos);
            mergeSortRecursive(arr, m + 1, r, pasos);
            merge(arr, l, m, r, pasos);
        }
    }

    private void merge(int arr[], int l, int m, int r, boolean pasos) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        if (pasos) {
            System.out.println("Paso:");
            view.printArray(arr); 
        }
    }
}