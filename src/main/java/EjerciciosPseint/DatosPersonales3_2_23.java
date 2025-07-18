package EjerciciosPseint;

import java.util.Scanner;

public class DatosPersonales3_2_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver;

        String[] vector = new String[5];
        String[][] matriz = new String[4][5];

        do {

            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            vector[0] = "nombre     |";
            vector[1] = "apellido   |";
            vector[2] = "edad       |";
            vector[3] = "estado     |";
            vector[4] = "telefono   |";

            for (int i = 0; i < 4; i++) {
                System.out.println("\nIngrese los datos de la persona #" + (i + 1));
                for (int j = 0; j < 5; j++) {
                    System.out.print("[" + i + "," + j + "] " + vector[j].replace("|", "").trim() + ": ");
                    matriz[i][j] = scanner.nextLine();

                    while (matriz[i][j].length() < 11) {
                        matriz[i][j] += " ";
                    }
                    matriz[i][j] += "|";
                }
            }

            System.out.println("\n-----------------------------------------------------------------------------------------|");
            for (int i = 0; i < 5; i++) {
                System.out.print("   " + vector[i]);
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------|");

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("   " + matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println("-----------------------------------------------------------------------------------------|");

            System.out.print("\nDigite <s> para repetir o cualquier tecla para salir: ");
            volver = scanner.nextLine();

        } while (volver.equalsIgnoreCase("s"));

        scanner.close();
    }
}
