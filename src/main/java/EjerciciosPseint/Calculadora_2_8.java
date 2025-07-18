package EjerciciosPseint;

import java.util.Scanner;
import java.util.Random;

public class Calculadora_2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int menu = 0;
        double num1 = 0.0, num2 = 0.0, res = 0.0;

        // Menú
        System.out.println("--------------- Bienvenido a la Calculadora ---------------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Cuadrado");
        System.out.println("7. Raíz cuadrada");
        System.out.println("8. Potencia");
        System.out.println("9. Porcentaje");
        System.out.println("10. Número aleatorio");
        System.out.print("Digite una opción del menú: ");
        menu = scanner.nextInt();

        System.out.println();

        switch (menu) {
            case 1: // Suma
                System.out.println("------ Bienvenido a la Suma ------");
                System.out.print("Digite el primer sumando: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el segundo sumando: ");
                num2 = scanner.nextDouble();
                res = num1 + num2;
                System.out.println("El resultado de la suma es: " + res);
                break;

            case 2: // Resta
                System.out.println("------ Bienvenido a la Resta ------");
                System.out.print("Digite el minuendo: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el sustraendo: ");
                num2 = scanner.nextDouble();
                res = num1 - num2;
                System.out.println("El resultado de la resta es: " + res);
                break;

            case 3: // Multiplicación
                System.out.println("------ Bienvenido a la Multiplicación ------");
                System.out.print("Digite el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el segundo número: ");
                num2 = scanner.nextDouble();
                res = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + res);
                break;

            case 4: // División
                System.out.println("------ Bienvenido a la División ------");
                System.out.print("Digite el dividendo: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el divisor: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println("El resultado de la división es: " + res);
                } else {
                    System.out.println("Imposible dividir por 0.");
                }
                break;

            case 5: // Módulo
                System.out.println("------ Bienvenido al Módulo ------");
                System.out.print("Digite el dividendo: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el divisor: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    res = num1 % num2;
                    System.out.println("El módulo de la división es: " + res);
                } else {
                    System.out.println("Imposible dividir por 0.");
                }
                break;

            case 6: // Cuadrado
                System.out.println("------ Bienvenido al Cuadrado ------");
                System.out.print("Digite la base: ");
                num1 = scanner.nextDouble();
                res = Math.pow(num1, 2);
                System.out.println("El cuadrado de " + num1 + " es: " + res);
                break;

            case 7: // Raíz cuadrada
                System.out.println("------ Bienvenido a la Raíz Cuadrada ------");
                System.out.print("Digite la base: ");
                num1 = scanner.nextDouble();
                res = Math.sqrt(num1);
                System.out.println("La raíz cuadrada de " + num1 + " es: " + res);
                break;

            case 8: // Potencia
                System.out.println("------ Bienvenido a la Potencia ------");
                System.out.print("Digite la base: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el exponente: ");
                num2 = scanner.nextDouble();
                res = Math.pow(num1, num2);
                System.out.println("La potencia de " + num1 + " elevado a " + num2 + " es: " + res);
                break;

            case 9: // Porcentaje
                System.out.println("------ Bienvenido al Porcentaje ------");
                System.out.print("Digite el número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite el porcentaje: ");
                num2 = scanner.nextDouble();
                res = (num1 * num2) / 100;
                System.out.println(num2 + "% de " + num1 + " es: " + res);
                break;

            case 10: // Número aleatorio
                System.out.println("------ Bienvenido al Número Aleatorio ------");
                System.out.print("Digite el número máximo: ");
                num1 = scanner.nextDouble();
                res = random.nextInt((int) num1) + 1; // entre 1 y num1
                System.out.println("Número aleatorio entre 1 y " + (int) num1 + ": " + (int) res);
                break;

            default:
                System.out.println("La opción no está en el menú.");
        }

        scanner.close();
    }
}

