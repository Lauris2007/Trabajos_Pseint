package EjerciciosPseint;
import java.util.Scanner;

public class Cilindro_2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            System.out.println("\n\n----- CÁLCULO DE CILINDRO -----");

            double radio = 0.0, altura = 0.0;
            double area = 0.0, perimetro = 0.0, volumen = 0.0;

            do {
                System.out.println("Recuerde que el radio y la altura deben ser mayores a 0.");
                System.out.print("Digite el radio: ");
                radio = scanner.nextDouble();

                System.out.print("Digite la altura: ");
                altura = scanner.nextDouble();
            } while (radio <= 0 || altura <= 0);

            double pi = Math.PI;

            double circunferencia = 2 * pi * radio;

            area = 2 * (pi * Math.pow(radio, 2)) + (circunferencia * altura);

            perimetro = (4 * circunferencia) + (2 * altura);

            volumen = pi * Math.pow(radio, 2) * altura;

            System.out.println("\nLa figura es un:     Cilindro");
            System.out.printf("Su perímetro es:     %.2f metros\n", perimetro);
            System.out.printf("Su área es:          %.2f metros cuadrados\n", area);
            System.out.printf("Su volumen es:       %.2f metros cúbicos\n", volumen);

            System.out.print("\n¿Desea repetir? Digite 's' para continuar o cualquier otra tecla para salir: ");
            volver = scanner.next().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}
