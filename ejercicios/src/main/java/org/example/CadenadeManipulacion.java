package org.example;

import java.util.Scanner;

public class CadenaManipulacion {

    // Método (1): Convierte una cadena a mayúsculas
    public static String pasarAMayusculas(String cadena) {
        return cadena.toUpperCase();  // Retorna la cadena en mayúsculas
    }

    // Método (2): Cuenta las vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();  // Convertimos la cadena a minúsculas para simplificar la comparación
        // Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            // Verificar si el carácter es una vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;  // Devuelve el número de vocales
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();  // Leer la cadena ingresada por el usuario

        // Llamar al método para convertir la cadena a mayúsculas
        String mayusculas = pasarAMayusculas(texto);
        System.out.println("La cadena en mayúsculas es: " + mayusculas);

        // Llamar al método para contar las vocales en la cadena convertida a mayúsculas
        int numeroVocales = contarVocales(mayusculas);
        System.out.println("La cantidad de vocales en la cadena en mayúsculas es: " + numeroVocales);


    }
}
