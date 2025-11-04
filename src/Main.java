public class Main {
    public static void main(String[] args) throws Exception {
        View view = new View();
        
        int[] numeros = new int[] {5, 10, 20, 2, 40, 33, 7, 22, 4, 39, 1};
        
        while (true) {
            view.ShowMenu();
            
            int opcion = view.inputOption(3);

            if (opcion == 3){
                System.out.println("Adiós...");
                System.exit(0);
            }

            view.showPasosMenu();

            int pasos = view.inputOption(2);
            boolean conPasos = pasos == 1; 

            switch (opcion) {
                case 1:
                    System.out.println("\tMerge Sort");

                    MergeSort mergeSort = new MergeSort();
                    mergeSort.sort(numeros, conPasos);

                    break;

                case 2:
                    System.out.println("\tQuick Sort");

                    QuickSort quickSort = new QuickSort();
                    quickSort.sort(numeros, conPasos);
                    
                    break; 
            }
        }
    }
}
