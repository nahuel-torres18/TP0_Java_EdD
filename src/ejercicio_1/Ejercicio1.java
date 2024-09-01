package ejercicio_1;

import java.util.Scanner;

public class Ejercicio1 {
	public static String ingresarTexto() {
        Scanner input = new Scanner(System.in);
        String palabra;
        while (true) {
            System.out.print("Ingrese un texto: ");
            palabra = input.nextLine();
            if (!palabra.isEmpty()) {
                break;
            } else {
                System.out.println("Cadena vacia");
            }
        }
        input.close();
        return palabra;
    }

    public static void procesarTexto(String texto) {
        int contador1 = 0, contador2 = 0;
        System.out.println("Texto en minuscula: "+texto.toLowerCase());
        System.out.println("Texto en mayuscula: "+texto.toUpperCase());
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            boolean letraMinuscula = Character.isLowerCase(letra);
            boolean letraMayuscula = Character.isUpperCase(letra);
            if (letraMinuscula) {
                contador1++;
            } else if (letraMayuscula) {
                contador2++;
            }
        }
        System.out.println("Cantidad de caracteres en minusculas: " + contador1);
        System.out.println("Cantidad de caracteres en mayusculas: " + contador2);
    }
	
	public static void main(String[] args) {
		String palabra = ingresarTexto();
        procesarTexto(palabra);
	}
}