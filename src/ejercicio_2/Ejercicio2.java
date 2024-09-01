package ejercicio_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static double ingresarCapital(Scanner input) {
        double capital;
        while (true) {
            try {
                System.out.print("Ingrese el capital inicial: ");
                capital = input.nextDouble();
                if (capital <= 0) {
                    System.out.println("El capital no puede ser un numero negativo o cero");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingreso no valido. Vuelva a intentarlo");
                input.next();
            }
        }
        return capital;
    }

    public static double ingresarInteres(Scanner input) {
        double interes;
        while (true) {
            try {
                System.out.print("Ingrese la taza de interes: ");
                interes = input.nextDouble();
                if (interes <= 0) {
                    System.out.println("El capital no puede ser un numero negativo o cero");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingreso no valido. Vuelva a intentarlo");
                input.next();
            }
        }
        return interes;
    }
    public static int ingresarAño(Scanner input) {
        int año;
        while (true) {
            try {
                System.out.print("Ingrese el numero de años: ");
                año = input.nextInt();
                if (año <= 0) {
                    System.out.println("El capital no puede ser un numero negativo o cero");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingreso no valido. Vuelva a intentarlo");
                input.next();
            }
        }
        return año;
    }
    public static void calcularMonto(double capitalInicial, double interes, int año) {
        double resultado = 0;
        for (int i = 1; i <= año; i++) {
            resultado += capitalInicial*Math.pow(1+100*interes,año);
            System.out.println("Año: " + i + ". Interes: " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double captal = ingresarCapital(input);
        double interes = ingresarInteres(input);
        int año = ingresarAño(input);
        calcularMonto(captal,interes,año);
    }

}
