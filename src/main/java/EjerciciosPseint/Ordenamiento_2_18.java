package EjerciciosPseint;

import java.util.Scanner;

public class Ordenamiento_2_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            
            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            int num1 = 0, num2 = 0, num3 = 0, aux, menuEnt = 0;
            String menu;

            System.out.print("Digite el valor del primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Digite el valor del segundo número: ");
            num2 = scanner.nextInt();
            System.out.print("Digite el valor del tercer número: ");
            num3 = scanner.nextInt();

            for (int i = 0; i < 2; i++) {
                if (num1 >= num2) {
                    aux = num1;
                    num1 = num2;
                    num2 = aux;
                }
                if (num2 >= num3) {
                    aux = num2;
                    num2 = num3;
                    num3 = aux;
                }
            }

            do {
                System.out.println("\n----- Ordenamiento -----");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente\n");
                System.out.print("Digite una opción del menú (1 o 2), cualquier otra para salir: ");
                menu = scanner.next();

                if (menu.equals("1") || menu.equals("2")) {
                    menuEnt = Integer.parseInt(menu);

                    switch (menuEnt) {
                        case 1:
                            System.out.println("\nOrden ascendente:");
                            System.out.println(num1 + " - " + num2 + " - " + num3);
                            break;
                        case 2:
                            System.out.println("\nOrden descendente:");
                            System.out.println(num3 + " - " + num2 + " - " + num1);
                            break;
                    }
                } else {
                    menuEnt = 0;
                }

            } while (menuEnt == 1 || menuEnt == 2);

            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            volver = scanner.next().charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
