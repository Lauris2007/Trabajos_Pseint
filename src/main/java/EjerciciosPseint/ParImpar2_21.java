package EjerciciosPseint;

import java.util.Scanner;

public class ParImpar2_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            for (int j = 0; j < 30; j++) {
                System.out.println();
            }

            int num1, num2, aux, i;
            String menu;
            int menuEnt = 0;

            System.out.print("Digite el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Digite el segundo número: ");
            num2 = scanner.nextInt();
            scanner.nextLine();

            while (num1 == num2) {
                System.out.println("\nEl segundo número no puede ser igual al primero. Intente de nuevo.");
                System.out.print("Digite el segundo número: ");
                num2 = scanner.nextInt();
                scanner.nextLine();
            }

            if (num1 > num2) {
                aux = num2;
                num2 = num1;
                num1 = aux;
            }

            do {
                System.out.println("\n----- Series -----");
                System.out.println("1. Impar");
                System.out.println("2. Par");
                System.out.print("Digite una opción del menú (1 o 2), cualquier otra para salir: ");
                menu = scanner.nextLine();

                if (menu.equals("1") || menu.equals("2")) {
                    menuEnt = Integer.parseInt(menu);

                    switch (menuEnt) {
                        case 1:
                            System.out.println("\nSerie Impar:");
                            for (i = num1; i <= num2; i++) {
                                if (i % 2 != 0) {
                                    System.out.print(" - " + i);
                                }
                            }
                            System.out.println();
                            break;

                        case 2:
                            System.out.println("\nSerie Par:");
                            for (i = num1; i <= num2; i++) {
                                if (i % 2 == 0) {
                                    System.out.print(" - " + i);
                                }
                            }
                            System.out.println();
                            break;
                    }
                }

            } while (menuEnt == 1 || menuEnt == 2);

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            String entrada = scanner.nextLine();
            volver = entrada.isEmpty() ? ' ' : entrada.charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
