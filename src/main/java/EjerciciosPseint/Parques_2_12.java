package EjerciciosPseint;

import java.util.Random;
import java.util.Scanner;

public class Parques_2_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char volver;

        do {

            int cont = 0;

            while (cont < 3) {
                System.out.println("Lanzamiento " + (cont + 1) + ". Presione ENTER para lanzar los dados...");
                scanner.nextLine();

                int dado1 = random.nextInt(6) + 1;
                int dado2 = random.nextInt(6) + 1;

                if (dado1 == dado2) {
                    cont++;
                    System.out.println("Ha sacado par de " + dado1);
                    if (cont == 3) {
                        System.out.println("\n¡Saca una Ficha!");
                    }
                } else {
                    System.out.println("Ha sacado " + dado1 + " y " + dado2 + ". ¡Lanza de Nuevo!");
                    break;
                }
            }

            System.out.print("\n¿Desea repetir? (s para sí / oprima cualquier tecla para no): ");
            volver = scanner.nextLine().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}