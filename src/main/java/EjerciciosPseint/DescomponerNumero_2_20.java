package EjerciciosPseint;

import java.util.Scanner;

public class DescomponerNumero_2_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {

            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            int num, cant = 0, resid, temp;

            System.out.print("Escriba un número entero: ");
            num = scanner.nextInt();
            scanner.nextLine();

            temp = num;
            while (temp > 0) {
                temp = temp / 10;
                cant++;
            }

            System.out.println("\nEl número tiene " + cant + " dígito(s) y se descompone así:");
            System.out.println();

            resid = num;
            while (cant > 0) {
                int divisor = (int) Math.pow(10, cant - 1);
                int digito = num / divisor;
                System.out.print(digito);

                cant--;
                num = num % divisor;

                if (cant > 0) {
                    System.out.print(" - ");
                }
            }

            System.out.print("\n\nPara repetir digite <s>, para salir cualquier tecla: ");
            String entrada = scanner.nextLine();
            volver = entrada.isEmpty() ? ' ' : entrada.charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
