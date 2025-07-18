package EjerciciosPseint;
import java.util.Scanner;

public class Resta_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double res = 0;

        System.out.print("Digite el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite el segundo número: ");
        num2 = scanner.nextDouble();

        res = num1 - num2;

        System.out.println();
        System.out.println("La resta del número " + num1 + " con el número " + num2 + " es: " + res);
        System.out.println();

        scanner.close();
    }
}

