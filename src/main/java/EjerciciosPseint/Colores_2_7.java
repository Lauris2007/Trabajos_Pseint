package EjerciciosPseint;

import java.util.Scanner;

public class Colores_2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int color1 = 0;
        int color2 = 0;
        String resultado = "";
        
        System.out.println("----- MENÚ -----");
        System.out.println("1. Amarillo");
        System.out.println("2. Azul");
        System.out.println("3. Rojo");
        System.out.println();

        System.out.print("Seleccione el primer número de color: ");
        color1 = scanner.nextInt();

        System.out.print("Seleccione el segundo número de color: ");
        color2 = scanner.nextInt();


        if ((color1 <= 3 && color1 > 0) && (color2 <= 3 && color2 > 0)) {
            if (color1 != color2) {
                if ((color1 == 1 && color2 == 2) || (color2 == 1 && color1 == 2)) {
                    resultado = "Verde";
                }

                if ((color1 == 1 && color2 == 3) || (color2 == 1 && color1 == 3)) {
                    resultado = "Naranja";
                }

                if ((color1 == 2 && color2 == 3) || (color2 == 2 && color1 == 3)) {
                    resultado = "Violeta";
                }
            } else {
                // Ambos colores son iguales
                if (color1 == 1) {
                    resultado = "Amarillo";
                } else if (color1 == 2) {
                    resultado = "Azul";
                } else if (color1 == 3) {
                    resultado = "Rojo";
                }
                resultado += ". Seleccionó el mismo color.";
            }

            System.out.println();
            System.out.println("El color es: " + resultado);
        } else {
            System.out.println();
            System.out.println("En el Menú no existe el color.");
        }

        System.out.println();
        scanner.close();
    }
}
