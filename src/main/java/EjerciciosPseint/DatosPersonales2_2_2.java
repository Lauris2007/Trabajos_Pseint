package EjerciciosPseint;

import java.util.Scanner;

public class DatosPersonales2_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nombre = "";
        char sexo = ' ';
        int edad = 0;
        double salario = 0.0;
        boolean transporte = false;

        System.out.print("Digite su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Digite su sexo (H,M): ");
        sexo = scanner.next().charAt(0); 

        System.out.print("Digite su edad: ");
        edad = scanner.nextInt();

        System.out.print("Digite su salario (con centavos): ");
        salario = scanner.nextDouble();

        System.out.print("¿Tiene vehículo? (1 = Sí, 0 = No): ");
        int tieneVehiculo = scanner.nextInt(); 
        transporte = (tieneVehiculo == 1);


        System.out.println();
        System.out.println("    Su nombre es : " + nombre);
        System.out.println("        Usted es : " + sexo);
        System.out.println("     Usted tiene : " + edad + " años");
        System.out.println("      Usted gana : " + salario + " pesos");
        System.out.println("¿Tiene vehículo? : " + transporte);
        System.out.println();

        scanner.close();
    }
}
