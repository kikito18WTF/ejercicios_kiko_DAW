package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial() {

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ",bienvenido a " + curso);


        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {
            System.out.println("Introdcuce un numero: ");
            num1 = entrada.nextInt();


            System.out.println("Introdcuce un segundo numero: ");
            num2 = entrada.nextInt();

            if (num1 == num2) {
                System.out.println("ERROR. Los numros son iguales. ");
            }


        }

        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);


    }


    public void actividad_1() {
        System.out.println("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if (num > 0) {
            System.out.println("Tu numero es positivo");
        }
        else if (num < 0) {
            System.out.println("Tu numero es negativo");
        }
        else {
            System.out.println("El 0 es natural");
        }

    }

    public void actividad_2() {
        System.out.println("Introduce primer numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");

        int num2 = entrada.nextInt();

        if (num1>num2){
                System.out.println("El" + num1 + "es mayor que el" + num2);
        }
        else if (num1<num2) {
                System.out.println("El" + num1 + "es meor que el" + num2);
        }
        else {
            System.out.println("ERROR:los numeros introducidos son iguales");
        }


    }

    public void control_excepciones() {
        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean error = true;

        while (error==true){

            try {
                System.out.println("Introduce un numero");
                numero = entrada.nextInt();
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("RROR. Introduce un valor valido");
                entrada.nextLine();
            }
        }
    }

    public void actividad_3() {

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float resultado;
        int aux = 0;

        while (aux==0){

            try {
                System.out.println("Introduce un divideno");
                num1 = entrada.nextInt();

                System.out.println("Introduce un divisor");
                num2 = entrada.nextInt();
                aux = 1;
            }catch (InputMismatchException er){
            System.out.println("ERROR. Introduce un valor valido");
        }
     }
        if (num2==0){
            System.out.println("El divisor no puede ser 0");

        }else {
            resultado = (num1/num2);
            System.out.println("El resultado es " + resultado);
        }
    }

    public void actividad_4() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor b: ");

        int num1 = entrada.nextInt();

        if (num1 < 0){
            System.out.println("El valor de la base tiene que ser positivo");
        }
        System.out.println("Introduce el valor h: ");
        int num2 = entrada.nextInt();

        if (num2 < 0){
            System.out.println("El valor de la altura tiene que ser positivo");
        }

        int multiplicar = num1 * num2;
        int resultado =   multiplicar / 2;

        System.out.println("El area del triangulo es " + resultado);

    }

    public void actividad_5() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce primer numero: ");

        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero:");

        int num2 = entrada.nextInt();

        System.out.println("Introduce el tercer numero: ");

        int num3 = entrada.nextInt();

        if (num1 == num2 | num2 == num3 | num1 == num3) {
            System.out.println("ERROR");

        } else {
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("El" + num1 + "es mayor que el" + num2 + "y" + num3);

                }
                if (num2 > num1) {
                    if (num2 > num3) {
                        System.out.println("El" + num2 + "es mayor que el" + num1 + "y" + num3);

                    }

                }
                if (num3 > num1) {
                    if (num3 > num2) {
                        System.out.println("El" + num3 + "es mayor que el" + num2 + "y" + num1);

                    }
                }


            }
        }
    }
        public void practica3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Como te llamas: ");
        String nombre = entrada.next();

        int edad = -1;
        int edad2 = 18;
        int resultado = edad2 - edad;

        while (edad < 0){
            try {
                System.out.println("Hola " + nombre+ ". Introduce tu edad: ");
               edad = entrada.nextInt();


            }catch (InputMismatchException er){
                System.out.println("ERROR. Introduce de nuevo la edad: ");
                entrada.nextLine();

            }
        }

        if (edad2>edad){
            System.out.println("Lo siento " + nombre+ ". No puedes votar. Te faltan " + resultado+ " años para ser mayor de edad");
        }else if (edad2<=edad){
            System.out.println("Enhorabuena " + nombre+ ". Puedes votar.");
        }

        }

        public void practica4() {

            Scanner entrada = new Scanner(System.in);
                    int num1 = 0;
                    int num2 = 0;
                    boolean entradaValida = false;

                    while (!entradaValida) {
                        try {
                            System.out.print("Introduce el multiplicando (3 cifras): ");
                            num1 = entrada.nextInt();

                            System.out.print("Introduce el multiplicador (3 cifras): ");
                            num2 = entrada.nextInt();

                            if (num1 <= 0 || num2 <= 0) {
                                System.out.println("Error: Los números no pueden ser negativos ni cero. Inténtalo de nuevo.");
                            } else {
                                entradaValida = true;
                            }

                        } catch (InputMismatchException er) {
                            System.out.println("Error: Debes introducir un número entero. Inténtalo de nuevo.");
                            entrada.next();
                        }
                    }

                    String num2C = Integer.toString(num2);
                    String num2_C1 = num2C.substring(0, 1);
                    String num2_C2 = num2C.substring(1, 2);
                    String num2_C3 = num2C.substring(2, 3);

                    int num2_1 = Integer.parseInt(num2_C1);
                    int num2_2 = Integer.parseInt(num2_C2);
                    int num2_3 = Integer.parseInt(num2_C3);

                    int resultado = num1 * num2;
                    int resultado1 = num2_1 * num1;
                    int resultado2 = num2_2 * num1;
                    int resultado3 = num2_3 * num1;

                    System.out.println("El producto de la multiplicación es: " + resultado);
                    System.out.println("El proceso es:");
                    System.out.println(" " + num1);
                    System.out.println("x " + num2);
                    System.out.println("--------");
                    System.out.println(resultado3);
                    System.out.println(resultado2 + "x");
                    System.out.println(resultado1 + "xx");
                    System.out.println("--------");
                    System.out.println(resultado);
                }
}


