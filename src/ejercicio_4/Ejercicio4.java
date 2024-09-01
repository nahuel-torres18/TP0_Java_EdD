package ejercicio_4;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
	public static int generarNumeroAleatorio() {
        Random numeroAleatorio = new Random();
        int numero = numeroAleatorio.nextInt(100)+1;
        System.out.println("--- Se acaba de generar un numero aleatoriamente ---");
        System.out.println("Intenta adivinar cual es el numero");
        return numero;
    }

    public static void adivinaElNumero(Scanner sc,int numeroAleatorio) {
        int contador = 0;
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        while (true) {
            if (numero > numeroAleatorio) {
                System.out.print("Numero demasiado alto. Vuelva a intentarlo: ");
                contador++;
            } else if (numero < numeroAleatorio) {
                System.out.print("Numero demasiado vajo. Vuelva a intentarlo: ");
                contador++;
            } else {
                System.out.println("--- FELICIDADES. ENCONTRASTE EL NUMERO ---");
                break;
            }
            numero = sc.nextInt();
        }
        System.out.println("Cantidad de intentos: " + contador);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = generarNumeroAleatorio();
        adivinaElNumero(input, numero);
    }
}
