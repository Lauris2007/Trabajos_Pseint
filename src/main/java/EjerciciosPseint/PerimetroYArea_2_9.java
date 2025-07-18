package EjerciciosPseint;

import java.util.Scanner;

public class PerimetroYArea_2_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        double ladoA, ladoB, ladoC, radio, area, perimetro;

        // Mostrar el menú
        System.out.println("Diseñe un algoritmo que muestre un menú para la selección:");
        System.out.println("(1. Triángulo, 2. Rectángulo, 3. Círculo).");
        System.out.println("Se pedirá la información necesaria y se mostrará el área y perímetro.");

        System.out.println("\n---------- MENÚ ----------");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.print("Seleccione una opción del menú: ");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                // Triángulo
                System.out.println("\n-------------- Triángulo ------------------");

                // Base
                System.out.print("Digite la base: ");
                ladoA = scanner.nextDouble();
                while (ladoA <= 0) {
                    System.out.println("⚠ La base debe ser mayor a 0.");
                    System.out.print("Digite nuevamente la base: ");
                    ladoA = scanner.nextDouble();
                }

                // Altura
                System.out.print("Digite la altura: ");
                ladoB = scanner.nextDouble();
                while (ladoB <= 0) {
                    System.out.println("⚠ La altura debe ser mayor a 0.");
                    System.out.print("Digite nuevamente la altura: ");
                    ladoB = scanner.nextDouble();
                }

                // Área y perímetro
                area = (ladoA * ladoB) / 2;
                ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
                perimetro = ladoA + ladoB + ladoC;

                System.out.println("\nLa Figura es un:   Triángulo");
                System.out.printf("Su área es:        %.2f metros cuadrados\n", area);
                System.out.printf("Su perímetro es:   %.2f metros\n", perimetro);
                break;

            case 2:
                // Rectángulo
                System.out.println("\n-------------- Rectángulo ------------------");

                System.out.print("Digite el lado A: ");
                ladoA = scanner.nextDouble();
                System.out.print("Digite el lado B: ");
                ladoB = scanner.nextDouble();
                while (ladoA <= 0 || ladoB <= 0) {
                    System.out.println("⚠ Ambos lados deben ser mayores a 0.");
                    System.out.print("Digite nuevamente el lado A: ");
                    ladoA = scanner.nextDouble();
                    System.out.print("Digite nuevamente el lado B: ");
                    ladoB = scanner.nextDouble();
                }

                area = ladoA * ladoB;
                perimetro = 2 * (ladoA + ladoB);

                System.out.println("\nLa Figura es un:   Rectángulo");
                System.out.printf("Su área es:        %.2f metros cuadrados\n", area);
                System.out.printf("Su perímetro es:   %.2f metros\n", perimetro);
                break;

            case 3:
                // Círculo
                System.out.println("\n-------------- Círculo ------------------");

                System.out.print("Digite el radio: ");
                radio = scanner.nextDouble();
                while (radio <= 0) {
                    System.out.println("⚠ El radio debe ser mayor a 0.");
                    System.out.print("Digite nuevamente el radio: ");
                    radio = scanner.nextDouble();
                }

                area = Math.PI * Math.pow(radio, 2);
                perimetro = 2 * Math.PI * radio;

                System.out.println("\nLa Figura es un:        Círculo");
                System.out.printf("Su área es:             %.2f metros cuadrados\n", area);
                System.out.printf("Su circunferencia es:   %.2f metros\n", perimetro);
                break;

            default:
                System.out.println("La opción del menú no existe.");
        }

        scanner.close();
    }
}