package ejercicio_3;

import java.util.Scanner;

public class Ejercicio3 {
	private static int saldo = 0;

    public static void menu() {
        System.out.println("\n--- Cajero automatico ---");
        System.out.println("Presione 1) Para CONSULTAR SALDO");
        System.out.println("Presione 2) DEPOSITAR DINERO");
        System.out.println("Presione 3) RETIRAR DINERO");
        System.out.println("Presione 4) SALIR");
        System.out.print("Seleccione una opcion: ");
    }

    public static int leerOpcion(Scanner sc) {
        int opcion = -1;
        while (opcion < 1 || opcion > 4) {
            try {
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opcion invalida, vuelva a intentarlo: ");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Intente nuevamente");
                sc.next(); //Limpiar entradas invalidas
            }
        }
        return opcion;
    }

    public static void procesarInformacion(Scanner sc, int opcion) {
        switch (opcion) {
            case 1:
                consultarSaldo(saldo);
                break;
            case 2:
                depositarDinero(sc);
                break;
            case 3:
                retirarDinero(sc);
                break;
            case 4:
                salir();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void consultarSaldo(int saldo) {
        System.out.print("Su saldo actual es: $"+ saldo);
    }

    public static int saldo(Scanner sc) {
        int monto = -1;
        while (monto < 0) {
            try {
                monto = sc.nextInt();
                if (monto < 0) {
                    System.out.println("Monto invalido. Intente nuevamente");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Intente nuevamente");
                sc.next(); //Limpiar entrada invalida
            }
        }
        return monto;
    }

    public static void depositarDinero(Scanner sc) {
        System.out.print("Ingrese la cantidad de dinero a depositar: ");
        int monto = saldo(sc);
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado con exito. Su nuevo saldo es: $"+saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo");
        }
    }

    public static void retirarDinero(Scanner sc) {
        System.out.print("Ingrese el monto a retirar: ");
        int monto = saldo(sc);
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Su nuevo saldo es: $"+saldo);
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }

    public static void salir() {
        System.out.println("Saliendo del sistema...");
    }

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            opcion = leerOpcion(sc);
            procesarInformacion(sc, opcion);
        } while (opcion != 4);
    }
}
