import java.util.Scanner;

public class View {

    private final Scanner scanner;

    public View() {
        scanner = new Scanner(System.in); 
    }

    public void ShowMenu() {
        System.out.println("\n--- Seleccione el Método --- ");
        System.out.println("1 -> Merge");
        System.out.println("2 -> Quick");
        System.out.println("3 -> Salir");
        System.err.print("Selecciona una opción: ");
    }

    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                // Si ingreso un numero
                option = scanner.nextInt();
                if (option >= 1 && option <= max) 
                    break;
            } else {
                scanner.next();
            }
            System.out.print("Opción invalida, ingrese otra vez: ");
        }
        return option;
    }

    public void showPasosMenu() {
        System.out.println("\n--- ¿Quiere ver los pasos? ---");
        System.out.println("1 -> Si");
        System.out.println("2 -> No");
        System.out.print("Seleccione una opción: ");
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
