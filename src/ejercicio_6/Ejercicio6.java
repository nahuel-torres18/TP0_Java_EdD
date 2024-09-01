package ejercicio_6;

import java.util.Scanner;

public class Ejercicio6 {
	public static String solicitarFrase(Scanner input) {
        System.out.print("Ingrese una frase: ");
        String palabra = input.nextLine();
        while (palabra.isEmpty()) {
            System.out.print("La frase no puede estar vacia. Vuelve a intentarlo: ");
            palabra = input.nextLine();
        }
        return palabra;
    }
    public static char solicitarLetra(Scanner input) {
        System.out.print("Ingrese la letra a buscar en la frase: ");
        return input.nextLine().charAt(0);
    }
    public static int contador(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (letra == frase.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = solicitarFrase(input);
        char letra = solicitarLetra(input);
        int contador = contador(frase, letra);
        System.out.println("Cantidad de veces que aparece la letra '" + letra + "' en la frase: " + contador);
        input.close();
    }
}
