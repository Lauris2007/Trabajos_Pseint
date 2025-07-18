package EjerciciosPseint;

import java.util.Scanner;

public class TablasDeMultiplicar_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {

            System.out.println("\n----- TABLAS DE MULTIPLICAR DEL 1 AL 10 -----\n");

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int res = i * j;
                    System.out.printf("%d x %d = %d\n", i, j, res);
                }
                System.out.println();
            }

            System.out.print("Digite <s> para repetir. Para salir, cualquier otra tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}
