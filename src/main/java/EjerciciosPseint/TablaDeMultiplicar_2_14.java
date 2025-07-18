package EjerciciosPseint;

import java.util.Scanner;
    
public class TablaDeMultiplicar_2_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {

            System.out.print("\nDigite la tabla de multiplicar que desea visualizar: ");
            int tabla = scanner.nextInt();
            System.out.println();

            for (int i = 1; i <= 10; i++) {
                int res = tabla * i;
                System.out.println(tabla + " x " + i + " = " + res);
            }

            scanner.nextLine();

            System.out.print("\nPara ingresar otra tabla escriba s, para salir escriba cualquier tecla: ");
            volver = scanner.nextLine().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}