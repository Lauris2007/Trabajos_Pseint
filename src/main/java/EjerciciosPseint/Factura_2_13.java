package EjerciciosPseint;
import java.util.Scanner;

    public class Factura_2_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.19;
        char volver;

        do {
            double totalCompra = 0;

            String mas;
            do {
                
                System.out.print("\nNombre del producto: ");
                String articulo = scanner.nextLine();

                System.out.print("Precio x unidad: ");
                double precio = Double.parseDouble(scanner.nextLine());

                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(scanner.nextLine());

                System.out.print("¿Pertenece a la canasta familiar? (s/n): ");
                String canasta = scanner.nextLine().toLowerCase();

                double subtotal = precio * cantidad;
                double iva = 0;
                double total = subtotal;

                if (!canasta.equals("s")) {
                    iva = subtotal * IVA;
                    total += iva;

                    System.out.printf("Subtotal: %.2f\n", subtotal);
                    System.out.printf("IVA (19%%): %.2f\n", iva);
                } else {
                    System.out.printf("Subtotal (Canasta): %.2f\n", subtotal);
                }

                System.out.printf("Total del producto: %.2f\n", total);
                totalCompra += total;

                System.out.print("\n¿Desea ingresar otro producto? (s para sí): ");
                mas = scanner.nextLine().toLowerCase();

            } while (mas.equals("s"));

            System.out.println("\n---------------------------");
            System.out.printf("TOTAL DE LA COMPRA: %.2f\n", totalCompra);
            System.out.println("---------------------------");

            System.out.print("\n¿Desea repetir la factura? (s para sí): ");
            volver = scanner.nextLine().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}