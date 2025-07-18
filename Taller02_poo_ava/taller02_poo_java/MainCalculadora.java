package taller02_poo_java;
import java.util.Scanner;
import taller02_poo_java.Calculadora;
public class MainCalculadora {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       Calculadora calc = new Calculadora ();
       
       int menu;
               
        System.out.println("--------------- Bienvenido a la Calculadora ---------------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Seleccione la operacion que desea hacer: ");
        menu = scanner.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("------ Bienvenido a la Suma ------");
                System.out.print("Digite el primer sumando: ");
                calc.setNumero1(scanner.nextDouble());
                System.out.print("Digite el segundo sumando: ");
                calc.setNumero2(scanner.nextDouble());
                System.out.println("El resultado de la suma es: " + calc.sumar());
                break;
            case 2:
                  System.out.println("------ Bienvenido a la Resta ------");
                  System.out.println("Digite el primer numero: ");
                  calc.setNumero1(scanner.nextDouble());
                  System.out.println("Digite el segundo numero: ");
                  calc.setNumero2(scanner.nextDouble());
                  
                  System.out.println("El resultado de la resta es: "+ calc.resta());
                  break;
            case 3:
                System.out.println("------ Bienvenido a la Multiplicacion ------");
                System.out.println("Digite el primer numero: ");
                calc.setNumero1(scanner.nextDouble());
                System.out.println("Digite el segundo numero");
                calc.setNumero2(scanner.nextDouble());
                System.out.println("El resultado de la multiplicacion es: "+ calc.multiplicacion());
                break;
            case 4:
                System.out.println("------ Bienvenido a la Division ------");
                System.out.println("Digite el primer numero: ");
                calc.setNumero1(scanner.nextDouble());
                System.out.println("Digite el segundo numero");
                calc.setNumero2(scanner.nextDouble());
                System.out.println("El resultado de la division es: "+ calc.dividir());
                break;
            default:
                System.out.println("Esta opcion no es valida");
        }
    }       
        }
