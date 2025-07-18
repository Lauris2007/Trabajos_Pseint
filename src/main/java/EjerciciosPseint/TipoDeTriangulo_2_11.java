package EjerciciosPseint;

import java.util.Scanner;

public class TipoDeTriangulo_2_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {

            int menu;
            double angA = 0, angB = 0, angC = 0;
            double ladoA = 0, ladoB = 0, ladoC = 0;

            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Ángulos");
            System.out.println("2. Lados");
            System.out.print("Seleccione una opción del menú: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n------ Triángulo por Ángulos ------");

                    do {
                        System.out.println("\nRecuerde que los ángulos deben ser mayores a 0");
                        System.out.print("Digite el ángulo A: ");
                        angA = scanner.nextDouble();
                        System.out.print("Digite el ángulo B: ");
                        angB = scanner.nextDouble();
                    } while (angA <= 0 || angB <= 0);

                    angC = 180 - (angA + angB);

                    if (angC > 0) {
                        if (angA == 90 || angB == 90 || angC == 90) {
                            System.out.println("Es un triángulo: RECTÁNGULO");
                        }
                        if (angA > 90 || angB > 90 || angC > 90) {
                            System.out.println("Es un triángulo: OBTUSÁNGULO");
                        }
                        if (angA < 90 && angB < 90 && angC < 90) {
                            System.out.println("Es un triángulo: ACUTÁNGULO");
                        }
                    } else {
                        System.out.println("Ángulos Incorrectos.");
                    }
                    break;

                case 2:
                    System.out.println("\n------ Triángulo por Lados ------");

                    do {
                        System.out.println("\nRecuerde que los lados deben ser mayores a 0");
                        System.out.print("Digite el lado A: ");
                        ladoA = scanner.nextDouble();
                        System.out.print("Digite el lado B: ");
                        ladoB = scanner.nextDouble();
                        System.out.print("Digite el lado C: ");
                        ladoC = scanner.nextDouble();
                    } while (ladoA <= 0 || ladoB <= 0 || ladoC <= 0);

                    // Validar si se puede formar un triángulo
                    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
                        if (ladoA == ladoB && ladoB == ladoC) {
                            System.out.println("Es un triángulo: EQUILÁTERO");
                        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                            System.out.println("Es un triángulo: ISÓSCELES");
                        } else {
                            System.out.println("Es un triángulo: ESCALENO");
                        }
                    } else {
                        System.out.println("Lados Incorrectos. No forman un triángulo.");
                    }
                    break;

                default:
                    System.out.println("La opción del menú no existe.");
            }

            System.out.print("\n¿Desea repetir? (s para sí / oprima cualquier tecla para no): ");
            volver = scanner.next().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}