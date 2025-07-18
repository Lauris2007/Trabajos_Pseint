package EjerciciosPseint;

import java.util.Scanner;

public class Factorial_2_17 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {

            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            System.out.println("Encuentre el factorial de un número del 0 al 12,");
            System.out.println("si lo supera, el factorial es infinito.");

            int factorial = 1;
            int cant;

            System.out.print("\nIngrese el número factorial: ");
            cant = scanner.nextInt();

            if (cant <= 12) {
                for (int i = 1; i <= cant; i++) {
                    factorial *= i;
                }

                System.out.println("\nEl factorial de " + cant + " es: " + factorial);
            } else {
                System.out.println("\nEl factorial es infinito.");
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = scanner.next().charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
