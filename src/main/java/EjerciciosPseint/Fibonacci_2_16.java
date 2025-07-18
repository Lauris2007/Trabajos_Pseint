package EjerciciosPseint;

import java.util.Scanner;

public class Fibonacci_2_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            for (int x = 0; x < 30; x++) {
                System.out.println();
            }

            int anterior = 0;
            int posterior = 1;
            int acum = 0;
            int cant = 0;

            System.out.print("\nIngrese la cantidad de números de la serie Fibonacci: ");
            cant = scanner.nextInt();

            System.out.println("\nSerie Fibonacci:");
            for (int i = 0; i < cant; i++) {
                System.out.print(anterior + " ");
                acum = anterior + posterior;
                anterior = posterior;
                posterior = acum;
            }

            System.out.print("\n\nPara repetir digite <s>. Para salir, cualquier otra tecla: ");
            volver = scanner.next().charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
