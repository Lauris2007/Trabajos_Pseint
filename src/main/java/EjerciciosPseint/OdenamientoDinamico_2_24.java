package EjerciciosPseint;

import java.util.Random;
import java.util.Scanner;

public class OdenamientoDinamico_2_24  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String volver;

        int[] vector = new int[10];

        do {

            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            for (int i = 0; i < 10; i++) {
                vector[i] = random.nextInt(100);
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = scanner.nextLine();

        } while (volver.equalsIgnoreCase("s"));

        scanner.close();
    }
}
