package EjerciciosPseint;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Baloto_2_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char volver;

        do {
            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            System.out.print("Presione Enter para hallar los números del Baloto: ");
            scanner.nextLine(); // Simula esperar tecla

            int[] numeros = new int[6];
            int numeroGenerado;
            boolean repetido;

            for (int i = 0; i < 6; ) {
                numeroGenerado = random.nextInt(45) + 1; // 1 a 45
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numeroGenerado) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    numeros[i] = numeroGenerado;
                    i++;
                }
            }

            Arrays.sort(numeros);

            System.out.println("\nNúmeros del Baloto:");
            for (int n : numeros) {
                System.out.println(n);
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            String entrada = scanner.nextLine();
            volver = entrada.isEmpty() ? ' ' : entrada.charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
