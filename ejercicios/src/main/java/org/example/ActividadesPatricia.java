package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ActividadesConPatri {

    static   Scanner entrada = new Scanner(System.in);
    static char palabra_vector[];





     public static void main(String[] args) {
        menu();


    }

    public static void menu() {


        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1. Digitos ");
        System.out.println("2. Potencias");
        System.out.println("3. Del Revés");
        System.out.println("4. Binario");
        System.out.println("5. a binario");
        System.out.println("6. Orden alfabético");
        System.out.println("7. Mostrar suma");
        System.out.print("Ingrese una opción: ");

        opcion();

    }

    public static void opcion () {


        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                int num = entrada.nextInt();
                if (num==0){
                    System.out.println("1");
                }else {
                    System.out.println(digitos(num));
                }
                salir();
                break;
            case 2:
                int base = entrada.nextInt();
                int expo = entrada.nextInt();
                if (expo==0){
                    System.out.println("1");
                } else if (expo==1) {
                    System.out.println(base);
                }else {
                    System.out.println(potencias(base,expo));
                }
               salir();
                break;
            case 3:
                System.out.println("Elige:");
                System.out.println("[N]umero");
                System.out.println("[C]aracter");
                String resp = entrada.next().toUpperCase();
                if (resp.equals("N")){
                    int numero = entrada.nextInt();
                    if (numero < 10){
                        System.out.println(numero);
                    }else {
                        delreves(numero);
                    }
                } else if (resp.equals("C")) {
                    System.out.println("Introduce tu palabra:");
                    palabra_vector= entrada.next().toCharArray();
                    int larg = palabra_vector.length;
                    del_reves_texto(larg-1);
                }else {
                    System.out.println("No");
                }


                System.out.println();
               salir();
                break;
            case 4:
                System.out.println("Introduce un numero: ");
                int numero= entrada.nextInt();
                if (binario(numero)){
                    System.out.println("Es binario");
                }else {
                    System.out.println("No es binario");

                }
                salir();
                break;
            case 5:
                System.out.println("Dime un numerico: ");
                int numero2 = entrada.nextInt();
                System.out.println(abinario(numero2));
                break;
            case 6:
                System.out.println("Introduce una palabra: ");
                String palabra = entrada.next();

                palabra_vector = palabra.toCharArray();

                if (ordenalfabetico(0)){
                    System.out.println("La palabra "+ palabra+ " esta ordenada");
                }else{
                    System.out.println("La palabra "+ palabra + " no esta ordenada");
                }
                salir();

                break;
            case 7:
                suma();

                break;
            case 0:
                return;
            default:
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
        }
    }

        public static void salir () {


                System.out.println("Elige una opción:");
                System.out.println("[M] Volver al menú principal ");
                System.out.println("[X] Salir: ");
               String respuesta = entrada.next().toUpperCase();

                if (respuesta.equals("M")) {
                    menu();
                } else if (respuesta.equals("X")) {
                    System.out.println("Saliendo del programa...");
                } else {
                    System.out.println("Opción no válida. Por favor, ingrese 'M' para volver al menú principal o 'X' para salir.");
                }

        }


    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }



    public static int digitos(int numero){
            if (numero<10){
                return 1;
            }

            return 1 + digitos(numero/10);
    }

    public static int potencias(int base, int exponente) {
         if (exponente<2){
             return base;
         }

         return base*potencias(base,exponente-1);
    }

    public static void delreves(int numero){
        if (numero<10){
            System.out.print(numero);
        }else{
            System.out.print(numero%10);
            delreves(numero/10);
        }

    }

    public static  void del_reves_texto(int posicion){

         if (posicion==0){
             System.out.print(palabra_vector[posicion]);
         }else {
             System.out.print(palabra_vector[posicion]);
             del_reves_texto(posicion-1);
         }
    }
    public static boolean binario(int numero){

         if (numero > 9){

             if (numero%10==0 || numero%10==1){
                 return binario(numero/10);
             }else {
                 return false;
             }
         }

         if (numero==0 || numero==1){
             return true;
         }else{
             return false;
         }
    }

    public static String abinario(int numero){

        if (numero==0 || numero==1){
            return Integer.toString(numero);
        }else {
            return abinario(numero/2)+numero%2;
        }
    }

    public static boolean ordenalfabetico(int posicion) {

         if (posicion< palabra_vector.length-1){
             if (palabra_vector[posicion]<=palabra_vector[posicion+1]){
                 return  ordenalfabetico(posicion+1);
             }else {
                 return false;
             }
         }

         return true;
    }
    public static void suma(){

    }
}

