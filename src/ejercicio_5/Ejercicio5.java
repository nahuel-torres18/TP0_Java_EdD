package ejercicio_5;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
	public static int solicitarLongitud(Scanner input) {
        int longitud;
        while (true) {
            try {
                System.out.print("Ingrese la longitud de la contraseña: ");
                longitud = input.nextInt();
                if (longitud <= 0) {
                    System.out.println("La longitud no puede ser negativa o cero. Vuelva a intentarlo");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("¡Error! El valor debe ser un numero");
                input.next();
            }
        }
        return longitud;
    }
    public static boolean solicitarInclusion(Scanner input, String mensaje) {
        System.out.println(mensaje);
        System.out.print("¿La contraseña tendra " + mensaje +"? (true/false): ");
        boolean verdad = input.nextBoolean();
        if (verdad) {
            return verdad;
        } else {
            return verdad;
        }
    }

    public static void generarContraseña(int longitud, boolean mayusculas, boolean minusculas, boolean numeros, boolean caractEspeciales) {
        String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnñopqrstuvwxyz";
        String numero = "0123456789";
        String espec = "!@#$%^&*()-_=+[]{}|;:'\";,.<>?/";

        String caracteres = "";
        Random random = new Random();

        if (mayusculas) {
            caracteres += mayus;
        }
        if (minusculas) {
            caracteres += minus;
        }
        if (numeros) {
            caracteres += numero;
        }
        if (caractEspeciales) {
            caracteres += espec;
        }

        if (caracteres.isEmpty()) {
            caracteres = mayus+minus+numero+espec;
        }

        StringBuilder contraseña = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(index));
        }
        System.out.println(contraseña);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int longitud = solicitarLongitud(input);
        boolean mayusculas = solicitarInclusion(input, "mayusculas");
        boolean minusculas = solicitarInclusion(input, "minusculas");
        boolean numeros = solicitarInclusion(input, "numeros");
        boolean caractEspeciales = solicitarInclusion(input, "caracteres especiales");
        generarContraseña(longitud, mayusculas, minusculas, numeros, caractEspeciales);
        input.close();
    }
}
