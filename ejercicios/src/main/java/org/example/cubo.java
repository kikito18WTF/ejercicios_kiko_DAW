package org.example;

import java.util.Scanner;

public class cubo {

    // Método que calcula el cubo de un número
    public static int calcularCubo(int n) {
        return n * n * n;  // Devuelve el cubo de n
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();  // Leer el número ingresado por el usuario

        // Llamar al método calcularCubo y almacenar el resultado
        int cubo = calcularCubo(numero);

        // Imprimir el resultado
        System.out.println("El cubo de " + numero + " es: " + cubo);


    }
}
