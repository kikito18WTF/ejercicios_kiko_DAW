package org.example;

import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial(){

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ",bienvenido a " + curso);
        

        int num1 = 0;
        int num2 = 0;

        while (num1==num2){
            System.out.println("Introdcuce un numero: ");
            num1 = entrada.nextInt();


            System.out.println("Introdcuce un segundo numero: ");
            num2 = entrada.nextInt();

          if (num1==num2){
              System.out.println("ERROR. Los numros son iguales. ");
          }


        }

            int resultado = num1 + num2;
            System.out.println("El resultado de la suma es " + resultado);





    }

}
