package EjerciciosPseint;

import java.util.Random;
import java.util.Scanner;

public class IndicePosicionValor_2_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char volver;

        do {
            
            for (int j = 0; j < 30; j++) {
                System.out.println();
            }

            int[] vector = new int[10];

            for (int i = 0; i < vector.length; i++) {
                vector[i] = random.nextInt(100);
            }

            System.out.println("Contenido del vector:\n");
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            String entrada = scanner.nextLine();
            volver = entrada.isEmpty() ? ' ' : entrada.charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
