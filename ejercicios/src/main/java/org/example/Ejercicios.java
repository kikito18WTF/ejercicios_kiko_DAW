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

    public void caracteres() {

        String frase = "No me porto mal en clase y no lo reconozco. ";

        int tamnayo = frase.length();

        System.out.println("El tamaño de la frase es " + tamnayo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posicion 33 es " + letra);

        String palabra = frase.substring(9,12);
        System.out.println("La palabra con substring es "+ palabra);

        String palabra2 = "Parte. ";
        String concatenacion = frase.concat(palabra2);
            System.out.println(" La concatenacion de la frase con la palabra " + palabra2 + " es " + concatenacion);

           int posicion = concatenacion.indexOf(palabra2);
            System.out.println("La palabra  " + palabra2+ "esta en la posicion " + posicion);

            int posicion2 = concatenacion.indexOf("no",  8);
            System.out.println(" La posicion de la palabra no si no tenemos en cuenta la 8 primeras posiciones es " +posicion2  );

            int posicion3 = concatenacion.lastIndexOf("no");
            System.out.println(" =La posicion de la ultima aparacion de la palabra no es "+ posicion3 );

            String mayusculas = frase.toUpperCase();
            String minuscuñlsa = frase.toLowerCase();
            System.out.println(mayusculas + minuscuñlsa );

            String nombre = "Patricia               ";
             nombre = nombre.trim();
            System.out.println(" Tu nombre sin espacios es " +nombre );

            String remplazar = frase.replace("mal", "bien");
            System.out.println( remplazar);

            String palabra3 = "hola";
            String palabra4 = "HOLA";

            if (palabra3.equals(palabra4)==true){

                System.out.printf("Son iguales");

            }else {
                System.out.printf("Son distintos");
            }

            String palabra5 = "hola";
            String palabra6 = "HOLA";

            if (palabra5.equalsIgnoreCase(palabra6)==true){

                System.out.printf("Son iguales");

            }else {
                System.out.printf("Son distintos");
            }



        }

        public void ejer1und4(){

        String frase = "Prueba ejercicios caracteres";

        int longitud = frase.length();

            System.out.println("La longitud de la frase es "+ longitud);

            String remplazar = frase.replace(" " , "");
            System.out.println(remplazar);

            String mitad1 = frase.substring(0,13);
            String mitad2 = frase.substring(14,28);
            System.out.println("La primera mitad de texto es " + mitad1 + " y la segunda mitad es " + mitad2);

            String mayus = frase.toUpperCase();
            System.out.println(mayus);


        }

        public void ejer2und4() {


         String comida1 = "magadalena";
         String comida2 = "galletas";

         int palabra = comida1.length();
            System.out.println("La palabra magdalena tiene " + palabra+ " caracteres");
         int palabra2 = comida2.length();
            System.out.println("La palabra galletas tiene " + palabra2+ " caracteres");


            if (comida1.equals(comida2)==true){

                System.out.println("Son iguales");

            }else {
                System.out.println("Son distintos");
            }

            if (palabra>palabra2){
                System.out.println("La palabra "+ comida1 + " tiene mas caracteres que la palabra "+ comida2);
            }else {
                System.out.println("La palabra "+ comida2 + " tiene mas caracteres que la palabra "+ comida1);
            }



        }

        public void ejer3und4(){


            Scanner entrada = new Scanner(System.in);

            boolean err = true;
            int n= 0;
            int m = 0;


            while (err) {

                try {

                    System.out.println("Introduce un numero:");
                     n = entrada.nextInt();


                    System.out.println("Introduce otro numero para quitar las ciras al anterior:");

                     m = entrada.nextInt();

                     if (n>m){
                         err=false;
                     }else{
                         System.out.println("No se pueden quitar mas cifras de las que hay");
                     }

                } catch (InputMismatchException e) {
                    System.out.println("El formato no es el correcto");
                    entrada.nextLine();
                }
            }

            String n_string = Integer.toString(n);

            int tamanyo = n_string.length();

            n_string = n_string.substring(0, tamanyo-m);

            System.out.println("El numero sin las" + m+ "cifras es "+ n_string);


        }

        public void ejer4und4(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();

        frase = " " + frase + " ";
        frase = frase.replace("." , " ");
        frase = frase.toLowerCase();
        System.out.println("Introduce una subcadena: ");
        String subcadena = entrada.nextLine();
        subcadena = " " + subcadena + " ";


        int fraselength = frase.length();

        int frasesinsubcadena = frase.replace(subcadena, "").length();

        int division = (fraselength - frasesinsubcadena) / subcadena.length();
            System.out.println(division);
        }
      public void nuevas_excepciones (){

        Scanner entrada = new Scanner(System.in);

            System.out.println("BIENVENIDO A LA CLASIFICACIONN DE GENERACIONES");
            System.out.println("ELIGE UN MDOO");
            System.out.println("1. AÑO DE NACIMIENTO");
            System.out.println("2. EDAD");

            String modo = entrada.next();

            LocalDateTime hoy = LocalDateTime.now();
            int anyo_actual = hoy.getYear();
            int anyo_nacimiento = 1800;

            boolean error = false;

            if (modo.equals("1")){

                System.out.println("Introduce año de nacimiento: ");
                String anyo = entrada.next();


               try {
                   anyo_nacimiento = Integer.parseInt(anyo);
               }catch (NumberFormatException e1){
                   System.out.println("El formato del año no es correcto" + e1.getMessage());
                   error=true;
               }

                if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual){
                    System.out.println("El año introducido no es correcto");
                    error=true;
                }

            } else if (modo.equals("2")) {
                System.out.println("Introduce tu edad");
               int edad = 0;

               if (entrada.hasNextInt()){
                   edad = entrada.nextInt();
               }else {
                   System.out.println("El formato de la edad es incorrecto");
                   error=true;
               }

                if (edad < 0){
                    System.out.println("La edad introducida no es correcta");
                    error=true;
                }else {
                    anyo_nacimiento = anyo_actual - edad;

                }

            }else {
                System.out.println("Eres tonto");
                error=true;
            }
            if (!error){
                if (anyo_nacimiento>=1900 && anyo_nacimiento<=1927){
                    System.out.println("Eres de la generacion fosil");
                } else if (anyo_nacimiento>=1928 && anyo_nacimiento<=1944) {
                    System.out.println("Eres de la generacion Silent");

                } else if (anyo_nacimiento>=1945 && anyo_nacimiento<=1964) {
                    System.out.println("Eres de la generacion baby boommer");
                } else if (anyo_nacimiento>=1965 && anyo_nacimiento<=1981) {
                    System.out.println("XXX");
                } else if (anyo_nacimiento>=1982 && anyo_nacimiento<=1994) {
                    System.out.println("Peor");
                } else if (anyo_nacimiento>=1995 && anyo_nacimiento<=anyo_actual) {
                    System.out.println("La mejor generacion");
                }else {
                    System.out.println("No tienes generacion");
                }
            }


        }

     public void numerodelasuerte () {

            Scanner entrada = new Scanner(System.in);

            try {
                System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
                String fecha = entrada.nextLine();


                if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                    System.out.println("Formato de fecha incorrecto. Usa dd/mm/aaaa.");
                } else {
                    try {
                        int dia = Integer.parseInt(fecha.substring(0, 2));
                        int mes = Integer.parseInt(fecha.substring(3, 5));
                        int anio = Integer.parseInt(fecha.substring(6, 10));


                        int sumaTotal = dia + mes + anio;
                        System.out.print(dia + " + " + mes + " + " + anio + " = " + sumaTotal + "\n");


                        int numeroDeLaSuerte = sumaTotal;
                        int sumaCifras = 0;


                        while (numeroDeLaSuerte > 0) {
                            sumaCifras += numeroDeLaSuerte % 10;
                            numeroDeLaSuerte /= 10;
                        }

                        System.out.print("Sumando las cifras de " + sumaTotal + ": ");
                        System.out.print(sumaTotal + " = ");
                        System.out.println(sumaCifras);
                        System.out.println("Número de la suerte: " + sumaCifras);
                    } catch (NumberFormatException e) {
                        System.out.println("Error al convertir los valores. Asegúrate de que la fecha esté en el formato correcto.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error en la entrada. Por favor, ingresa la fecha correctamente.");
            }
        }
     public void calculadora (){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a tu calculadora");

        try {

            System.out.print("Ingrese el primer operando (int): ");
            int operando1 = entrada.nextInt();


            System.out.print("Ingrese el signo de la operación (+, -, /, x, R): ");
            String operador = entrada.next();


            int operando2 = 0;


            if (!operador.equalsIgnoreCase("R")) {
                System.out.print("Ingrese el segundo operando (int): ");
                operando2 = entrada.nextInt();
            }


            double resultado = 0;
            boolean operacionValida = true;


            switch (operador) {
                case "+":
                    resultado = operando1 + operando2;
                    break;
                case "-":
                    resultado = operando1 - operando2;
                    break;
                case "/":
                    if (operando2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                        operacionValida = false;
                    } else {
                        resultado = (double) operando1 / operando2;
                    }
                    break;
                case "x":
                    resultado = operando1 * operando2;
                    break;
                case "R":
                    if (operando1 < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        operacionValida = false;
                    } else {

                        double raizCuadrada = operando1 / 2;
                        System.out.println("Aproximación de la raíz cuadrada de " + operando1 + " es: " + raizCuadrada);
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    operacionValida = false;
                    break;
            }


            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Por favor, asegúrese de ingresar números enteros.");
        }

    }

     public void bucles1 (){

        Scanner entrada = new Scanner(System.in);

        String psw = "entornos";
        String psw_ususario;
        do {
            System.out.println("Introduce tu contraseña: ");
            psw_ususario = entrada.next();

        }while (!psw_ususario.equals(psw));

        System.out.println("BIENVENIDO LUCAS");

    }

    public void bucles2 (){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numero = entrada.nextInt();

        for (int j=numero ;j>=1;j--){

            if (j%2==0){
                System.out.println(j);
        }

        }

    }

    public void bucles3 (){

      for (int i= 1 ; i <=50; i++ ){

          if (i%3==0){
              System.out.println(i + " ");
          }
      }

    }

        public void bucles4 (){

        Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce una palabra");
        String palabra = entrada.nextLine();

        for (int i=0 ; i <palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }


        }
        public void bucles5 (){

        Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce un numero");

            int numero = entrada.nextInt();

            for (int i=1 ; i <=10 ; i++ ){

                int resultado = numero * i;
                System.out.println(resultado);
            }


        }
    public void isbn () {
    Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un ISBN de 10 dígitos :");
        String isbn = entrada.nextLine();

        if (isbn.length() != 10) {
            System.out.println("El ISBN " + isbn + " no es válido (debe tener 10 dígitos).");
        } else {
            try {
                boolean error = false;

                if (isbn.contains("?")) {
                    int suma = 0;
                    int multiplicador = 10;
                    int posInterrogacion = -1;

                    for (int i = 0; i < 9; i++) {
                        char c = isbn.charAt(i);
                        if (Character.isDigit(c)) {
                            suma += (c - '0') * multiplicador;
                        } else if (c == '?') {
                            posInterrogacion = i;
                        } else {
                            System.out.println("El ISBN contiene caracteres inválidos.");
                            error = true;
                            break;
                        }
                        multiplicador--;
                    }

                    if (!error) {
                        char ultimoChar = isbn.charAt(9);
                        if (ultimoChar == 'X') {
                            suma += 10;
                        } else if (Character.isDigit(ultimoChar)) {
                            suma += (ultimoChar - '0');
                        } else if (ultimoChar == '?') {
                            posInterrogacion = 9;
                        } else {
                            System.out.println("El último carácter del ISBN es inválido.");
                            error = true;
                        }

                        if (!error) {
                            boolean repaired = false;
                            for (int i = 0; i <= 10; i++) {
                                int sumaTemporal = suma;
                                if (posInterrogacion < 9) {
                                    sumaTemporal += i * (10 - posInterrogacion);
                                } else {
                                    sumaTemporal += i;
                                }

                                if (sumaTemporal % 11 == 0) {
                                    System.out.println("El dígito faltante en el ISBN " + isbn + " es: " + i);
                                    repaired = true;
                                    break;
                                }
                            }

                            if (!repaired) {
                                System.out.println("No se pudo reparar el ISBN " + isbn + ".");
                            }
                        }
                    }
                } else {
                    int suma = 0;
                    int multiplicador = 10;
                    boolean isbnValido = true;

                    for (int i = 0; i < 9; i++) {
                        char c = isbn.charAt(i);
                        if (Character.isDigit(c)) {
                            suma += (c - '0') * multiplicador;
                            multiplicador--;
                        } else {
                            System.out.println("El ISBN contiene caracteres inválidos.");
                            isbnValido = false;
                            break;
                        }
                    }

                    if (isbnValido) {
                        char ultimoChar = isbn.charAt(9);
                        if (ultimoChar == 'X') {
                            suma += 10;
                        } else if (Character.isDigit(ultimoChar)) {
                            suma += (ultimoChar - '0');
                        } else {
                            System.out.println("El último carácter del ISBN es inválido.");
                            isbnValido = false;
                        }

                        if (isbnValido && suma % 11 == 0) {
                            System.out.println("El ISBN " + isbn + " es válido.");
                        } else if (isbnValido) {
                            System.out.println("El ISBN " + isbn + " no es válido.");
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


    
    }
}


